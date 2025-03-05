package com.example12.main;

import com.example12.beans.Person;
import com.example12.beans.Vehicle;
import com.example12.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example12 {

    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println("Person Name From Spring Context Is : " + person.getName());
        System.out.println("Vehicle That Person Owns Is : " + person.getVehicle().getName());
    }
}
