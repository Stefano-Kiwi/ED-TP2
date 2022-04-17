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
public class ClientesDevolverComparator implements Comparator <Credito> {

    @Override
    public int compare(Credito o1, Credito o2) {
        int res = -1;
        res = o1.getTotalDevolver().compareTo(o2.getTotalDevolver());        
        return res;
    }
  
}
    
    
