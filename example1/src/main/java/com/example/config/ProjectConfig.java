package com.example.config;


import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring @Configuration annotation is a part of spring core framework.
 * Spring Configuration annotation indicates that the class has @Bean definition
 * methods. So Spring container can process the class and generate spring beans to
 * be used in the application.
 */
@Configuration
public class ProjectConfig
{

    /**
     * For Beans, we will be following noun type of naming convention.
     * Usually we write beans with verb naming convention.
     * Spring @Bean Annotation, which lets Spring know that it needs to call
     * this method when it initializes it's context and adds the returned
     * value to the context.
     */
    @Bean
    Vehicle vehicle()
    {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi R8");
        return vehicle;
    }

    @Bean
    String hello()
    {
        return "Hello Spring Context";
    }

    @Bean
    Integer number()
    {
        return 11;
    }

}
