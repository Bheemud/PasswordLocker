package com.PasswordlockeService;

import com.PasswordlockerEntity.User;

public interface UserService {

	String saveUser(User user);
	 
	String UpdateUser(User user);
	 
	User loginUser(String email,String  password);
	
	User deleteUser(int id);
}
