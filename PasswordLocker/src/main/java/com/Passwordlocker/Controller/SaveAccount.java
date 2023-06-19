package com.Passwordlocker.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.PasswordlockeService.AccountService;
import com.PasswordlockeService.AccountServiceImp;
import com.PasswordlockerEntity.Account;
import com.PasswordlockerRepository.AccountRepositoryImp;
import com.PasswordlockerRepository.userRepositerImp;

@WebServlet("/saveAccount")
public class SaveAccount extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String userName = req.getParameter("username");
//		String accountName = req.getParameter("accountName");
//		String password = req.getParameter("password");
//		String review = req.getParameter("review");
//		System.out.println(userName);
//		Account account = new Account(accountName, userName, password, review);
//		System.out.println(account);
		Account ac=new Account();
		ac.setAccountName(req.getParameter("accountName"));
		ac.setUserName(req.getParameter("username"));
		ac.setPassword(req.getParameter("password"));
		ac.setReview(req.getParameter("review"));
		ac.setUserID(Integer.parseInt(req.getParameter("id")));
		AccountRepositoryImp imp = new AccountRepositoryImp();
		String saveAccount = imp.saveAccount(ac);
		
	}

}
