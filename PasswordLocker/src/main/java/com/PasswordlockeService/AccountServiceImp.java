package com.PasswordlockeService;

import java.util.List;

import com.PasswordlockerEntity.Account;
import com.PasswordlockerRepository.AccountRepository;
import com.PasswordlockerRepository.AccountRepositoryImp;
import com.PasswordlockerUtil.AES;
import com.PasswordlockerUtil.AppConstanse;
import com.PasswordlockerUtil.DecryptDetails;


public class AccountServiceImp implements AccountService{

	private AccountRepository repository= new AccountRepositoryImp();
	
	@Override
	public String saveAccount(Account account) {
		
		account.setUserName(AES.encrypt(account.getUserName(), AppConstanse.ENCREPT));
		account.setPassword(AES.encrypt(account.getPassword(), AppConstanse.ENCREPT));
		return repository.saveAccount(account);
	}

	@Override
	public String UpdateAccount(Account account) {
		account.setUserName(AES.encrypt(account.getUserName(), AppConstanse.ENCREPT));
		account.setPassword(AES.encrypt(account.getPassword(), AppConstanse.ENCREPT));
		return repository.UpdateAccount(account);
	}

	@Override
	public List<Account> getAllAccounts() {
		
		List<Account> accouts = DecryptDetails.decrytAccout(repository. getAllAccounts());

		return accouts;
	}

	@Override
	public List<Account> getAllAccountsByName(String name) {
		List<Account> accouts = DecryptDetails.decrytAccout(repository. getAllAccounts());
		return accouts;
	}

	@Override
	public Account deleteAccount(int id) {
		
		return repository.deleteAccount(id);
	}

}
