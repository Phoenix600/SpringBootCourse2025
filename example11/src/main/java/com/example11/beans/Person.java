package com.example11.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person
{
    private String name = "Steve";


//    @Autowired
    private Vehicle vehicle;

    /**
     * The @Autowired annotation can be marked on field, constructor, setter method inorder
     * to auto-wire the beans that is `Injecting Beans (Objects)` at runtime by
     * Spring Dependency Injection mechanism.
     */
    @Autowired
    public Person(Vehicle vehicle)
    {
        System.out.println("Person Constructor Called...");
        this.vehicle = vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Autowired
    public void setVehicle(Vehicle vehicle) {
        System.out.println("SetVehicle Method called...");
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
