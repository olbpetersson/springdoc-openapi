package test.org.springdoc.api.app11

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

data class Greeting(val greeting: String)

@RestController
class RequiredController {
	@GetMapping("/")
	fun greet(@RequestParam name: String?) = Greeting("Hello ${name ?: "world"}")

	@GetMapping("/test")
	fun test(@RequestParam name: String) = Greeting("Hello $name")

	@GetMapping("/test-with-default")
	fun testWithDefault(@RequestParam(defaultValue = "world") name: String) = Greeting("Hello $name")
}