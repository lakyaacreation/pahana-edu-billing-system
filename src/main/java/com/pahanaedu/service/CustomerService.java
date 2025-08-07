package com.pahanaedu.service;

import com.pahanaedu.model.Customer;
import com.pahanaedu.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;

    public Customer addCustomer(Customer c) {
        return repo.save(c);
    }

    public Optional<Customer> getCustomer(String id) {
        return repo.findById(id);
    }
}
