package com.example12.main;

import com.example12.beans.Person;
import com.example12.beans.Vehicle;
import com.example12.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13 {

    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);

        Vehicle myVehicle =  person.getVehicle();
        myVehicle.startCar();
    }
}
