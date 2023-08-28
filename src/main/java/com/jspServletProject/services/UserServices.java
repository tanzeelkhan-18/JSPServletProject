package com.jspServletProject.services;

import java.sql.SQLException;

import com.jspServletProject.model.Users;

public interface UserServices {
	public void addUser(String name,String contact, String email,String username,String password) throws SQLException;
	public Users authenticate(String userName, String password) throws SQLException;
}
