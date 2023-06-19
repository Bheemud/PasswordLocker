package com.PasswordlockerRepository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.PasswordlockerEntity.*;
import com.PasswordlockerUtil.AccountEntityManagerUtil;
import com.PasswordlockerUtil.ValidUser;

public class AccountRepositoryImp implements AccountRepository{

	private EntityManager manager=AccountEntityManagerUtil.getEntityManager();
	
	private User user;
	{
		user= new ValidUser().getUser();
	}
	
	@Override
	public String saveAccount(Account account) {
		account.setUserID(user.getId());
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(account);
			transaction.commit();
			return "Account Added Succecfully";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Something went wrong";
	}

	@Override
	public String UpdateAccount(Account account) {
		account.setUserID(user.getId());
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(account);
			transaction.commit();
			return "Account Updated Succecfully";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Something went wrong";
	}

	@Override
	public List<Account> getAllAccounts() {
		String sql="FROM Account a";
		Query query = manager.createQuery(sql);
		System.out.println("Executed");
		return query.getResultList();
	}

	@Override
	public List<Account> getAllAccountsByName(String name) {
		String sql="SELECT a FROM Account a WHERE a.accountName=?1 AND a.userID=?2";
		Query query = manager.createQuery(sql);
		query.setParameter(1, name);
		query.setParameter(2, user.getId());
	
		return query.getResultList(); 
	}

	@Override
	public Account deleteAccount(int id) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Account account = manager.find(Account.class, id);
		manager.remove(account);
		transaction.commit();
		return account;
	}
	
	
}
