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
            resultado = o1.getFecha().compareTo(o2.getFecha());
        }
        
        return resultado;
    }
}

