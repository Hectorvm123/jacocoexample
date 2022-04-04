package org.example.DiagramasClases.Diagrama2.MetodoPago;

import org.example.DiagramasClases.Diagrama2.Fecha;

public class TargetaCredito extends MetodosDePago{
    private String numero;
    private Fecha fechaCaducidad;

    public TargetaCredito(String numero, Fecha fechaCaducidad) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }
}
