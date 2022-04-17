package ar.edu.uner.fcad.ed.ejercicio3;

/**
 *
 * @author stefa
 */
public class FacturaDetalle {
    private int numeroItem;
    private Producto producto;
    private int cant;
    private double precioUnitario;
    private double subTotal;

    public FacturaDetalle(int numeroItem, Producto producto, int cant, double precioUnitario, double subTotal) {
        this.numeroItem = numeroItem;
        this.producto = producto;
        this.cant = cant;
        this.precioUnitario = precioUnitario;
        this.subTotal = subTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numeroItem;
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
        final FacturaDetalle other = (FacturaDetalle) obj;
        return this.numeroItem == other.numeroItem;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" + "numeroItem=" + numeroItem + ", producto=" + producto + ", cant=" + cant + ", precioUnitario=" + precioUnitario + ", subTotal=" + subTotal + '}';
    }
    
     
}
