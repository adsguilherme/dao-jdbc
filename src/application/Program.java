package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       // Department obj = new Department(1, "Books");

       // Seller seller = new Seller(21, "Bob", "bob@email.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao(); // Aqui foi instanciado o DAO sem a necessidade do new, devido ser uma interface.

        System.out.println("### Teste1: seller findById ###");

        Seller seller1 = sellerDao.findById(3);

        // System.out.println(seller);
        System.out.println(seller1);

        System.out.println();
        System.out.println("### Teste2: seller findByDepartment ###");

        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("### Teste3: seller findAll ###");

        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("### Teste4: seller insert ###");

        Seller newSeller = new Seller(null, "Greg", "greg@email.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);

        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println();
        System.out.println("### Teste5: seller update ###");

        seller1 = sellerDao.findById(1);
        seller1.setName("Martha Wayne");
        sellerDao.update(seller1);
        System.out.println("Update completed");

        System.out.println();
        System.out.println("### Teste6: seller deleteById ###");
        System.out.println("Enter id for delete test");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed!");

        sc.close();

    }
}
