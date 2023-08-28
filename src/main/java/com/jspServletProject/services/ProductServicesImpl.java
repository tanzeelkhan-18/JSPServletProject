package com.jspServletProject.services;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jspServletProject.dao.ProductsDAO;
import com.jspServletProject.dao.ProductsDAOImpl;
import com.jspServletProject.model.Products;

public class ProductServicesImpl implements ProductServices {
	
	Products pb = new Products();
	ProductsDAO pd = new ProductsDAOImpl();
	
	@Override
	public void addPro(String productName, double price, int quantity, String vendor, int warranty) throws SQLException {
		pb.setProductName(productName);
		pb.setPrice(price);
		pb.setQuantity(quantity);
		pb.setVendor(vendor);
		pb.setWarranty(warranty);
		try {
			pd.addPro(pb);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public void editPro(int productId, String productName, double price, int quantity, String vendor, int warranty) throws SQLException {
		pb.setProductId(productId);
		pb.setProductName(productName);
		pb.setPrice(price);
		pb.setQuantity(quantity);
		pb.setVendor(vendor);
		pb.setWarranty(warranty);
		try {
			pd.editPro(pb);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public void deletePro(int productId) throws SQLException {
		try {
			pd.deletePro(productId);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Products> findAllPb() throws SQLException {
		ArrayList<Products> al = pd.findAllPb();
		return al;
	}

	@Override
	public Products findbyPId(int productId) throws SQLException {
		pb = pd.findbyPId(productId);
		return pb;
	}

}
