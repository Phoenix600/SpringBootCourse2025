package com.pranay.example16.repository;

import com.pranay.example16.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * File Name: BookRepository.java
 * Entity: BookRepository
 * Package: com.pranay.example16.repository
 * Author: pranayramteke
 * Date: 08/04/25
 * Description:
 */

@Repository
public interface BookRepository extends JpaRepository<Book, Long>
{

}
