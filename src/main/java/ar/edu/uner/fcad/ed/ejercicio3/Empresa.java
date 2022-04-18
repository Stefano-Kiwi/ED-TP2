package ar.edu.uner.fcad.ed.ejercicio3;

import java.util.Objects;

/**
 *
 * @author stefa
 */
public class Empresa implements Comparable<Empresa>{
    private String cuit;
    private String razonSocial;
    private SituacionIVAEnum situacionIVA;

    public Empresa(String cuit, String razonSocial, SituacionIVAEnum situacionIVA) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.situacionIVA = situacionIVA;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public SituacionIVAEnum getSituacionIVA() {
        return situacionIVA;
    }

    public void setSituacionIVA(SituacionIVAEnum situacionIVA) {
        this.situacionIVA = situacionIVA;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.cuit);
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
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.cuit, other.cuit);
    }

    @Override
    public String toString() {
        return "Empresa{" + "cuit=" + cuit + ", razonSocial=" + razonSocial + ", situacionIVA=" + situacionIVA + '}';
    }

    @Override
    public int compareTo(Empresa o) {
         int resultado = 0;
         resultado = this.getCuit().compareTo(o.getCuit());
         if(resultado == 0){
             if(this.razonSocial.equals(o.getRazonSocial())){
                 resultado = 0;
             } //else{
                 //if(this.razonSocial > o.getRazonSocial()){
                  //   resultado = 1;
                 //}else{
                   //  if(this.razonSocial < o.getRazonSocial()){
                     //    resultado = -1;
                    // }
                 //}
             }
         
        
        return resultado;
    }

    
}
