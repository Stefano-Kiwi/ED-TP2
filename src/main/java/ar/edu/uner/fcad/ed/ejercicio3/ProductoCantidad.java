package ar.edu.uner.fcad.ed.ejercicio3;

import java.util.Objects;

/**
 *
 * @author stefa
 */
class ProductoCantidad implements Comparable<ProductoCantidad>{
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    public void sumarCantidad(int cantidad){
        this.cant += cantidad;
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

    @Override
    public int compareTo(ProductoCantidad o) {
        int resultado = -1;
        if (this.getCant() == o.getCant()) {
            resultado = 0;
        } else {
            if (this.getCant() > o.getCant()) {
                resultado = 1;
            } else {
                if (this.getCant() < o.getCant()) {
                    resultado = -1;
                }
            }

        }

        return resultado;
    }

}
