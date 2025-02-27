package com.example4.config;

import com.example4.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


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
    @Bean("ferrariVehicle")
    Vehicle vehicle1()
    {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Ferrari Italia 458");
        return vehicle;
    }

    @Bean("audiVehicle")
    Vehicle vehicle2()
    {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi R8");
        return vehicle;
    }

    /**
     * When you have multiple beans of the same kind inside the spring context, you
     * can make one of them primary by using @Primary annotation. Primary bean is the one
     * which Spring will choose if it has multiple options, and you don't specify  a name.
     * In other words, It is the default bean that Spring Context will consider in case of
     * confusion due to multiple beans of same type are present.
     */
    @Bean("mercedesVehicle")
    @Primary
    Vehicle vehicle3()
    {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("S-Class Maybach");
        return vehicle;
    }


}
