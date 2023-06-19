package com.Passwordlocker.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.PasswordlockeService.UserService;
import com.PasswordlockeService.UserServiceImp;
import com.PasswordlockerEntity.User;
@WebServlet("/login")
public class UserLogin  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		UserService imp = new UserServiceImp();
		User user = imp.loginUser(email, password);
		HttpSession session = req.getSession();
		session.setAttribute("user", user);
		resp.sendRedirect("userMenu.jsp");
		
		
	}

}
