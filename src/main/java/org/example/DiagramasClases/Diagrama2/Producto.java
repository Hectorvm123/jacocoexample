package org.example.DiagramasClases.Diagrama2;

public class Producto {
    private double precio;
    private String nombre;
    private int stock;

    public Producto(double precio, String nombre, int stock) {
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
    }

    public double anyadirIva(){
        return precio*1.21;
    }

    public boolean hayStock(int cantidad){
        if (stock-cantidad < 0){
            return false;
        }
        return true;
    }
}
