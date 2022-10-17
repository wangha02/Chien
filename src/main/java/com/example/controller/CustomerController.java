package com.example.controller;

import com.example.model.Customer;
import com.example.repository.ICustomerRepository;
import com.example.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/customer")
public class CustomerController{
    @Autowired
    ICustomerService customerService;
    @GetMapping("/")
    public String showListCustomer(Model model){
        List<Customer> customers = customerService.findAll();
        model.addAttribute("listCustomer", customers);
        return "list";
    }
    @GetMapping("/detail/{id}")
    public String detailCustomer(@PathVariable Long id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "detail";

    }
    @GetMapping("/show/update/{id}")
    public String detailUpdate(@PathVariable Long id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customerUpdate", customer);
        return "edit";
    }
    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute ("customerUpdate") Customer customer) {
        customerService.save(customer);
        return "redirect:/";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id, Model model) {
        Customer customer = customerService.findById(id);
        if (customer == null) {
            throw new IllegalStateException("id" + id);
        }
        return null;
    }
}