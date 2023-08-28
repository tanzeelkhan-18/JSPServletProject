package com.jspServletProject.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jspServletProject.model.Users;
import com.jspServletProject.utility.DBUtility;

public class UsersDAOImpl implements UsersDAO {
	
	DBUtility db = new DBUtility();
	PreparedStatement pst;
	ResultSet rs;

	@Override
	public boolean addUsers(Users ub) throws SQLException {
		int x= 0;
		String sql = "Insert into users(name,contact,email,username,password) values(?,?,?,?,?)";
		pst = db.createPST(sql);
		pst.setString(1, ub.getName());
		pst.setString(2, ub.getContact());
		pst.setString(3, ub.getEmail());
		pst.setString(4, ub.getUserName());
		pst.setString(5, ub.getPassword());
		db.update(pst);
		
		//Committing changes to the database
		try {
			db.commitQuery();
			x++;
		}catch(SQLException e) {
			db.rollbackQuery();
			e.printStackTrace();
		}
		
		if(x!=0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean editUsers(Users ub) throws SQLException {
		int x = 0;
		String sql = "Update users set name=?, contact=?, email=?, username=?, password=? where userId=?";
		pst = db.createPST(sql);
		pst.setString(1, ub.getName());
		pst.setString(2, ub.getContact());
		pst.setString(3, ub.getEmail());
		pst.setString(4, ub.getUserName());
		pst.setString(5, ub.getPassword());
		pst.setInt(6, ub.getUserId());
		db.update(pst);
		
		//Committing changes to the database
		try {
			db.commitQuery();
			x++;
		}catch(SQLException e) {
			db.rollbackQuery();
			e.printStackTrace();
		}
		
		if(x!=0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean deleteUsers(int userId) throws SQLException {
		int x = 0;
		String sql = "Delete from emp where empId=?";
		pst = db.createPST(sql);
		pst.setInt(1, userId);
		db.update(pst);
		
		//Committing changes to the database
		try {
			db.commitQuery();
			x++;
		}catch(SQLException e) {
			db.rollbackQuery();
			e.printStackTrace();
		}
		
		if(x!=0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public ArrayList<Users> findAllub() throws SQLException {
		String sql = "Select * from users";
		pst = db.createPST(sql);
		rs = db.query(pst);
		ArrayList<Users> ul = new ArrayList<Users>();
		while(rs.next()) {
			Users ub = new Users();
			ub.setUserId(rs.getInt("userId"));
			ub.setName(rs.getString("name"));
			ub.setContact(rs.getString("contact"));
			ub.setEmail(rs.getString("email"));
			ub.setUserName(rs.getString("username"));
			ub.setPassword(rs.getString("password"));
			ul.add(ub);
		}
		return ul;
	}

	@Override
	public Users findbyUId(int userId) throws SQLException {
		String sql = "Select * from users where userId=?";
		pst = db.createPST(sql);
		pst.setInt(1, userId);
		rs = db.query(pst);
		
		if(rs.next()) {
			Users ub = new Users();
			ub.setUserId(rs.getInt("userId"));
			ub.setName(rs.getString("name"));
			ub.setContact(rs.getString("contact"));
			ub.setEmail(rs.getString("email"));
			ub.setUserName(rs.getString("username"));
			ub.setPassword(rs.getString("password"));
			return ub;
		}
		return null;
	}

	@Override
	public Users authenticate(String userName, String password) throws SQLException {
		String sql = "Select * from users where username=? and password=?";
		pst = db.createPST(sql);
		pst.setString(1, userName);
		pst.setString(2, password);
		rs = db.query(pst);
		if(rs.next()) {
			Users ub = new Users();
			ub.setUserId(rs.getInt("userId"));
			ub.setName(rs.getString("name"));
			ub.setContact(rs.getString("contact"));
			ub.setEmail(rs.getString("email"));
			ub.setUserName(rs.getString("username"));
			ub.setPassword(rs.getString("password"));
			return ub;
		}
		return null;
	}

}
