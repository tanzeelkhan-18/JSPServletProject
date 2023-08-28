package com.jspServletProject.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jspServletProject.model.Products;

public interface ProductsDAO {
	public boolean addPro(Products pb) throws SQLException;

	public boolean editPro(Products pb) throws SQLException;

	public boolean deletePro(int productId) throws SQLException;

	public ArrayList<Products> findAllPb() throws SQLException;

	public Products findbyPId(int productId) throws SQLException;
}
