package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department); // A linha completa pode ser lida da seguinte forma: "Retorna uma lista de vendedores cujo departamento é igual ao departamento fornecido como parâmetro".

}
