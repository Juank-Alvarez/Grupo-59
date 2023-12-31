
package accesoADatos;

import entidades.Alumno;
import entidades.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MateriaData {
    private Connection con=null;
    
    public MateriaData(){
        con=Conexion.getConexion();
    }
    
    public void guardarMatera(Materia materia){
        String sql="INSERT INTO materia(nombre, año, estado) VALUES ( ?,?,?)";
        
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
        String sql="SELECT nombre, año, estado FROM `materia` WHERE idMateria= ? ";
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
                materia.setActivo(rs.getBoolean("estado"));
            }else {
                JOptionPane.showMessageDialog(null, "No existe esa materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder");
        }
        return materia;
    }
    
    public void modificarMateria(Materia materia){
        String sql="UPDATE materia SET nombre = ?,año = ? WHERE idMateria = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setInt(3, materia.getIdMateria());
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }else{
                JOptionPane.showMessageDialog(null, "Materia no se pudo modificar");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder");
        } 
    }
    
    //
    public void eliminarMateria(int id){
        String sql="UPDATE materia SET estado = 0 WHERE idMateria = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt (1,id);
            int exito= ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Materia borrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder ");
        }
        
    }
    //
     public List<Materia> listarMateria(){
        String sql="SELECT idMateria, nombre, año From materia WHERE estado = 1";
        ArrayList<Materia> materias=new ArrayList<>();
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery() ;
            while(rs.next()){
                Materia materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
               //mostrar solo año?
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
                
                materias.add(materia);
             }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia"+ex);
        }
        return materias;
        }
     
     public String buscarNombreMateria(int idMateria){
        String sql="SELECT nombre FROM materia WHERE idMateria = ? ";
        String materia="";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idMateria);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                materia=rs.getString("nombre");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder");
        }
        return materia;
    }
}
