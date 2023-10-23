package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EurekaServerApplicationTests {

	@Test
	void contextLoads() {
		String str = "hello world";

		Assertions.assertEquals("hello world", str);
	}

}
