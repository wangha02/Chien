package com.example.repository;

import com.example.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryIMPL implements ICustomerRepository {
    public static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(1L, "Hung"));
        customerList.add(new Customer(2L, "Ha"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        if (customer.getId() != null) {
         customer.setName(customer.getName());
        }else {
            customerList.add(customer);
        }
    }

    @Override
    public Customer findById(Long id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                return customerList.get(i);
            }
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        for (int i =0; i < customerList.size(); i++){
            if (customerList.get(i).getId()== id){
                customerList.remove(i);
            }
        }
    }
}
