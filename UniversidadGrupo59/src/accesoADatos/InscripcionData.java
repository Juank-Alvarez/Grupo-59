
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
            try (PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, insc.getAlumno().getIdAlumno());
                ps.setInt(2, insc.getMateria().getIdMateria());
                ps.setDouble(3, insc.getNota());
                ps.executeUpdate();
                ResultSet rs=ps.getGeneratedKeys();
                
                if (rs.next()){                
                    
                    insc.setIdInscripcion(rs.getInt(1));
                    JOptionPane.showMessageDialog(null,"Inscripcion Registrada");
                    
                    
                }
            }
            
<<<<<<< HEAD
            
=======
            ps.close();  
>>>>>>> 662efff019926df9656fbe3254be49aaf4dfcf27
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder al guardado");
     
        }
     
}

public void actualizarNota (int idAlumno,int idMateria,double nota){

String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ?";

        try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, nota);
        ps.setInt(2, idAlumno);
        ps.setInt(3, idMateria);
        int filas = ps.executeUpdate();
        
        if(filas>0){
            JOptionPane.showMessageDialog(null,"Nota Actualizada");
        }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al aceder a la tabla ");
        }

}

public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
    
    String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idAlumno);
        ps.setInt(2, idMateria);
        
        int filas=ps.executeUpdate(); 
        if (filas>0){
            
            JOptionPane.showMessageDialog(null,"Inscripcion borrada ");
        }
        
         ps.close();
        
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al aceder a la tabla ");
        }
}


}
