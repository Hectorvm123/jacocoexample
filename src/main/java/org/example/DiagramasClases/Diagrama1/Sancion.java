package org.example.DiagramasClases.Diagrama1;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Sancion {
    private final static int CASTIGO = 2;
    private int sancion;

    public Sancion() {
        this.sancion = 0;
    }

    public void sancionar(){
        sancion +=CASTIGO;
    }
}
