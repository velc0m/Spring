package part3.framework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * Created by Litvv on 19.07.2016.
 */
@Component
public class WarningBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition(beanDefinitionName);
            String destroyMethodName = beanDefinition.getDestroyMethodName();
            if (destroyMethodName != null && beanDefinition.isPrototype()) {
                System.out.println("Warning! Destroy method " + destroyMethodName + " will not work with bean " + beanDefinitionName);
            }
        }
    }
}
