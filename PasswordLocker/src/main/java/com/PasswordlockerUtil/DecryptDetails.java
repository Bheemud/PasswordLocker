package com.PasswordlockerUtil;

import java.util.ArrayList;
import java.util.List;

import com.PasswordlockerEntity.Account;
import com.PasswordlockerEntity.User;

public class DecryptDetails {
	
	public static List<Account> decrytAccout(List<Account> list) {
		
		List<Account> list2=new ArrayList<>();
		
		for(Account ac:list) {
			ac.setUserName(AES.decrypt(ac.getUserName(), AppConstanse.ENCREPT));
			ac.setPassword(AES.decrypt(ac.getPassword(), AppConstanse.ENCREPT));
			list2.add(ac);
		}
		return list2;
	}
	public static User decrytUser(User user) {
		user.setEmail(AES.decrypt(user.getEmail(), AppConstanse.ENCREPT));
		user.setPhoneNumber(AES.decrypt(user.getPhoneNumber(), AppConstanse.ENCREPT));
		user.setPassword(AES.decrypt(user.getPassword(), AppConstanse.ENCREPT));
		
		return user;
	}
}
