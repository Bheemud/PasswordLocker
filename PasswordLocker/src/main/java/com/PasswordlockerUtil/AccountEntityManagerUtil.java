package com.PasswordlockerUtil;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class AccountEntityManagerUtil {
	
	private static  EntityManager manager;
	
	private AccountEntityManagerUtil() {
	}
	
  public static EntityManager getEntityManager(){
	  if(manager == null) {
		  manager=Persistence.createEntityManagerFactory("bheem").createEntityManager();
	  }
		return manager;
	}

}
