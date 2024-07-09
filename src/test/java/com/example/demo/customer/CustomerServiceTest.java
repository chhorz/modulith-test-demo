package com.example.demo.customer;

import com.example.demo.customer.service.CustomerService;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.BEFORE_TEST_METHOD;

@Sql(executionPhase = BEFORE_TEST_METHOD, scripts = {"classpath:sql/customer.sql"})
class CustomerServiceTest extends AbstractCustomerTest {

	@Autowired
	private CustomerService service;

//	@Test
//	void getCustomer() {
//		assertThat(service.get(1L))
//				.isNotNull()
//				.satisfies(c -> {
//					assertThat(c.id()).isNotNull();
//					assertThat(c.name()).isEqualTo("John Doe");
//				});
//	}


	@Nested
	class Slice {

		@Test
		void getCustomer() {
			assertThat(service.get(1L))
					.isNotNull()
					.satisfies(c -> {
						assertThat(c.id()).isNotNull();
						assertThat(c.name()).isEqualTo("John Doe");
					});
		}

	}

}
