package leodelmiro.springbaseproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class {{ global-computed-inputs.main_class }}Application

fun main(args: Array<String>) {
	runApplication<{{ global-computed-inputs.main_class }}Application>(*args)
}
