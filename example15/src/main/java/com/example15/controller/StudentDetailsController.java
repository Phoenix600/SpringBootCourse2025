package com.example15.controller;

import com.example15.domain.StudentDetails;
import com.example15.services.StudentDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * File Name: StudentDetailsController.java
 * Entity: StudentDetailsController
 * Package: com.example15.controller
 * Author: pranayramteke
 * Date: 02/04/25
 * Description:
 */

@Slf4j
@RestController
@RequestMapping("/api/v1/studentDetails/")
public class StudentDetailsController
{
	@Autowired
	StudentDetailsService studentDetailsService;
	
	// GET http://localhost:8080/api/v1/studentDetails/all
	@GetMapping("all")
	List<StudentDetails> getAllStudentDetails()
	{
		log.info("getAllStudentDetails Info");
		log.error("getAllStudentDetails Error");
		log.debug("getAllStudentDetails Debug");
		log.trace("getAllStudentDetails Trace");
		
		List<StudentDetails> studentDetailsList = studentDetailsService.getListOfStudents();
		return studentDetailsList;
	}
//
	// GET http://localhost:8080/api/v1/studentDetails/{id}
	@GetMapping("{id}")
	StudentDetails getStudentById(@PathVariable("id") Long myStudentId)
	{
		StudentDetails details = studentDetailsService.getStudentById(myStudentId);
		return details;
	}
	
	// POST http://localhost:8080/api/v1/studentDetails/create
	@PostMapping("create")
	StudentDetails createStudentDetails(@RequestBody StudentDetails studentDetails)
	{
		 StudentDetails savedStudent =  studentDetailsService.save(studentDetails);
		 return studentDetails;
	}
	
	// DELETE http://localhost:8080/api/v1/studentDetails/{id}
	@DeleteMapping("{id}")
	void deleteStudentById(@PathVariable("id") Long id)
	{
		studentDetailsService.deleteStudent(id);
	}

	// PUT http://localhost:8080/api/v1/studentDetails/{id}
	@PutMapping("{id}")
	StudentDetails updateStudentDetails(@PathVariable("id") Long id, @RequestBody StudentDetails studentDetails)
	{
		StudentDetails updatedStudentDetails =  studentDetailsService.update(id,studentDetails);
		return updatedStudentDetails;
	}
	
//	// PATCH http://localhost:8080/api/v1/studentDetails/{id}
	@PatchMapping("{id}")
	StudentDetails partialUpdateStudentDetails(@PathVariable("id") Long id, @RequestBody StudentDetails studentDetails)
	{
		StudentDetails studentDetails1 =  studentDetailsService.partialUpdate(id,studentDetails);
		return studentDetails1;
	}
	
	 
	List<StudentDetails> createAllStudentDetails(@RequestBody List<StudentDetails> students)
	{
		List<StudentDetails> result = studentDetailsService.saveAllStudentDetails(students);
		return  result;
	}
	
	@GetMapping("/getByFirstName/{firstName}")
	List<StudentDetails> getStudentByFirstName(@PathVariable("firstName") String firstName)
	{
		return studentDetailsService.getStudentByFirstName(firstName);
	}
	
	@GetMapping("/getByLastName/{lastName}")
	List<StudentDetails> getStudentByLastName(@PathVariable("lastName") String lastName)
	{
		return studentDetailsService.getStudentByLastName(lastName);
	}
	
	@GetMapping("/getByFirstNames/{lastName}")
	List<String> getFirstNamesByLastName(@PathVariable("lastName") String lastName)
	{
		return studentDetailsService.getFirstNamesByLastName(lastName);
	}
}
