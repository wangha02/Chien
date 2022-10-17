package com.example.repository;

import com.example.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    public List<Customer> findAll();
    public void save(Customer customer);

    Customer findById(Long id);

    void delete(Long id);
}
