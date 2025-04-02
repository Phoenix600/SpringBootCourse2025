package com.example15.controller;

import com.example15.domain.StudentDetails;
import com.example15.services.StudentDetailsService;
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


@RestController
@RequestMapping("/api/v1/studentDetails/")
public class StudentDetailsController
{
	@Autowired
	StudentDetailsService studentDetailsService;
	
	// GET http://localhost:8080/api/v1/studentDetails/all
//	@GetMapping("all")
//	List<StudentDetails> getAllStudentDetails()
//	{
//
//	}
//
//	// GET http://localhost:8080/api/v1/studentDetails/{id}
//	@GetMapping("{id}")
//	StudentDetails getStudentById(Long id)
//	{
//
//	}
	
	// POST http://localhost:8080/api/v1/studentDetails/create
	@PostMapping("create")
	StudentDetails createStudentDetails(@RequestBody StudentDetails studentDetails)
	{
		 StudentDetails savedStudent =  studentDetailsService.save(studentDetails);
		 return studentDetails;
	}
	
//	// DELETE http://localhost:8080/api/v1/studentDetails/{id}
//	@DeleteMapping("{id}")
//	String deleteStudentById(@PathVariable("id") Long id)
//	{
//
//	}

//	// PUT http://localhost:8080/api/v1/studentDetails/{id}
//	@PutMapping("{id}")
//	StudentDetails updateStudentDetails(@PathVariable("id") Long id, @RequestBody StudentDetails studentDetails)
//	{
//
//	}
	
//	// PATCH http://localhost:8080/api/v1/studentDetails/{id}
//	@PatchMapping("{id}")
//	StudentDetails partialUpdateStudentDetails(@PathVariable("id") Long id, @RequestBody StudentDetails studentDetails)
//	{
//
//	}
	
}
