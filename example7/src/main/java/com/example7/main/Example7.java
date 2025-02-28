package com.example7.main;

import com.example7.beans.Vehicle;
import com.example7.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example7 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Supplier<Vehicle> volkswagenSupplier = new Supplier<Vehicle>() {
            @Override
            public Vehicle get() {
                Vehicle vehicle =  new Vehicle();
                vehicle.setName("Volkswagen");
                return  vehicle;
            }
        };

        Supplier<Vehicle> audiSupplier = new Supplier<Vehicle>() {
            @Override
            public Vehicle get() {
                Vehicle vehicle1 =  new Vehicle();
                vehicle1.setName("Audi R8");
                return vehicle1;
            }
        };

        Random random = new Random();
        int randomNumber = random.nextInt(1000) ;

        System.out.println("Random Number Is : " + randomNumber);

        if(randomNumber%2 == 0)
        {
            context.registerBean("volkswagen", Vehicle.class,volkswagenSupplier);
        }
        else
        {
            context.registerBean("audi", Vehicle.class,audiSupplier);
        }

        Vehicle volkswagenVehicle = null;
        Vehicle audiVehicle       = null;

        try
        {
            audiVehicle = context.getBean("audi", Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException e)
        {
            System.out.println("Error While Creating The Audi Bean");
        }


        try
        {
            volkswagenVehicle =  context.getBean("volkswagen", Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException e)
        {
            System.out.println("Error While Creating Volkswagen Bean");
        }

        if(volkswagenVehicle != null)
        {
            System.out.println("Programming Vehicle Name From Spring Context Is : " + volkswagenVehicle.getName());
        }
        else
        {
            System.out.println("Programming Vehicle Name From Spring Context Is : " + audiVehicle.getName());
        }

    }
}
