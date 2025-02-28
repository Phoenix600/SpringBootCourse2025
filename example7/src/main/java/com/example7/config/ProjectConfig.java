package com.example7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


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
@ComponentScan(basePackages = "com.example7.beans")
public class ProjectConfig
{

}
