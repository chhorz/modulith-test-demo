package com.example.demo.customer.service;

import com.example.demo.customer.persistence.CustomerRepository;
import com.example.demo.customer.persistence.CustomerRepository.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	private final CustomerRepository repository;

	public CustomerService(CustomerRepository repository) {
		this.repository = repository;
	}

	public Customer get(Long id) {
		return repository.findById(id);
	}

}
