package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gscoe
 */
public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "Gscoelho1@";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_clinica";
        public Connection obtemConexao (){
            
            try{
                Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd,
                                                            usuario,
                                                              senha
                );
                return c;
            }
            catch (SQLException e){
                e.printStackTrace();
                return null;
            }
}
}
