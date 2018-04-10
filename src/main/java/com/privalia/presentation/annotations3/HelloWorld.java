package com.privalia.presentation.annotations3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "helloWorld")
public class HelloWorld {
	
	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHelloWorld(String hello) {
		this.hello = hello;
	}
	
	public HelloWorld(){
		
	}
	
	@Autowired
	public HelloWorld(@Value("Hello World from constructor") String hello){
		this.hello = hello;
	}
	
	
	
}
