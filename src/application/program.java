package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Department;
import model.entitites.Seller;

public class program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");

		System.out.println(obj);

		Seller seller = new Seller(21, "bob", "bob@gmail", new Date(), 3000.0, obj);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);

	}

}
