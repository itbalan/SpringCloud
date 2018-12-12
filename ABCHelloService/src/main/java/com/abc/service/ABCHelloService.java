package com.abc.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ABCHelloService {
	
	@Value("${msg:Hello Spring! - Default}")
	String msg;
	
	@GetMapping("/hello")
	public String getMsg() {
		return msg;
	}

}
