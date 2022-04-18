package ar.edu.uner.fcad.ed.ejercicio2;

import java.util.Objects;
import java.util.Comparator;

/**
 *
 * @author stefa
 */
public class Cliente implements Comparable<Cliente>{
   
    private String Apellido, Nombre;
    private int Documento;
    private ClienteTipoEnum Tipo;

    public Cliente(String Apellido, String Nombre, int Documento, ClienteTipoEnum Tipo) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Documento = Documento;
        this.Tipo = Tipo;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getDocumento() {
        return Documento;
    }

    public ClienteTipoEnum getTipo() {
        return Tipo;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public void setTipo(ClienteTipoEnum Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.Apellido);
        hash = 43 * hash + Objects.hashCode(this.Nombre);
        hash = 43 * hash + this.Documento;
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
        final Cliente other = (Cliente) obj;
        if (this.Documento != other.Documento) {
            return false;
        }
        if (!Objects.equals(this.Apellido, other.Apellido)) {
            return false;
        }
        return Objects.equals(this.Nombre, other.Nombre);
    }

    @Override
    public String toString() {
        return "Cliente{" + "Apellido=" + Apellido + ", Nombre=" + Nombre + ", Documento=" + Documento + ", Tipo=" + Tipo + '}';
    } 

    @Override
    public int compareTo(Cliente o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
       
    
}
