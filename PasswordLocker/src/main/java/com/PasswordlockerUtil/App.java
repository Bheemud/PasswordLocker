package com.PasswordlockerUtil;

import com.PasswordlockerEntity.User;

public class App {

	public static void main(String[] args) {
		User user = new User("mohan", "male", null, "6303560847", "naga@gamil.com", "naga@123");
		
		User user2 = new User();
		
		user2.setEmail(AES.encrypt(user.getEmail(), "123wertqt"));
		user2.setName(AES.encrypt(user.getName(), "123wertqt"));
		user2.setPassword(AES.encrypt(user.getPassword(), "123wertqt"));
		user2.setGender(user.getGender());
		user2.setPhoneNumber(AES.encrypt(user.getPhoneNumber(), "123wertqt"));
		System.out.println("orginal data");
		System.out.println(user);
		System.out.println("encrepted data");
		System.out.println(user2);
		User user3 = new User();
		user3.setEmail(AES.decrypt(user2.getEmail(), "123wertqt"));
		user3.setName(AES.decrypt(user2.getName(), "123wertqt"));
		user3.setPassword(AES.decrypt(user2.getPassword(), "123wertqt"));
		user3.setPhoneNumber(AES.decrypt(user2.getPhoneNumber(), "123wertqt"));
		System.out.println("After back to decrypt data");
		System.out.println(user3);
		
		
	}

}
