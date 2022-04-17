package ar.edu.uner.fcad.ed.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/** 
 *
 * @author stefa
 */
public class ClienteScoopsAhoy {
    public static void main(String[] args) {
        FacturaDetalle facturaDetalle1 = new FacturaDetalle(111,new Producto(111, "silla"),20,40.00,80.00);
        List<FacturaDetalle> listaFacturaDetalle = new ArrayList<FacturaDetalle>();
        listaFacturaDetalle.add(facturaDetalle1);
        Empresa empresa1 = new Empresa("101", "pepe", SituacionIVAEnum.CONSUMIDOR_FINAL);
        Factura factura1 = new Factura(TipoFacturaEnum.FACTURA_A, 1, 01, LocalDate.EPOCH,empresa1,listaFacturaDetalle , 0);
        
        System.out.println("factura1 = " + factura1);
    }
}
