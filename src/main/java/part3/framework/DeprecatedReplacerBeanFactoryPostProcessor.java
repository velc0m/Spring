package part3.framework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

import java.util.Map;

/**
 * Created by LitVV on 22.07.2016.
 */
public class DeprecatedReplacerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        //Этот вариант не работает!!!
        final Map<String, Object> beansWithAnnotation = beanFactory.getBeansWithAnnotation(MyDeprecated.class);
        for (Map.Entry<String, Object> entry : beansWithAnnotation.entrySet()) {
            final String beanName = entry.getKey();
            final Object beanObject = entry.getValue();

            final AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition(beanName);
            final MyDeprecated annotation = beanObject.getClass().getAnnotation(MyDeprecated.class);
            beanDefinition.setBeanClassName(annotation.newClass().getName());

            System.out.println("New bean - " + beanDefinition.getBeanClassName());
        }


        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition(beanDefinitionName);
            String originalClassName = beanDefinition.getBeanClassName();
            try {
                Class<?> originalClass = Class.forName(originalClassName);
                MyDeprecated annotation = originalClass.getAnnotation(MyDeprecated.class);
                if (annotation != null) {
                    beanDefinition.setBeanClass(annotation.newClass());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
