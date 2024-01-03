package model.dao;

import model.dao.impl.SellerDaoJBDC;

public class DaoFactory {

    public static SellerDao createSellerDao() { // Expondo o método (createSellerDao) que retorna o tipo da interface (SellerDao).
        return new SellerDaoJBDC(); // Mas internamente irá instanciar uma implementação.
    }
}
