package com.example.demo.customer.persistence;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

	private final JdbcClient jdbcClient;

	public CustomerRepository(JdbcClient jdbcClient) {
		this.jdbcClient = jdbcClient;
	}

	public Customer findById(Long id) {
		return jdbcClient.sql("select * from customer where id = :id")
				.param("id", id)
				.query(Customer.class)
				.single();
	}

	public record Customer(Long id, String name) {}

}
