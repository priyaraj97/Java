package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder PasswordEncoder = new BCryptPasswordEncoder();
		String rawPassword = "ravi2020";
		String encodedPassword = PasswordEncoder.encode(rawPassword);
        System.out.println("encodedPassword");
	}

}
