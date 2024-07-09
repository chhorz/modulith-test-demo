package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest
@Import(TestcontainersConfiguration.class)
class ModulithTest {

	@Test
	void testModulithStructure() {
		var modules = ApplicationModules.of(DemoApplication.class).verify();

		new Documenter(modules).writeDocumentation();
	}

}
