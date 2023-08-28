package com.jspServletProject.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jspServletProject.model.Users;

public interface UsersDAO {
	public boolean addUsers(Users ub) throws SQLException;
	public boolean editUsers(Users ub) throws SQLException;
	public boolean deleteUsers(int userId) throws SQLException;
	public ArrayList<Users> findAllub() throws SQLException;
	public Users findbyUId(int userId) throws SQLException;
	public Users authenticate(String userName, String password) throws SQLException;
}
