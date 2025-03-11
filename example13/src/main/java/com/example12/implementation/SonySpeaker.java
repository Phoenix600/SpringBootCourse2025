package com.example12.implementation;

import com.example12.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component("sonySpeaker")
public class SonySpeaker implements Speaker
{
    @Override
    public void makeSound()
    {
        System.out.println("Sony Speaker");
    }
}
