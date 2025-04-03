package com.example15.repository;

import com.example15.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * File Name: AddressReopistory.java
 * Entity: AddressReopistory
 * Package: com.example15.repository
 * Author: pranayramteke
 * Date: 03/04/25
 * Description:
 */

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
