package com.example15.controller;

import com.example15.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * File Name: PersonController.java
 * Entity: PersonController
 * Package: com.example15.controller
 * Author: pranayramteke
 * Date: 15/04/25
 * Description:
 */

@RestController
@RequestMapping("/api/v1/person/")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
}


