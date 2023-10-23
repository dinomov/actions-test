package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServiceApplicationTests {

	@Test
	void contextLoads() {
		String str = "hello world";

		Assertions.assertEquals("hello world", str);
	}

}
