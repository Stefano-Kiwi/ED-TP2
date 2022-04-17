package ar.edu.uner.fcad.ed.ejercicio3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
