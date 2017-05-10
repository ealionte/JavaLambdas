package io.javabrains;

public class Greeter {

	
	static Greeting greetingFunction = (String s) -> System.out.print("Hello World! The value is " + s);
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
//		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		//greeter.greet(greetingFunction);
//		MyAdd addFunction = (int a, int b) -> a + b; 
	}
}

