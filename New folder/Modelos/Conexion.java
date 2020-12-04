package Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private final String base="VideoJuegos";
    private final String user="root";
    private final String password="root";
    private final String url="jdbc:mysql://localhost/"+base+"?serverTimezone=UTC";
    private Connection con=null;
    
    
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,user,password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}