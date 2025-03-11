package com.example12.implementation;

import com.example12.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component("michelinTyre")
public class MichelinTyre implements Tyre
{
    @Override
    public void rotate()
    {
        System.out.println("Michelin Tyre");
    }
}
