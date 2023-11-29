package test.org.springdoc.api.app11

import org.json.JSONObject
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@ExtendWith(
	SpringExtension::class
)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes=[TestApp::class])
@ActiveProfiles("test")
class RequiredTest (@Autowired val mockMvc: MockMvc){

	@Test
	fun `I am testing things`() {
		val result = mockMvc.perform(get("/v3/api-docs")).andExpect(status().isOk).andReturn()
		val result2 = JSONObject(result.response.contentAsString)
		println(result2.toString(2))
	}

}