package com.practice.batchProcess.demo.repository;

import com.practice.batchProcess.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
