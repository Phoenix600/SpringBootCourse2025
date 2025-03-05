package com.example10.main;

import com.example10.beans.Person;
import com.example10.beans.Vehicle;
import com.example10.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example10 {

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
