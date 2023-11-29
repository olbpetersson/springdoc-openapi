package test.org.springdoc.api.app11
import org.springframework.boot.SpringApplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Profile
import org.springframework.test.context.ActiveProfiles

@SpringBootApplication
@ActiveProfiles("test")
class TestApp {

    fun main(args: Array<String>) {
        SpringApplication.run(TestApp::class.java, *args)
    }
}