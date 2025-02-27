package com.example5.main;

import com.example5.beans.Vehicle;
import com.example5.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle Name From Spring Context Is : " + vehicle.getName());

    }
}
