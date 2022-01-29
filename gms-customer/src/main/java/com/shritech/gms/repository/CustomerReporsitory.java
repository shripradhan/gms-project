package com.shritech.gms.repository;

import com.shritech.gms.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReporsitory extends JpaRepository<Long, Customer> {

}
