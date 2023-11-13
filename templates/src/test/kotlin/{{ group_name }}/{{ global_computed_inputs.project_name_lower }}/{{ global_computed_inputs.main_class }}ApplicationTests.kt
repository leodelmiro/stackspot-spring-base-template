package {{ group_name }}.{{ global_computed_inputs.project_name_lower }}

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class {{ global_computed_inputs.main_class }}ApplicationTests {

	@Test
	fun contextLoads() {
	}

}
