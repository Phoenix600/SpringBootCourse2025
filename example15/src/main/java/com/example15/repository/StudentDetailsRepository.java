package com.example15.repository;

import com.example15.domain.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * File Name: StudentDetailsRepository.java
 * Entity: StudentDetailsRepository
 * Package: com.example15.repository
 * Author: pranayramteke
 * Date: 02/04/25
 * Description:
 */


@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetails,Long>
{

}
