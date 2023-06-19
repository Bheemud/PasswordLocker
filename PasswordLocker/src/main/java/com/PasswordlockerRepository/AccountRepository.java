package com.PasswordlockerRepository;

import java.util.List;

import com.PasswordlockerEntity.Account;

public interface AccountRepository {
	
	String saveAccount(Account account);
	
	String UpdateAccount(Account account);
	
	List<Account> getAllAccounts();
	
	List<Account> getAllAccountsByName(String name);
	
	Account deleteAccount(int id);
	
	
	
	
	

}
