package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address){// record eliminates the need to make setters and getters-- theyre automatically created
//constructor
};
record Address(String firstLine, String city){

};

@Configuration
public class HelloWorldConfiguration { //define spring beans in here
    //declaring this class corresponds to step 2 in the App02HelloWorldSpring class

    @Bean
    public String name(){
        return "Xylea";
    }

    @Bean
    public int age(){
        return 17;
    }

    @Bean
    public Person person(){
    return new Person("Smithi", 17, new Address("Main Street", "Boston"));
    }
    @Bean
    public Person person2methodcall(){ //using method calls
        return new Person(name(), age(), address()); //using exisiting beans to create a new bean, person2methodcall
    }
    @Bean
    public Person person3parameters(String name, int age, Address address2){ //name, age, address2
        return new Person(name, age, address2); //using exisiting beans to create a new bean, person2methodcall
    }
    @Bean
    public Address address(){
        return new Address("102 Princeton Road", "Philadelphia");
    }
}
