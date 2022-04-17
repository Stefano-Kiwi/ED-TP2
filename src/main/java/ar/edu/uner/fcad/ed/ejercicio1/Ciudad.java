package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.Objects;

/**
 *
 * @author stefa
 */
public class Ciudad {
    private String nombre;

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ciudad other = (Ciudad) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + '}';
    }
    
}
