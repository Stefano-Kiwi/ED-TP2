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
public class ClientesPorDocumento implements Comparator<Cliente>  {
  
    @Override
    public int compare(Cliente o1, Cliente o2) {
         int res = -1;
         if (o1.getDocumento()==(o2.getDocumento())) {
          res = 0;  
        }else{
             if (o1.getDocumento()>o2.getDocumento()) {
                 res = 1;    
             }
         }       
        return res;
    }
    
}
