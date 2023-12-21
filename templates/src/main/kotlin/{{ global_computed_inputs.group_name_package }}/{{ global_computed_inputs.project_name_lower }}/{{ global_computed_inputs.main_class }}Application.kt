package {{ group_name }}.{{ global_computed_inputs.project_name_lower }}

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class {{ global_computed_inputs.main_class }}Application

fun main(args: Array<String>) {
	runApplication<{{ global_computed_inputs.main_class }}Application>(*args)
}
