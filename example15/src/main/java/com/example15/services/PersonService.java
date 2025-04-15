package com.example15.services;


import com.example15.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService
{
	@Autowired
	PersonRepository personRepository;
}

