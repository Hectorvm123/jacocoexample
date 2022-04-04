package org.example.DiagramasClases.Diagrama1;

import java.util.ArrayList;

public class Lector {
    private int numeroSocio;
    private String nombre;
    private String direccion;
    private int telefono;
    private ArrayList<Sancion> sanciones;
    private Prestamo[] prestamos;

    public Lector(int numeroSocio, String nombre, String direccion, int telefono) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.prestamos = new Prestamo[3];
        this.sanciones = new ArrayList<>();
    }

    public boolean obtenerPrestamo(Prestamo nuevoPrestamo){
        for (int i = 0; i< prestamos.length; i++){
            if (prestamos[i] == null){
                prestamos[i] = nuevoPrestamo;
                return true;
            }
        }
        return false;
    }


    public void devolverPrestamo(Prestamo prestamo){
        for (int i = 0; i< prestamos.length; i++){
            if (prestamos[i].equals(prestamo)){
                prestamo.devolver();
                prestamos[i] = null;
            }
        }
    }

}
