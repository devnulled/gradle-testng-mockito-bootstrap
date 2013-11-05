package com.devnulled.bootstrap

import org.testng.annotations.*

class HelloWorldTest {

	@Test
	public void helloWorldIsReturned() {
		def hw = new HelloWorld()

		assert hw.helloWorld() == "Hello World!"
	}

	@Test
	public void fakeTest() {
		assert 1 == 1
	}
	
}