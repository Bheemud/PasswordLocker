package com.PasswordlockerRepository;

import com.PasswordlockerEntity.User;

public interface UserRepository {
	
	 String saveUser(User user);
	 
	 String UpdateUser(User user);
	 
	User loginUser(String userName,String  password);
	
	User deleteUser(int id);

}
