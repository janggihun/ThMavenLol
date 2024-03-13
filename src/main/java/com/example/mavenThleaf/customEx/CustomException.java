package com.example.mavenThleaf.customEx;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomException extends RuntimeException {

	public CustomException(String msg) {
		
		super(msg);
		
	}

}
