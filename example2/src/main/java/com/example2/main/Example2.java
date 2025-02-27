package com.example2.main;

import com.example2.beans.Vehicle;
import com.example2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle veh1  =  context.getBean(Vehicle.class);
        Vehicle veh1  =  context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle Name From Spring Context Is : " + veh1.getName());
    }
}
