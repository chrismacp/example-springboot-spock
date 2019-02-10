package dev.macpherson.example.springboot2spock

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

/**
 * Integration test for App class.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = Application)
class ApplicationSpecIT extends Specification {

	@Autowired
	ApplicationContext context

	def "test context loads"() {
		expect:
		context != null
//		context.containsBean("helloWorldService")
//		context.containsBean("simpleBootApp")
//		context.containsBean("scopedHelloWorldService")
	}
}
