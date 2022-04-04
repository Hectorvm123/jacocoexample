package org.example.DiagramasClases.Diagrama2.MetodoPago;

import org.example.DiagramasClases.Diagrama2.Fecha;

import java.util.Scanner;

public class MetodosDePago {
    public MetodosDePago() {
    }

    public MetodosDePago elegirMetodoPago(){
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                String numero = teclado.nextLine();
                Fecha fechaCaducidad = new Fecha(teclado.nextInt(),teclado.nextInt());
                TargetaCredito targeta = new TargetaCredito(numero ,fechaCaducidad);
            case 2:
                String divisa = teclado.nextLine();
                return new Transferencia(divisa);
            case 3:
                int numeroXeque = teclado.nextInt();
                String nombreEntidad = teclado.nextLine();
                return new Xeque(numeroXeque,nombreEntidad);
            case 4:
                String cartera = teclado.nextLine();
                return new CriptoMoneda(cartera);
        }
        return null;
    }
}
