package com.leodelmiro.{{ projectName | lower }}

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class {{ projectName | pascalcase }}ApplicationTests {

	@Test
	fun contextLoads() {
	}

}
