package com.example10.config;

import com.example10.beans.Person;
import com.example10.beans.Vehicle;
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

    /**
     * Here in the below code, we are trying to wire or establish a relationship between Person
     * and Vehicle, by passing the vehicle as a method parameter to the person() bean method.
     *-
     * Spring injects the vehicle bean to the person bean using the Dependency Injection. Spring will
     * make sure to have only 1 vehicle bean is created and also vehicle bean will be created first
     * always as person bean has dependency on it.
     */
    @Bean
    Person person(Vehicle vehicle)
    {
        Person myPerson = new Person();
        myPerson.setName("Steve");
        myPerson.setVehicle(vehicle);
        return myPerson;
    }

}
