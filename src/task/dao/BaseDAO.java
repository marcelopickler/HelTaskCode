package task.dao;

import java.sql.Connection;

/**
 * Classe base DAO para reduzir o acomplamento das classes DAO com a classe ConnectionFactory.java
 */
public class BaseDAO {


    Connection getConnection(){
        return ConnectionFactory.getConnection();
    }

}
