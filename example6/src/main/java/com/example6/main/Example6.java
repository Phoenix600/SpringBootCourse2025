package com.example6.main;

import com.example6.beans.Vehicle;
import com.example6.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6  {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle Name From Spring Context Is : " + vehicle.getName());
        vehicle.printHello();
        context.close();
    }
}
