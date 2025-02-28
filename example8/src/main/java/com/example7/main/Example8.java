package com.example7.main;

import com.example7.beans.Vehicle;
import com.example7.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example8 {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("beans.xml");

        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
        System.out.println("Vehicle Name From Spring Context Is : " + vehicle.getName());

    }
}
