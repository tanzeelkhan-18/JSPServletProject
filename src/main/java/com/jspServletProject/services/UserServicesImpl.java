package com.jspServletProject.services;

import java.sql.SQLException;

import com.jspServletProject.dao.UsersDAO;
import com.jspServletProject.dao.UsersDAOImpl;
import com.jspServletProject.model.Users;

public class UserServicesImpl implements UserServices {

	UsersDAO ud = new UsersDAOImpl();
	Users ub = new Users();
	
	@Override
	public Users authenticate(String userName, String password) throws SQLException {
		ub = ud.authenticate(userName, password);
		if (ub!=null) {
			return ub;
		}
		return null;
	}

	@Override
	public void addUser(String name, String contact, String email, String username, String password)
			throws SQLException {
		ub.setName(name);
		ub.setContact(contact);
		ub.setEmail(email);
		ub.setUserName(username);
		ub.setPassword(password);
		try {
			ud.addUsers(ub);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
