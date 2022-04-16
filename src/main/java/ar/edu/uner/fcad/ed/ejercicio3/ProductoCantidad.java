package ar.edu.uner.fcad.ed.ejercicio3;

import java.util.Objects;

/**
 *
 * @author stefa
 */
class ProductoCantidad {
    private Producto producto;
    private int cant;

    public ProductoCantidad(Producto producto, int cant) {
        this.producto = producto;
        this.cant = cant;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.producto);
        hash = 37 * hash + this.cant;
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
        final ProductoCantidad other = (ProductoCantidad) obj;
        if (this.cant != other.cant) {
            return false;
        }
        return Objects.equals(this.producto, other.producto);
    }

    

    @Override
    public String toString() {
        return "ProductoCantidad{" + "producto=" + producto + ", cant=" + cant + '}';
    }
    
}
