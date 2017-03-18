package Cursada.guia4;


public class Legajo {
    private String nombreCompleto;
    private String direccion;
    private int numeroTelefono;

    public Legajo(String unNombreCompleto, String unaDireccion, int unNumero){
        nombreCompleto = unNombreCompleto;
        direccion = unaDireccion;
        numeroTelefono = unNumero;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }
}
