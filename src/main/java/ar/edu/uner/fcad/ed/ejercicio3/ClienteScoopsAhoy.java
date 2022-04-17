package ar.edu.uner.fcad.ed.ejercicio3;

import java.time.LocalDate;
import java.time.Month;
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
        LocalDate fecha1 = LocalDate.of(2020, Month.MARCH, 14);
        
        Empresa empresa1 = new Empresa("101", "pepe", SituacionIVAEnum.CONSUMIDOR_FINAL);
        Factura factura1 = new Factura(TipoFacturaEnum.FACTURA_A, 1, 01, fecha1,empresa1,listaFacturaDetalle , 0);
        
        System.out.println("factura1 = " + factura1);
        
        FacturasAdmin facturaAdmin = new FacturasAdmin();
        facturaAdmin.add(factura1);
        facturaAdmin.remove(0);
        facturaAdmin.add(factura1);
        facturaAdmin.ordenar();
        facturaAdmin.ordenar(c); // DEBEMOS IMPLEMENTAR ESTO
        
        System.out.println("Filtrado por mes y año: "+facturaAdmin.buscarFacturasPorMesAnio(3, 2020));
        System.out.println("Filtrado por proveedor: "+facturaAdmin.buscarFacturasPorProveedor(empresa1));
        System.out.println("Factura con mayor importe total: "+facturaAdmin.facturaMasCostosa());
        System.out.println("Top 5 productos que más se compraron: "+facturaAdmin.top5ProductoCantidad()); // DEBEMOS IMPLEMENTAR ESTO
    }
}
