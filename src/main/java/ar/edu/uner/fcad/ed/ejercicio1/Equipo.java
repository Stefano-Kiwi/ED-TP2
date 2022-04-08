package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.Objects;

/**
 *
 * @author stefa
 */
public class Equipo {
    private String nombre;
    private Ciudad ciudad;

    public Equipo(String nombre, Ciudad ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.nombre);
        hash = 61 * hash + Objects.hashCode(this.ciudad);
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
        final Equipo other = (Equipo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.ciudad, other.ciudad);
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
