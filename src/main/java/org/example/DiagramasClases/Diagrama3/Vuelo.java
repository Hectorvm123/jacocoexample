package org.example.DiagramasClases.Diagrama3;

import org.example.DiagramasClases.Diagrama3.Avion.Avion;

import java.util.Map;

public class Vuelo {
    private String codigo;
    private Avion avion;
    private Aeropuerto aeropuertoSalida;
    private Aeropuerto aeropuertoDestino;
    private double precio;
    private Map<Billete, Boolean> billetes;
    private double precioTotal;


    public Vuelo(String codigo, Avion avion, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoDestino, double precio, Map<Billete, Boolean> billetes) {
        this.codigo = codigo;
        this.avion = avion;
        this.aeropuertoSalida = aeropuertoSalida;
        this.aeropuertoDestino = aeropuertoDestino;
        this.precio = precio;
        this.billetes = billetes;
        this.precioTotal = precio;
    }

    public void anyadirImpuestos(int impuestos){
        this.precioTotal += (impuestos/100);
    }

}
