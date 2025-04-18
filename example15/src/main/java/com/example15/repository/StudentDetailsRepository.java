package com.example15.repository;

import com.example15.domain.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetails,Long>
{
	
	public List<StudentDetails> findByFirstName(String firstName);
	public List<StudentDetails> findByLastName(String lastName);
	
	@Query("SELECT s.firstName FROM StudentDetails s WHERE s.lastName = :lastName")
	List<String> findFirstNameByLastName(String lastName);
}
