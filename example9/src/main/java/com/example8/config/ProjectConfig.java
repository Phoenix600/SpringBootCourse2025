package com.example8.config;

import com.example8.beans.Person;
import com.example8.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Spring @Configuration annotation is a part of spring core framework.
 * Spring Configuration annotation indicates that the class has @Bean definition
 * methods. So Spring container can process the class and generate spring beans to
 * be used in the application.
 * -
 * To Tell Spring it needs to search for classes annotated
 * with stereotype annotation, we use the @ComponentScan annotation over
 * the configuration class
 */
@Configuration
public class ProjectConfig
{
    @Bean
    Vehicle vehicle()
    {
        Vehicle myVehicle = new Vehicle();
        myVehicle.setName("Toyota");
        return myVehicle;
    }

    @Bean
    Person person()
    {
        Person myPerson = new Person();
        myPerson.setName("Steve");
        myPerson.setVehicle(vehicle());
        return myPerson;
    }

}
