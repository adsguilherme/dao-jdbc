package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

       // Department obj = new Department(1, "Books");

       // Seller seller = new Seller(21, "Bob", "bob@email.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao(); // Aqui foi instanciado o DAO sem a necessidade do new, devido ser uma interface.

        System.out.println("### Teste1: seller findById ###");

        Seller seller1 = sellerDao.findById(3);

        // System.out.println(seller);
         System.out.println(seller1);

    }
}
