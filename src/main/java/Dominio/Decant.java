package Dominio;

public class Decant {

    private String nombre;
    private String marca;
    private String ml;

    public Decant(String nombre, String marca, String ml, String precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.ml = ml;
        this.precio = precio;
    }


    private String precio;

    public String getPrecio() {
        return precio;
    }

    public String getMl() {
        return ml;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Decants{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", ml=" + ml +
                ", precio=" + precio +
                '}';
    }
}
