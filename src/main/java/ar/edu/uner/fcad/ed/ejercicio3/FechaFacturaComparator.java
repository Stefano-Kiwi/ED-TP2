package ar.edu.uner.fcad.ed.ejercicio3;

import java.util.Comparator;

/**
 *
 * @author stefa
 */
public class FechaFacturaComparator implements Comparator<Factura>{
    

    @Override
    public int compare(Factura o1, Factura o2) {
        
        if (o1 == null && o2 == null) {
            return 0;
        } else {
            if (o1 != null && o2 == null) {
                return 1;
            } 
            
            if (o1 == null && o2 != null) {
                return -1;
            }
        }
        
        int resultado = -1;
        
        if(o1 != null && o2 != null){
            if(o1.getFecha().isBefore(o2.getFecha())){
                resultado = -1;
            }else{
                if(o1.getFecha().isAfter(o2.getFecha())){
                    resultado = 1;
                }else{
                    if(o1.getFecha().equals(o2.getFecha()));
                }
            }
           // System.out.println("EL RESULTADOOOOOO DE LA COMPARACION ES: "+resultado);
        }
        
        return resultado;
    }
}

