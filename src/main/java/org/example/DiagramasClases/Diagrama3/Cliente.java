package org.example.DiagramasClases.Diagrama3;

public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private Reserva reserva;

    public Cliente(String dni, String nombre, String apellidos, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.reserva = new Reserva();
    }

    public void anyadirEquipaje(Equipaje equipaje){
        reserva.anyadir(equipaje);
    }

    public int obtenerPesoMaletas(){
        return reserva.pesar();
    }
}
