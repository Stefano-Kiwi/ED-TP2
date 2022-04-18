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

    public FacturaDetalle(int numeroItem, Producto producto, int cant, double precioUnitario) {
        this.numeroItem = numeroItem;
        this.producto = producto;
        this.cant = cant;
        this.precioUnitario = precioUnitario;
        this.subTotal = cant * precioUnitario;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
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

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
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
