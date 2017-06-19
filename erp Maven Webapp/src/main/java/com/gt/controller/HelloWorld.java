package com.gt.controller;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService 
public interface  HelloWorld {
	@WebMethod  
	public String sayHello(@WebParam(name = "username") String username);    
}
