package db;

// Criando uma exceção personalizada para acesso a dados.
public class DbException extends RuntimeException {

    public DbException(String msg) {
        super(msg);
    }

}
