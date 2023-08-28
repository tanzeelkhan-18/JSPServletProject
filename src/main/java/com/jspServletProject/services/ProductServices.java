package com.jspServletProject.services;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jspServletProject.model.Products;

public interface ProductServices {
	public void addPro(String productName, double price, int quantity, String vendor, int warranty) throws SQLException;
	public void editPro(int productId, String productName, double price, int quantity, String vendor, int warranty) throws SQLException;
	public void deletePro(int productId) throws SQLException;
	public ArrayList<Products> findAllPb() throws SQLException;
	public Products findbyPId(int productId) throws SQLException;
}
