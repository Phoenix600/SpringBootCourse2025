package com.example15.repository;

import com.example15.domain.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetails,Long>
{

}
