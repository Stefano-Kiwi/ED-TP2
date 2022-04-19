/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio2;

import java.util.Comparator;

/**
 *
 * @author David Zarcó
 */
public class ClientesPorDocumento implements Comparator<Credito>  {
  
    @Override
    public int compare(Credito o1, Credito o2) {
         int res = -1;
         if (o1.getCliente().getDocumento()==(o2.getCliente().getDocumento())) {
          res = 0;  
        }else{
             if (o1.getCliente().getDocumento()>o2.getCliente().getDocumento()) {
                 res = 1;    
             }
         }       
        return res;
    }
    
}
