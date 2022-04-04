package org.example.DiagramasClases.Diagrama3;

public class Reserva {
    private Equipaje[] equipaje;

    public Reserva() {
        this.equipaje = new Equipaje[3];
    }

    public void anyadir(Equipaje equipajeNuevo){
        for (int i = 0; i<equipaje.length; i++){
            if (equipaje[i] == null){
                equipaje[i] = equipajeNuevo;
            }
        }
    }
    public int pesar(){
        int pesoTotal = 0;
        for (int i = 0; i<equipaje.length; i++) {
            pesoTotal += equipaje[i].getPeso();
        }
        return pesoTotal;
    }
}
