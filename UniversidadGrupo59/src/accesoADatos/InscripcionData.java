
package accesoADatos;

import entidades.Inscripcion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InscripcionData {
    
    private Connection con=null;
    
public InscripcionData(){
 this.con=Conexion.getConexion();
    
}
  
public void guardarIncripcripcion(Inscripcion insc){

        try {
            String sql="INSERT INTO inscripcion(idAlumno,idMateria,nota) VALUES (?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            
            if (rs.next()){
            
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Inscripcion Registrada");
                
                
            }
            
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder");
            
            
            
            
        }
     
}

}
