package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Department;
import model.entitites.Seller;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

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

		System.out.println("\n === Text 3: Seller findAll");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n === Text 4: Seller isert");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id  = " + newSeller.getId());

		System.out.println("\n === Text 5: Seller Update");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wine");
		sellerDao.update(seller);
		System.out.println("Update Completed");

		System.out.println("\n === Text 6: Seller Delete");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteByID(id);
		System.out.println("Delete Completed");
		sc.close();

	}

}
