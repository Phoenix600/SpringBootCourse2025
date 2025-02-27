package com.example4.main;

import com.example4.beans.Vehicle;
import com.example4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle Name From Spring Context Is : " + vehicle.getName());

    }
}
