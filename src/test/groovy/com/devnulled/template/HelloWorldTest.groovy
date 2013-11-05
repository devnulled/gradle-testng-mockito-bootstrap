package com.devnulled.template

import org.testng.annotations.*

class HelloWorldTest {

	@Test
	def void helloWorldIsReturnedTest() {
		def hw = new HelloWorld()

		assert hw.helloWorld() == "Hello World!"
	}
	
}