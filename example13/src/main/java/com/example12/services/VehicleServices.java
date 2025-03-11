package com.example12.services;

import com.example12.interfaces.Speaker;
import com.example12.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices
{
    public String name = "Vehicle Services";

    public Speaker speaker;

    public Tyre tyre;

    @Autowired
    public VehicleServices(Speaker speaker1,@Qualifier("michelinTyre") Tyre tyre1)
    {
        this.tyre = tyre1;
        this.speaker = speaker1;
    }


    public void playMusic()
    {
        speaker.makeSound();
    }

    public void startJourney()
    {
        tyre.rotate();
    }


}
