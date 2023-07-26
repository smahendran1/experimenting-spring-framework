package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App02HelloWorldSpring {
    public static void main(String[] args) {
       //1.Launch a spring context:

       try(var context =
                   new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) //created a spring context using the configuration class
       {
           //2. configure the things that we want spring to manage -- by creating configuration class (helloworldconfiguration) using the @configuration annotation as well
           //in this same class, we also created a name method with the @bean annotation

           //step 3: retrieving beans managed by Spring
           System.out.println(context.getBean("name"));
           System.out.println(context.getBean("age"));
           System.out.println(context.getBean("person"));
           System.out.println(context.getBean("person2methodcall"));
           System.out.println(context.getBean("person3parameters"));
           System.out.println(context.getBean("address"));

       }

    }
}
