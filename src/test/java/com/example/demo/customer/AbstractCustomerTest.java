package com.example.demo.customer;

import com.example.demo.TestcontainersConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest
@Import(TestcontainersConfiguration.class)
public class AbstractCustomerTest {
}
