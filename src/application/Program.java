package application;

import model.entities.Departement;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Departement obj = new Departement(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@email.com", new Date(), 3000.0, obj);

        System.out.println(seller);
    }
}
