package com.example12.beans;

import com.example12.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    private VehicleServices services;

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

    @Autowired
    public void setServices(VehicleServices vehicleServices)
    {
        this.services = vehicleServices;
    }

    public void startCar()
    {
        System.out.println("Starting My Car With ");
        this.services.playMusic();
        this.services.startJourney();
    }

}
