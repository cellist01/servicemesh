package com.examples.hellospringboot;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HelloRestController {
	public String hello() {
		String hostname = null;
		try {
			hostname = InetAddress.getLocalHost()
								  .getHostAddress();
		} catch (UnknownHostException e) {
			hostname = "unknown";
		}
		return "Hello Spring Boot from " + hostname;
	}
}
	