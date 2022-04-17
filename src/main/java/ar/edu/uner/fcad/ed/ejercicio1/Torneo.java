package ar.edu.uner.fcad.ed.ejercicio1;

public class Torneo {
    private String nombre;
    private int anio;

    public Torneo(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Torneo{" + "nombre=" + nombre + ", anio=" + anio + '}';
    }
    
}
