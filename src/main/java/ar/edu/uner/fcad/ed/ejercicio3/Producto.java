package ar.edu.uner.fcad.ed.ejercicio3;

import java.util.Objects;

/**
 *
 * @author stefa
 */
public class Producto {
    private int codigo;
    private String desc;

    public Producto(int codigo, String desc) {
        this.codigo = codigo;
        this.desc = desc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.codigo;
        hash = 79 * hash + Objects.hashCode(this.desc);
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
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return Objects.equals(this.desc, other.desc);
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", desc=" + desc + '}';
    }
    
}
