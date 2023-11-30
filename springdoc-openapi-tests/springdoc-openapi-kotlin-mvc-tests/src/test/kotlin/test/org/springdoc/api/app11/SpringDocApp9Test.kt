package test.org.springdoc.api.app11

import org.springframework.boot.autoconfigure.SpringBootApplication

class SpringDocApp9Test: AbstractKotlinSpringDocMVCTest() {

    @SpringBootApplication
    open class DemoApplication
}

/*

class SpringDocApp2Test : AbstractKotlinSpringDocTest() {

	@SpringBootApplication
	@ComponentScan(basePackages = ["org.springdoc", "test.org.springdoc.api.app2"])
	open class DemoApplication

}
 */