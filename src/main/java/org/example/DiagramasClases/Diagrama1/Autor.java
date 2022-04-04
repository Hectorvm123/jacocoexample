package org.example.DiagramasClases.Diagrama1;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private Fecha fechaNacimiento;

    public Autor(String nombre, String nacionalidad, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
}
