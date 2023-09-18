
package universidadgrupo59;

import accesoADatos.AlumnoData;
import accesoADatos.Conexion;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;

public class UniversidadGrupo59 {

    public static void main(String[] args) {

        Alumno Juan = new Alumno(1, 12312312, "Luna", "Juan Pedro", LocalDate.of(1980, 4, 25), true);
        //       AlumnoData alu = new AlumnoData();
        //    alu.guardarAlumno(Juan);
//        alu.modificarAlumno(Juan);
//        alu.eliminarAlumno(1);
//        Alumno alumnoEncontrado=alu.buscarAlumno(1);
        // Alumno alumnoEncontrado=alu.buscarAlumnoPorDni(12312312);
        /*  if(alumnoEncontrado!=null){
            System.out.println("dni "+alumnoEncontrado.getDni());
            System.out.println("apellido "+alumnoEncontrado.getApellido());
            System.out.println("nombre "+alumnoEncontrado.getNombre());
         */

//        Alumno Pedro = new Alumno(30589647, "Sanchez", "Carlos", LocalDate.of(1982, 6, 19), true);
//        Alumno Manuel = new Alumno(37548159, "Ramirez", "Jose", LocalDate.of(1987, 9, 13), true);
        // alu.guardarAlumno(Pedro);
        //alu.guardarAlumno(Manuel);
        //agregar materias
//        Materia Historia = new Materia(1, "Historia", 2, true);
//        Materia Matematica = new Materia(2, "Matematica", 3, true);
//        Materia Dibujo = new Materia(3, "Dibujo", 2, true);
        //       MateriaData mat = new MateriaData();
        //   mat.guardarMatera(Matemarica);
        //   mat.guardarMatera(Historia);
        //   mat.guardarMatera(Dibujo);

        InscripcionData id = new InscripcionData();
//
//        Inscripcion insc = new Inscripcion(Juan, Matematica, 7);

        //id.guardarIncripcripcion(insc);
        //id.actualizarNota(1, 2, 9);
//          id.borrarInscripcionMateriaAlumno(1, 2);
    for(Inscripcion inscripcion:id.obtenerInscripciones()){
        System.out.println("id "+inscripcion.getIdInscripcion());
        System.out.println("Apellido "+inscripcion.getAlumno().getApellido());
        System.out.println("Materia "+inscripcion.getMateria().getNombre());
    }
          
    }
}

