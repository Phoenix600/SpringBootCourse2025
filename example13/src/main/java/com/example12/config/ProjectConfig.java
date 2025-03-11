package com.example12.config;

import com.example12.implementation.BoseSpeaker;
import com.example12.implementation.BridgeStoneTyre;
import com.example12.interfaces.Speaker;
import com.example12.interfaces.Tyre;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/**
 * Spring @Configuration annotation is a part of spring core framework.
 * Spring Configuration annotation indicates that the class has @Bean definition
 * methods. So Spring container can process the class and generate spring beans to
 * be used in the application.
 * -
 * To Tell Spring it needs to search for classes annotated
 * with stereotype annotation, we use the @ComponentScan annotation over
 * the configuration class
 */
@Configuration
@ComponentScan(
        basePackages = {
        "com.example12.beans",
        "com.example12.implementation",
        "com.example12.services"
})
public class ProjectConfig
{
    @Primary
    @Bean
    Speaker boseSpeaker()
    {
        return new BoseSpeaker();
    }

    @Bean
    Tyre bridgeStoneTyre()
    {
        return new BridgeStoneTyre();
    }


}
