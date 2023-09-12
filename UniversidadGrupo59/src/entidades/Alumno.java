
package entidades;

import java.time.LocalDate;

public class Alumno {
    private int idAlumno; 
    private int dni;
    private String nombre;
    private String Apellido;
    private LocalDate fechaNac;
    private boolean activo;

    public Alumno() {
    }

    public Alumno(int dni, String nombre, String Apellido, LocalDate fechaNac, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.fechaNac = fechaNac;
        this.activo = activo;
    }

    public Alumno(int idAlumno, int dni, String nombre, String Apellido, LocalDate fechaNac, boolean activo) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.fechaNac = fechaNac;
        this.activo = activo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // toString
    
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", dni=" + dni + ", nombre=" + nombre + ", Apellido=" + Apellido + '}';
    }
    
    //constructor
    //otra vez
}
