package model.dao;

import java.util.List;

import model.entitites.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update (Seller obj);
	void deleteByID(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();

}
