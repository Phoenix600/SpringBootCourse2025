package com.example12.config;

import com.example12.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


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
@ComponentScan(basePackages = "com.example12.beans")
public class ProjectConfig
{
    @Bean
    Vehicle vehicle1()
    {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Ferrari Italia 458");
        return vehicle;
    }

    @Bean
    Vehicle vehicle2()
    {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi R8");
        return vehicle;
    }

//    @Primary
    @Bean
    Vehicle vehicle3()
    {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda Civic With Laptop");
        return vehicle;
    }


}
