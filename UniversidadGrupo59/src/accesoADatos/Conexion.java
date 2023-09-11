
package accesoADatos;

//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import org.mariadb.jdbc.*;
import java.sql.*;

public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="universidadGrupo59";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion() {}
    
    public static Connection getConexion(){
        
        if(connection == null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                JOptionPane.showMessageDialog(null, "conectado");
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar");
            }
        }
        return connection;
    }
}
