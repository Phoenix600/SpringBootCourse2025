package com.example12.beans;

import org.springframework.stereotype.Component;

/**
 * Here I'm using stereotype component annotation to convert POJO into spring bean.
 */
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello()
    {
        System.out.println("Printing Hello From Component Vehicle Bean");
    }
}
