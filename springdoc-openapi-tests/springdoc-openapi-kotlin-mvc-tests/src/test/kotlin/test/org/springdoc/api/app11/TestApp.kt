package test.org.springdoc.api.app11
import org.springframework.boot.SpringApplication

import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class TestApp {

    fun main(args: Array<String>) {
        SpringApplication.run(TestApp::class.java, *args)
    }
}