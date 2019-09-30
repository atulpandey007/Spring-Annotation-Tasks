package com.stackroute;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(value = "Init")
    public com.stackroute.BeanLifeCycleDemo Init(){




        com.stackroute.BeanLifeCycleDemo beanLifeCycleDemo = new com.stackroute.BeanLifeCycleDemo();



        return beanLifeCycleDemo;
    }

    @Bean(value = "destroy")



    public com.stackroute.BeanLifeCycleDemo destroy(){





        com.stackroute.BeanLifeCycleDemo beanLifeCycleDemo = new com.stackroute.BeanLifeCycleDemo();





        return beanLifeCycleDemo;
    }

}