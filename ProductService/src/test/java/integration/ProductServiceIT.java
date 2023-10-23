package integration;

import com.example.demo.ProductServiceApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ProductServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductServiceIT {

	@Test
	void contextLoads() {
		String str = "hello world";

		Assertions.assertEquals("hello world", str);
	}

}
