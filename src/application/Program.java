package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "books");
		
		Seller seller = new Seller(21, "bob", "Bob@gmail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		
		System.out.println(seller);
	}

}
