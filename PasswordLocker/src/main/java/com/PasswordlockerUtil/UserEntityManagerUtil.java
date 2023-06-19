package com.PasswordlockerUtil;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class UserEntityManagerUtil {

	
private static  EntityManager manager;
	
	private UserEntityManagerUtil() {
	}
	
  public static EntityManager getEntityManager(){
	  if(manager == null) {
		  manager=Persistence.createEntityManagerFactory("bheem").createEntityManager();
	  }
		return manager;
	}
}
