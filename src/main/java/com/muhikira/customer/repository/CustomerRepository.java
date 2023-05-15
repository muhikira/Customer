package com.muhikira.customer.repository;

import com.muhikira.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Map<Object, Object> findAllById(Long customerId);
}
