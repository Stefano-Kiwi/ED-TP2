package ar.edu.uner.fcad.ed.ejercicio2;

/**
 *
 * @author stefa
 */
public class CreditoTipo {
      private String descripcion;
      private Double montoMinimo;
      private Double montoMaximo;
      private int aniosMinimo;
      private int aniosMaximo;
      private ClienteTipoEnum clienteTipo;
      private Double tasaInteres;

    public CreditoTipo(String descripcion, Double montoMinimo, Double montoMaximo, int aniosMinimo, int aniosMaximo, ClienteTipoEnum clienteTipo, Double tasaInteres) {
        this.descripcion = descripcion;
        this.montoMinimo = montoMinimo;
        this.montoMaximo = montoMaximo;
        this.aniosMinimo = aniosMinimo;
        this.aniosMaximo = aniosMaximo;
        this.clienteTipo = clienteTipo;
        this.tasaInteres = tasaInteres;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(Double montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    public Double getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(Double montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public int getAniosMinimo() {
        return aniosMinimo;
    }

    public void setAniosMinimo(int aniosMinimo) {
        this.aniosMinimo = aniosMinimo;
    }

    public int getAniosMaximo() {
        return aniosMaximo;
    }

    public void setAniosMaximo(int aniosMaximo) {
        this.aniosMaximo = aniosMaximo;
    }

    public ClienteTipoEnum getClienteTipo() {
        return clienteTipo;
    }

    public void setClienteTipo(ClienteTipoEnum clienteTipo) {
        this.clienteTipo = clienteTipo;
    }

    public Double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String toString() {
        return "CreditoTipo{" + "descripcion=" + descripcion + ", montoMinimo=" + montoMinimo + ", montoMaximo=" + montoMaximo + ", aniosMinimo=" + aniosMinimo + ", aniosMaximo=" + aniosMaximo + ", clienteTipo=" + clienteTipo + ", tasaInteres=" + tasaInteres + '}';
    }
         
      
}
