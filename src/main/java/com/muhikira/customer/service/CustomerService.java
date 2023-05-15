package com.muhikira.customer.service;

import com.muhikira.customer.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer createrCustomer(Customer customer);
    Customer getCustomerById(Long customerId);

    List<Customer> getAllCustomers();
    Customer updateCustomer (Customer customer);
    void deleteCustomer(Long customerId);

}
