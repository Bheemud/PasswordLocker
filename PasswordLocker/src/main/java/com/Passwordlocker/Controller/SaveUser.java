package com.Passwordlocker.Controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.PasswordlockeService.UserService;
import com.PasswordlockeService.UserServiceImp;
import com.PasswordlockerEntity.User;

@WebServlet("/saveUser")
public class SaveUser extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String phone = req.getParameter("phone");
		Date dob = Date.valueOf(req.getParameter("dob"));
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		User user = new User(name, gender, dob, phone, email, password);
		 UserService imp = new UserServiceImp();
		 String message = imp.saveUser(user);
		 HttpSession session = req.getSession();
		 session.setAttribute("saveMessage", message );
		 resp.sendRedirect("signing.jsp");
		 
	
	
	}

}
