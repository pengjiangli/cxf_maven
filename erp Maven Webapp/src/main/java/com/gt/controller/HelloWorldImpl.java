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

	

}
