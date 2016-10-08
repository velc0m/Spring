package part3.framework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LitVV on 13.07.2016.
 */
@Component
public class BenchMarkBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    private ConfigurableListableBeanFactory factory;

    public Object postProcessBeforeInitialization(final Object bean, String beanName) throws BeansException {
        return bean;
    }

    public Object postProcessAfterInitialization(final Object bean, final String beanName) throws BeansException {

        Map<String, Class> map = new HashMap<String, Class>();

        //Вместо MAP в TransactionBeanPostProcessor
        //Class<?> clazz = bean.getClass();

        BeanDefinition beanDefinition = factory.getBeanDefinition(beanName);
        String originalClass = beanDefinition.getBeanClassName();
        try {
            map.put(originalClass, Class.forName(originalClass));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Когда аннтотация Benchmark должна стоять над методами
        Method[] methods = map.get(originalClass).getMethods();
        boolean benchmarkFound = false;
        for (Method method : methods) {
            if (method.isAnnotationPresent(BenchMark.class)) {
                benchmarkFound = true;
                break;
            }
        }

        if (benchmarkFound) {
            final Class originClass = map.get(originalClass);
            Object proxy = Proxy.newProxyInstance(originClass.getClassLoader(), originClass.getInterfaces(), new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                    Method originalClassMethod = originClass.getMethod(method.getName(), method.getParameterTypes());
                    //Если method.isAnnotationPresent(BenchMark.class) то не сработает, т.к. в интерфейсе нет нашей аннтоации, она есть в оригинальном классе!!!
                    if (originalClassMethod.isAnnotationPresent(BenchMark.class)) {
                        long before = System.nanoTime();
                        Object retVal = method.invoke(bean, args);
                        long after = System.nanoTime();
                        System.out.println("Time - " + (after - before));
                        return retVal;
                    } else {
                        return method.invoke(bean, args);
                    }
                }
            });
            return proxy;
        }
        return bean;
    }
}
