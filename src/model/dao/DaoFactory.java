package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJBDC;

public class DaoFactory {

    public static SellerDao createSellerDao() { // Expondo o método (createSellerDao) que retorna o tipo da interface (SellerDao).
        return new SellerDaoJBDC(DB.getConnection()); // Mas internamente irá instanciar uma implementação.
    }
}
