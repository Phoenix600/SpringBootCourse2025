package com.example12.beans;

import com.example12.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person
{
    private String name = "Steve";

    private Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    /**
     * The @Autowired annotation can be marked on field, constructor, setter method inorder
     * to auto-wire the beans that is `Injecting Beans (Objects)` at runtime by
     * Spring Dependency Injection mechanism.
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVehicle(Vehicle vehicle) {
        System.out.println("SetVehicle Method called...");
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
