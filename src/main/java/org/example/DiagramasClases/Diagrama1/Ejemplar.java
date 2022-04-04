package org.example.DiagramasClases.Diagrama1;

public class Ejemplar {
    private int id;
    private Estado estado;


    public Ejemplar(int id, Estado estado) {
        this.id = id;
        this.estado = estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
