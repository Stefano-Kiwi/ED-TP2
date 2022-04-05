package ar.edu.uner.fcad.ed.ejercicio1;

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
    

}
