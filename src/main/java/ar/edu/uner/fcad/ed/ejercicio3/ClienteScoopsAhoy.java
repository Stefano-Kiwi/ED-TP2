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
        Producto almohada = new Producto(01, "una almohada con detalles azules");
        Producto sommier = new Producto(02, "Un sommier cómodo y económico");
        Producto pala = new Producto(03, "Una pala para jardinería");
        Producto monopoly = new Producto(04, "Un juego para toda la familia");
        Producto guitarra = new Producto(05, "Una guitarra afinada lista para tocar uno del chaqueño");
        Producto violin = new Producto(06, "Un violin amarillo");
        
        LocalDate fecha1 = LocalDate.of(2020, Month.MARCH, 10);
        LocalDate fecha2 = LocalDate.of(2042, Month.JULY, 21);
        LocalDate fecha3 = LocalDate.of(2001, Month.DECEMBER,31);
        LocalDate fecha4 = LocalDate.of(2020, Month.MARCH, 14);
        
        
        FacturaDetalle facturaDetalle1 = new FacturaDetalle(111,almohada,20,40);
        FacturaDetalle facturaDetalle2 = new FacturaDetalle(22,sommier,2,50);
        FacturaDetalle facturaDetalle3 = new FacturaDetalle(45, pala, 30, 20);
        FacturaDetalle facturaDetalle4 = new FacturaDetalle(28, monopoly, 1, 15);
        FacturaDetalle facturaDetalle5 = new FacturaDetalle(23, guitarra, 45, 20);
        FacturaDetalle facturaDetalle6 = new FacturaDetalle(40, violin, 2, 40);
        
        
        List<FacturaDetalle> listaFacturaDetalle1 = new ArrayList<FacturaDetalle>();
        listaFacturaDetalle1.add(facturaDetalle1);
        listaFacturaDetalle1.add(facturaDetalle2);
        listaFacturaDetalle1.add(facturaDetalle3);
        
        List<FacturaDetalle> listaFacturaDetalle2 = new ArrayList<FacturaDetalle>();
        listaFacturaDetalle2.add(facturaDetalle4);
        listaFacturaDetalle2.add(facturaDetalle5);
        listaFacturaDetalle2.add(facturaDetalle6);
        
        Empresa empresa1 = new Empresa("101", "pepe", SituacionIVAEnum.CONSUMIDOR_FINAL);
        Empresa empresa2 = new Empresa("404", "carlitos", SituacionIVAEnum.RESP_MONOTRIBUTO);
        Factura factura1 = new Factura(TipoFacturaEnum.FACTURA_A, 1, 01, fecha1,empresa1,listaFacturaDetalle1 , 100);
        Factura factura2 = new Factura(TipoFacturaEnum.FACTURA_C,2,05,fecha2,empresa2,listaFacturaDetalle2, 4000);
        
        
        System.out.println("factura1 = " + factura1+ "\n");
        
        FacturasAdmin facturaAdmin = new FacturasAdmin();
        facturaAdmin.add(factura1);
        facturaAdmin.remove(0);
        facturaAdmin.add(factura1);
        facturaAdmin.add(factura2);
        
        System.out.println("facturaAdmin sin ordenar = " + facturaAdmin+ "\n");
        facturaAdmin.ordenar();
        System.out.println("facturaAdmin ordenada (según proveedor y num factura): = " + facturaAdmin+ "\n");
        facturaAdmin.ordenar(new FechaFacturaComparator()); 
        System.out.println("facturaAdmin ordenada por Fecha = " + facturaAdmin+ "\n");
        
        
        System.out.println("Filtrado por mes y año (03/2020): "+facturaAdmin.buscarFacturasPorMesAnio(3, 2020)+ "\n");
        System.out.println("Filtrado por proveedor(empresa1): "+facturaAdmin.buscarFacturasPorProveedor(empresa1)+ "\n");
        System.out.println("Factura con mayor importe total: "+facturaAdmin.facturaMasCostosa()+ "\n");
        //System.out.println("Top 5 productos que más se compraron: "+facturaAdmin.top5ProductoCantidad()); // DEBEMOS IMPLEMENTAR ESTO
    }
}
