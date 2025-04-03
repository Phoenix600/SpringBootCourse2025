package com.example15.services;

import com.example15.controller.StudentDetailsController;
import com.example15.domain.StudentDetails;
import com.example15.repository.StudentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * File Name: StudentDetailsSerice.java
 * Entity: StudentDetailsSerice
 * Package: com.example15.services
 * Author: pranayramteke
 * Date: 02/04/25
 * Description:
 */

@Service
public class StudentDetailsService
{
	@Autowired
	StudentDetailsRepository repository;
	
	// Save The Java StudentDetails Object Into Database table
	public StudentDetails save(StudentDetails studentDetails)
	{
		StudentDetails savedStudent =  repository.save(studentDetails);
		return savedStudent;
	}
	
	public StudentDetails update(Long id, StudentDetails studentDetails)
	{
		
		// select * from student_details where id= 3;
		Optional<StudentDetails> studentOptional =  repository.findById(id);
		
		if(studentOptional.isPresent())
		{
			StudentDetails student = studentOptional.get();
			
			String newEmail = studentDetails.getEmail();
			student.setEmail(newEmail);
			
			String newFirstName = studentDetails.getFirstName();
			student.setFirstName(newFirstName);
			
			String newLastName = studentDetails.getLastName();
			student.setLastName(newLastName);
			
			student =  repository.save(student);
			return student;
		}
		
		return null;
	}
	
}
