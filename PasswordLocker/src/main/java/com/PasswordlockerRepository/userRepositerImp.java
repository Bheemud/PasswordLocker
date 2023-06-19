package com.PasswordlockerRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.PasswordlockerEntity.User;
import com.PasswordlockerUtil.UserEntityManagerUtil;

public class userRepositerImp implements UserRepository {

	private EntityManager manager= UserEntityManagerUtil.getEntityManager();;
	
	@Override
	public String saveUser(User user) 
	{
		
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return "User Creat Succesfully";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Someting went wrong ";
	}

	@Override
	public String UpdateUser(User user) {
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(user);
			transaction.commit();
			return "User Update Succesfully";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Someting went wrong ";
	}

	@Override
	public User loginUser(String email, String password) {
		
		String sql="SELECT u FROM User u WHERE u.email=?1 AND u.password=?2";
		Query query = manager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		return (User) query.getSingleResult();
	}

	@Override
	public User deleteUser(int id) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User user = manager.find(User.class,id);
		manager.remove(user);
		transaction.commit();
		return user;
	}

}
