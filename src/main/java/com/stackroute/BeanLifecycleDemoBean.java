package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
class BeanLifeCycleDemo implements InitializingBean, DisposableBean {




    public static void main(String[] args) {
        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        factory.registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) factory.getBean("lifecycle");
    }
    @PostConstruct
    public void Init ()
    {
        System.out.println("Initialization");
    }
    public  void clean()
    {
        System.out.println("custom destroy");
    }
    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("After properties");
    }
}
