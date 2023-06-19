package com.PasswordlockeService;

import com.PasswordlockerEntity.User;
import com.PasswordlockerRepository.UserRepository;
import com.PasswordlockerRepository.userRepositerImp;
import com.PasswordlockerUtil.AES;
import com.PasswordlockerUtil.AppConstanse;
import com.PasswordlockerUtil.DecryptDetails;
//import com.PasswordlockerUtil.DecryptDetails;
import com.PasswordlockerUtil.ValidUser;

public class UserServiceImp implements UserService {

	
	private UserRepository repository= new userRepositerImp();
	
	@Override
	public String saveUser(User user) {
		user.setEmail(AES.encrypt(user.getEmail(), AppConstanse.ENCREPT));
		user.setName(AES.encrypt(user.getName(),AppConstanse.ENCREPT ));
		user.setPassword(AES.encrypt(user.getPassword(), AppConstanse.ENCREPT));
		user.setPhoneNumber(AES.encrypt(user.getPhoneNumber(), AppConstanse.ENCREPT));
		return repository.saveUser(user);
	}

	@Override
	public String UpdateUser(User user) {
		user.setEmail(AES.encrypt(user.getEmail(), AppConstanse.ENCREPT));
		user.setPassword(AES.encrypt(user.getPassword(), AppConstanse.ENCREPT));
		user.setPhoneNumber(AES.encrypt(user.getPhoneNumber(), AppConstanse.ENCREPT));
		return repository.UpdateUser(user);
	}

	@Override
	public User loginUser(String email, String password) {
		email=AES.encrypt(email, AppConstanse.ENCREPT);
		password=AES.encrypt(password, AppConstanse.ENCREPT);
		User user = repository.loginUser(email, password);
	    User user2 = DecryptDetails.decrytUser(user);
		if(user !=null) {
			new ValidUser().setUser(user2);
		}
		return user2;
	}

	@Override
	public User deleteUser(int id) {
		
		return repository.deleteUser(id);
	}

}
