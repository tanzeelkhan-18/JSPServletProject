package com.jspServletProject.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jspServletProject.model.Products;
import com.jspServletProject.utility.DBUtility;

public class ProductsDAOImpl implements ProductsDAO {

	DBUtility db = new DBUtility();
	PreparedStatement pst;
	ResultSet rs;

	@Override
	public boolean addPro(Products pb) throws SQLException {
		int x = 0;
		String sql = "Insert into product(productname,price,quantity,vendor,warranty) values(?,?,?,?,?)";
		pst = db.createPST(sql);
		pst.setString(1, pb.getProductName());
		pst.setDouble(2, pb.getPrice());
		pst.setInt(3, pb.getQuantity());
		pst.setString(4, pb.getVendor());
		pst.setInt(5, pb.getWarranty());
		db.update(pst);

		// Committing changes to the database
		try {
			db.commitQuery();
			x++;
		} catch (SQLException e) {
			db.rollbackQuery();
			e.printStackTrace();
		}

		if (x != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean editPro(Products pb) throws SQLException {
		int x = 0;
		String sql = "Update product set productName=?, price=?, quantity=?, vendor=?, warranty=? where productId=?";
		pst = db.createPST(sql);
		pst.setString(1, pb.getProductName());
		pst.setDouble(2, pb.getPrice());
		pst.setInt(3, pb.getQuantity());
		pst.setString(4, pb.getVendor());
		pst.setInt(5, pb.getWarranty());
		pst.setInt(6, pb.getProductId());
		db.update(pst);

		// Committing changes to the database
		try {
			db.commitQuery();
			x++;
		} catch (SQLException e) {
			db.rollbackQuery();
			e.printStackTrace();
		}

		if (x != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deletePro(int productId) throws SQLException {
		int x = 0;
		String sql = "Delete from product where productId=?";
		pst = db.createPST(sql);
		pst.setInt(1, productId);
		db.update(pst);

		// Committing changes to the database
		try {
			db.commitQuery();
			x++;
		} catch (SQLException e) {
			db.rollbackQuery();
			e.printStackTrace();
		}

		if (x != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ArrayList<Products> findAllPb() throws SQLException {
		String sql = "Select * from product";
		pst = db.createPST(sql);
		rs = db.query(pst);
		ArrayList<Products> pl = new ArrayList<Products>();
		while (rs.next()) {
			Products pb = new Products();
			pb.setProductId(rs.getInt("productId"));
			pb.setProductName(rs.getString("productName"));
			pb.setPrice(rs.getDouble("price"));
			pb.setVendor(rs.getString("vendor"));
			pb.setQuantity(rs.getInt("quantity"));
			pb.setWarranty(rs.getInt("warranty"));
			pl.add(pb);
		}
		return pl;
	}

	@Override
	public Products findbyPId(int productId) throws SQLException {
		String sql = "Select * from product where productId=?";
		pst = db.createPST(sql);
		pst.setInt(1, productId);
		rs = db.query(pst);

		if (rs.next()) {
			Products pb = new Products();
			pb.setProductId(rs.getInt("productId"));
			pb.setProductName(rs.getString("productName"));
			pb.setPrice(rs.getDouble("price"));
			pb.setVendor(rs.getString("vendor"));
			pb.setQuantity(rs.getInt("quantity"));
			pb.setWarranty(rs.getInt("warranty"));
			return pb;
		}
		return null;
	}

	public static void main(String[] args) throws SQLException {

	}

}
