package task.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Fábrica de Conexoes com o Banco Mysql
 */
public class ConnectionFactory {
    /**
     * Configuracoes de conexoes com o banco MYsql
     * Atenção!!
     * Jamais deixe esses dados fixos no código em um sistema real em produção!!!
     */
    private final static String dataBaseName = "help_task";
    private final static String dataBaseUser = "root";
    private final static String dataBasePassword = "univille";
    private static final Integer databasePort = 3306;
    private static final String ignoreTimezone = "?useTimezone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";

    public static Connection getConnection(){
        try {
            return DriverManager
                    .getConnection(String.format("jdbc:mysql://localhost:"+databasePort+"/%s%s",dataBaseName, ignoreTimezone),dataBaseUser,dataBasePassword);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
