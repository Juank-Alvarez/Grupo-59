
package universidadgrupo59;

import accesoADatos.AlumnoData;
import accesoADatos.Conexion;
import entidades.Alumno;
import java.sql.Connection;
import java.time.LocalDate;

public class UniversidadGrupo59 {

    public static void main(String[] args) {
        
//        Alumno Juan=new Alumno(1,12312312,"Luna","Juan Pedro",LocalDate.of(1980, 4, 25),true);
        AlumnoData alu= new AlumnoData();
//        alu.guardarAlumno(Juan);
//        alu.modificarAlumno(Juan);
//        alu.eliminarAlumno(1);
        Alumno alumnoEncontrado=alu.buscarAlumno(1);
        if(alumnoEncontrado!=null){
            System.out.println("dni "+alumnoEncontrado.getDni());
            System.out.println("apellido "+alumnoEncontrado.getApellido());
            System.out.println("nombre "+alumnoEncontrado.getNombre());
        }
        
    }
}
