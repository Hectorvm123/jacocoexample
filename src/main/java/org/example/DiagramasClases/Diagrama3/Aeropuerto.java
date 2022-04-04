package org.example.DiagramasClases.Diagrama3;

import org.example.DiagramasClases.Diagrama2.Fecha;

import java.time.LocalDateTime;

public class Aeropuerto {
    private String nombre;
    private String pais;
    private String ciudad;
    private LocalDateTime fecha;
    private String terminal;

    public Aeropuerto(String nombre, String pais, String ciudad, LocalDateTime fecha, String terminal) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.terminal = terminal;

    }
}
