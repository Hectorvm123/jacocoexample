package org.example.DiagramasClases.Diagrama3;

public class Billete {
    private int cod;
    private int fila;
    private char letra;
    private Cliente cliente;
    private boolean estaDisponible;

    public Billete(int cod, int fila, char letra, Cliente cliente) {
        this.cod = cod;
        this.fila = fila;
        this.letra = letra;
        this.cliente = cliente;
        this.estaDisponible = true;
    }
}
