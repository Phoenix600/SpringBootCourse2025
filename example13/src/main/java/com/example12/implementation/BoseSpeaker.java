package com.example12.implementation;

import com.example12.interfaces.Speaker;

public class BoseSpeaker implements Speaker
{

    @Override
    public void makeSound() {
        System.out.println("Bose Speaker");
    }
}
