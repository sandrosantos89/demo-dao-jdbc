package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Department;
import model.entitites.Seller;

public class program {

	public static void main(String[] args) {

//		Department obj = new Department(1, "Books");
//
//		System.out.println(obj);

		// Seller seller = new Seller(21, "bob", "bob@gmail", new Date(), 3000.0, obj);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== Test 1: seller findById === ");

		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println("\n === Text 2: Seller findByDepartment");

		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);

		for (Seller obj : list) {
			System.out.println(obj);
		}

	}

}
