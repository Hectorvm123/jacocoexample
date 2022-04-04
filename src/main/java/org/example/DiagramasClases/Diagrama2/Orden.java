package org.example.DiagramasClases.Diagrama2;

import org.example.DiagramasClases.Diagrama2.MetodoPago.MetodosDePago;

import java.util.HashMap;
import java.util.Map;

public class Orden {
    private int precioFijo;
    private Fecha fecha;
    private HashMap<Producto, Integer> productos;

    public Orden(int precioFijo, Fecha fecha) {
        this.precioFijo = precioFijo;
        this.fecha = fecha;
        productos = new HashMap<>();
    }

    public void obtenerCantidadProducto(Producto producto){
        if (productos.containsKey(producto)){
            System.out.println(productos.get(producto));
        }
    }

    public double obtenerImporteTotal(){
        int importeTotal = 0;
        for (Map.Entry<Producto, Integer> aux: productos.entrySet()){
            importeTotal += aux.getKey().anyadirIva();

        }
        return importeTotal;
    }

    public void pedirProducto(Producto producto, Integer cantidad){
        if (producto.hayStock(cantidad)) {
            productos.put(producto, cantidad);
        }else {
            System.out.println("No hay suficiente stock");
        }
    }

    public void pagar(){
        MetodosDePago metodosDePago = new MetodosDePago();
        metodosDePago.elegirMetodoPago();

    }
}
