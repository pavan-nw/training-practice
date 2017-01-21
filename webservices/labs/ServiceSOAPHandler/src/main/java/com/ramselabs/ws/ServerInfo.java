package com.ramselabs.ws;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@HandlerChain(file="handler-chain.xml")
public class ServerInfo{

	@WebMethod
	public String getServerName() {
		
		return "Ramlabs Server";
		
	}

}