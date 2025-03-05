package com.example8.main;

import com.example8.beans.Person;
import com.example8.beans.Vehicle;
import com.example8.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example9 {

    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Person Name From Spring Context Is : " + person.getName());
        System.out.println("Vehicle Name From Spring Context Is : " + vehicle.getName());
        System.out.println("Vehicle That Person Owns Is : " + person.getVehicle().getName());
    }
}
