package org.example.DiagramasClases.Diagrama1;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Prestamo {
    private final static int MAXIMO_DIAS = 30;
    private Ejemplar ejemplar;
    private LocalDateTime fechaPrestamo;
    private LocalDateTime fechaLimite;
    private LocalDateTime fechaDevolucion;
    private Sancion sancion;

    public Prestamo(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
        this.fechaPrestamo = LocalDateTime.now();
        this.fechaLimite = fechaPrestamo.plus(MAXIMO_DIAS, ChronoUnit.DAYS);
        this.fechaDevolucion = devolver();
        this.sancion = new Sancion();
    }

    public LocalDateTime devolver(){
        if (fechaDevolucion.isAfter(fechaLimite)) {
            for (LocalDateTime i = fechaLimite; fechaLimite.isBefore(fechaDevolucion); fechaLimite.plus(1, ChronoUnit.DAYS)) {
                sancion.sancionar();
            }
        }
        return  LocalDateTime.now();
    }

}
