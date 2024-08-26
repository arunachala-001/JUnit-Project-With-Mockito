package com.java.junit.realtime;

public class UserServiceImpl implements UserService {

	@Override
	public User createUser(int id, String name, String emailId, String phoneNumber) {
		
		if(name == null || name.trim().length() == 0) {
			throw new IllegalArgumentException("The Name should be Not Null");
		}

		return new User(id, name, emailId, phoneNumber);
	}

}
