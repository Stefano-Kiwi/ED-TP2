package ar.edu.uner.fcad.ed.ejercicio3;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Factura implements Comparable<Factura>{
    private TipoFacturaEnum tipoFactura;
    private int puntoVenta;
    private int numero;
    private LocalDate fecha;
    private Empresa proveedor;
    private List<FacturaDetalle> detalleFactura;
    private double impTotal;

    public Factura(TipoFacturaEnum tipoFactura, int puntoVenta, int numero, LocalDate fecha, Empresa proveedor, List<FacturaDetalle> detalleFactura, double impTotal) {
        this.tipoFactura = tipoFactura;
        this.puntoVenta = puntoVenta;
        this.numero = numero;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.detalleFactura = detalleFactura;
        this.impTotal = impTotal;
    }

    public TipoFacturaEnum getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(TipoFacturaEnum tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public int getPuntoVenta() {
        return puntoVenta;
    }

    public void setPuntoVenta(int puntoVenta) {
        this.puntoVenta = puntoVenta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Empresa getProveedor() {
        return proveedor;
    }

    public void setProveedor(Empresa proveedor) {
        this.proveedor = proveedor;
    }

    public List<FacturaDetalle> getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(List<FacturaDetalle> detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public double getImpTotal() {
        return impTotal;
    }

    public void setImpTotal(double impTotal) {
        this.impTotal = impTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numero;
        hash = 97 * hash + Objects.hashCode(this.fecha);
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
        final Factura other = (Factura) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }

    @Override
    public String toString() {
        return "Factura{" + "tipoFactura=" + tipoFactura + ", puntoVenta=" + puntoVenta + ", numero=" + numero +
                ", fecha=" + fecha + ", proveedor=" + proveedor+ "\n" + ", detalleFactura=" + detalleFactura + ", impTotal=" + impTotal + '}'+"\n";
    }

    @Override
    public int compareTo(Factura o) {
         int resultado = 0;
         resultado = this.proveedor.compareTo(o.getProveedor());
         if(resultado == 0){
             if(this.puntoVenta == o.getPuntoVenta()){
                 resultado = 0;
             }else{
                 if(this.puntoVenta > o.getPuntoVenta()){
                     resultado = 1;
                 }else{
                     if(this.puntoVenta < o.getPuntoVenta()){
                         resultado = -1;
                     }
                 }
             }
         }
         if(resultado == 0){
             if(this.numero == o.getNumero()){
                 resultado = 0;
             }else{
                 if(this.numero > o.getNumero()){
                     resultado = 1;
                 }else{
                     if(this.numero < o.getNumero()){
                         resultado = -1;
                     }
                 }
             }
         }
         return resultado;
        }
        
    }
    
    
    
    

