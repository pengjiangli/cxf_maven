package com.gt.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.jws.WebService;


@WebService(endpointInterface="com.gt.controller.HelloWorld",serviceName="HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	
	@Override
	public String sayHello(String username) {
	    return "Hello " + username;
	}

	
	public void aa(){
		System.out.println(11);
	}
	
	
	public void cc(){
		System.out.println(222);
	}
	
	
	public void dd(){
		System.out.println(344);
	}
	
	public void gg(){
		System.out.println("bbb");
	}
	
	public void ddddd(){
		System.out.println(9999);
	}

}
