package com.java.junit.realtime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
	private UserService userService = new UserServiceImpl();
	
	private int userId;
	private String name;
	private String emailId;
	private String phoneNumber;
	
	@BeforeEach
	void init() {
		 userId = 001;
		 name = "Arun";
		 emailId = "aabbcc@gmail.com";
		 phoneNumber = "9876543210";
	}

	@Test
	@DisplayName("Testing Object returning from Service")
	void test_UserService_return_UserObj() {
		User user = userService.createUser(userId, name, emailId, phoneNumber);	
		assertNotNull(user);
	}
	
	@DisplayName("Testing returning valid name from ServiceClass")
	@Test
	void test_UserService_return_name() {
		User user = userService.createUser(userId, name, emailId, phoneNumber);
		assertEquals(name, user.getName());
	}
	
	
	@DisplayName("Testing returning Valid Exceptions")
	@Test
	void test_UserService_return_ValidException() {
		int userId = 001;
		String name = "";
		String emailId = "aabbcc@gmail.com";
		String phoneNumber = "9876543210";
		
		
		
		assertThrows(IllegalArgumentException.class, () ->{
			User user = userService.createUser(userId, name, emailId, phoneNumber);
		});
	}
	
	
}
