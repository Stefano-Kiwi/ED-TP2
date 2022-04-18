package ar.edu.uner.fcad.ed.ejercicio2;

/**
 *
 * @author stefa
 */
public class Credito implements Comparable <Credito> {

        private int numeroDeCredito;
        private CreditoTipo tipo;
        private Cliente cliente;
        private Double montoAcordado;
        private int plazoAnios;
        private Sucursal sucursal;
        private Double totalDevolver;

    public Credito(int numero, CreditoTipo tipo, Cliente cliente, Double montoAcordado, int plazoAnios, Sucursal sucursal, Double totalDevolver) {
        this.numeroDeCredito = numero;
        this.tipo = tipo;
        this.cliente = cliente;
        this.montoAcordado = montoAcordado;
        this.plazoAnios = plazoAnios;
        this.sucursal = sucursal;
        this.totalDevolver = montoAcordado*tipo.getTasaInteres();
    }

    public Credito() {
    }
    

    public int getNumero() {
        return numeroDeCredito;
    }

    public void setNumero(int numero) {
        this.numeroDeCredito = numero;
    }

    public CreditoTipo getTipo() {
        return tipo;
    }

    public void setTipo(CreditoTipo tipo) {
        this.tipo = tipo;
    }

    public Cliente getClienteTipo() {
        return cliente;
    }

    public void setClienteTipo(Cliente clienteTipo) {
        this.cliente = clienteTipo;
    }
    
    
    public void setMontoAcordado (Double montoAcordado) throws Exception  {
    
        if (montoAcordado > this.tipo.getMontoMaximo() || montoAcordado < this.tipo.getMontoMinimo()) {
        throw new Exception("El monto acordado es mayor al Maximo o es menor al minimo disponible");  
        }else{
        this.montoAcordado = montoAcordado;
        }
    }
   
    public Double getMontoAcordado() {
        return montoAcordado;
    }

    public int getPlazoAnios() {
        return plazoAnios;
    }

    public void setPlazoAnios(int plazoAnios) {
        this.plazoAnios = plazoAnios;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Double getTotalDevolver() {
        return totalDevolver;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.numeroDeCredito;
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
        final Credito other = (Credito) obj;
        return this.numeroDeCredito == other.numeroDeCredito;
    }

    @Override
    public String toString() {
        return "Credito{" + "numeroDeCredito=" + numeroDeCredito + ", tipo=" + tipo +"\n"+ "clienteTipo=" + cliente + ", montoAcordado=" + montoAcordado + ", plazoAnios=" + plazoAnios + ", sucursal=" + sucursal + ", totalDevolver=" + totalDevolver + '}'+"\n";
    }

    @Override
    public int compareTo(Credito o) {
             int resultado = -1;
        
        if(this.numeroDeCredito == o.getNumero()){
            resultado = 0;
        }else{
            if(this.numeroDeCredito > o.getNumero()){
                resultado = 1;
            }
        }
        return resultado;
    }
    }
        
        
    

