package com.example3.main;

import com.example2.beans.Vehicle;
import com.example2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1  =  context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Vehicle Name From Spring Context Is : " + veh1.getName());

        Vehicle veh2  =  context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Vehicle Name From Spring Context Is : " + veh2.getName());

        Vehicle veh3  =  context.getBean("mercedesVehicle",Vehicle.class);
        System.out.println("Vehicle Name From Spring Context Is : " + veh3.getName());
    }
}
