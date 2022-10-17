package com.example.service;

import com.example.model.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> findAll();
    public void save(Customer customer);
    Customer findById(Long id);
    public void delete(Long id);
}
