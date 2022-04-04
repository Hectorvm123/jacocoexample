package org.example.DiagramasClases.Diagrama1;

import java.time.LocalDateTime;

public class Fecha {
    private int dia;
    private int mes;
    private int anyo;

    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public Fecha() {
        LocalDateTime hoy = LocalDateTime.now();
        this.dia = hoy.getDayOfMonth();
        this.mes = hoy.getMonthValue();
        this.anyo = hoy.getYear();
    }
}
