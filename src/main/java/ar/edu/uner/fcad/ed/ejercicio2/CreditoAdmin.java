package ar.edu.uner.fcad.ed.ejercicio2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author David Zarcó
 */

public class CreditoAdmin extends CreditoAdminAbstract {

//creditosList    
    
 /*
 * Devuelve todos los créditos otorgados a los clientes cuyo tipo es
 * pasado por parámetro
 * @param tipo
 * @return
 */    
   public  List<Credito> creditosPorClienteTipo(ClienteTipoEnum tipo){
      var res= new ArrayList<Credito>();
      for(var credito : creditosList){
          if (credito.getClienteTipo().getTipo() == tipo){
              res.add(credito);
          }
      }
    return res;   
}
  
   
/*
 * Devuelve todos los créditos otorgados del tipo y sucursal especificados.
 * @param tipo
 * @param sucursal
 * @return
 */
   public  List<Credito> creditosPorCreditoTipoySucursal(CreditoTipo tipo,Sucursal sucursal){
       var res= new ArrayList<Credito>();
        for(var credito : creditosList){   
            if (credito.getTipo().getDescripcion().equals(tipo.getDescripcion())) {
                if (credito.getTipo().getMontoMinimo().equals(tipo.getMontoMinimo())) {
                    if (credito.getTipo().getMontoMaximo().equals(tipo.getMontoMaximo())) {
                     if (credito.getTipo().getAniosMinimo()==(tipo.getAniosMinimo())) {
                          if (credito.getTipo().getAniosMaximo()==(tipo.getAniosMaximo())) {
                               if (credito.getTipo().getClienteTipo()==(tipo.getClienteTipo())) {
                                    if (credito.getTipo().getTasaInteres().equals(tipo.getTasaInteres())) {
                                        if(credito.getSucursal().equals(sucursal)){
                                        res.add(credito);
                                        }   
                                    }
                                }
                            }
                         
                        }
                    }
                }
 
            }
        }
            return res;
   }
 
   
   
 /*
 * Devuelve los créditos cuyo monto es inferior a monto.
* @param monto
 * @return
 */
   public List<Credito> creditosInferioresA(double monto){
     var res= new ArrayList<Credito>();
      for(var credito : creditosList){
          if (credito.getMontoAcordado()< monto){
              res.add(credito);
          }
      }
    return res;
   }

  /*
 * Devuelve los créditos cuyo monto es superior a monto.
 * @param monto
 * @return
 */ 
   public List<Credito> creditosSuperioresA(double monto){
        var res= new ArrayList<Credito>();
      for(var credito : creditosList){
          if (credito.getMontoAcordado() > monto){
              res.add(credito);
          }
      }
    return res;
   }

   
   /**
 * Ordena los créditos por el criterio especificado en compareTo()
 */
public void ordenar(){
    Collections.sort(creditosList);
    }

   /*
 * Ordena los créditos por el criterio pasado por parámetro.
 * @param comparator
 */
   public void ordenar(Comparator comparator){
       creditosList.sort(comparator);
        }
   
  /*
 * Transforma en String todas las instancias de Credito almacenadas
 * en creditosList
 * @return
 */
   @Override
   public String toString(){
      return this.creditosList.toString();
   }
   
}


