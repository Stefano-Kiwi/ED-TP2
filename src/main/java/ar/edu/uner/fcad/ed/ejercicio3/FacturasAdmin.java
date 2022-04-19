package ar.edu.uner.fcad.ed.ejercicio3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author stefa
 */
public class FacturasAdmin extends FacturasAdminAbstract {

    @Override
    public List<Factura> buscarFacturasPorMesAnio(int mes, int anio) {
       
        List<Factura> res = new ArrayList<Factura>();
        for(var factura : facturasList){
            if((factura.getFecha().getMonth().equals(Month.of(mes))) && (factura.getFecha().getYear()== anio) ){
               res.add(factura);
            }
        }
        return res;
    }

    @Override
    public List<Factura> buscarFacturasPorProveedor(Empresa empresa) {
      List<Factura> res = new ArrayList<Factura>();
        for(var factura : facturasList){
            if((factura.getProveedor().equals(empresa))){
               res.add(factura);
            }
        }
        return res;
    }

    @Override
    public Factura facturaMasCostosa() {
        Factura res = facturasList.get(0);
         for(Factura factura : facturasList){
            if((factura.getImpTotal() > res.getImpTotal())){
               res = factura;
            }
        }
         return res;
    }

    @Override
    public List<ProductoCantidad> top5ProductoCantidad() {
        List<ProductoCantidad> top5ProductoCantidadAux = new ArrayList();
        List<ProductoCantidad> top5ProductoCantidad = new ArrayList();
        Factura factura1;
        for (Factura factura : facturasList) { // Hago que itere la lista de facturas
            
            factura1 = factura;
            for (FacturaDetalle facturaDetalle : factura1.getDetalleFactura()) { // Hago que itere detalleFactura, donde tengo producto y cantidad
                
                for (ProductoCantidad productoCantidad1 : top5ProductoCantidadAux) { // Itero donde quiero guardar las cosas
                    
                    if(productoCantidad1.getProducto().equals(facturaDetalle.getProducto())){
                        //System.out.println("YA ESTABA EL PRODUCTOOOOOOOOOO");
                        // SI YA ESTABA EL PRODUCTO
                        productoCantidad1.sumarCantidad(facturaDetalle.getCant());
                    }else{
                        // SI NO ESTABA YA ESE PRODUCTO AHI
                        //System.out.println("NO ESTABA EL PRODUCTOOOOOOOOOOOOOOOO");
                        top5ProductoCantidadAux.add(new ProductoCantidad(facturaDetalle.getProducto(),facturaDetalle.getCant()));
                    }
                }
            }
        }
        
        //for (int i = 0; i < 5; i++) {   // Aca se sortean solo los 5 mas comprados
        //    ProductoCantidad productoCantidad = Collections.max(top5ProductoCantidad);
        //    top5ProductoCantidad.add(productoCantidad);
        //}
        return top5ProductoCantidad;
    }

}
