package leodelmiro.springbaseproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class {{ global_computed_inputs.main_class }}Application

fun main(args: Array<String>) {
	runApplication<{{ global_computed_inputs.main_class }}Application>(*args)
}
