
package accesoADatos;

import entidades.Materia;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MateriaData {
    private Connection con=null;
    
    public MateriaData(){
        con=Conexion.getConexion();
    }
    
    public void guardarMatera(Materia materia){
        String sql="INSERT INTO `materia`(nombre, año) VALUES (? ,? ,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, true);
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia Guardada");
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder");
        }
    }
    
    public Materia buscarMateria(int id){
        String sql="SELECT nombre, año FROM `materia` WHERE idMateria= ? AND estado = 1";
        Materia materia=null;
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                materia=new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
            }else {
                JOptionPane.showMessageDialog(null, "No existe esa materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder");
        }
        return materia;
    }
}
