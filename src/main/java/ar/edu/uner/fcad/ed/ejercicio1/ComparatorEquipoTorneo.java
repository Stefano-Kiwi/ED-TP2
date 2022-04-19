/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.Comparator;

/**
 *
 * @author David Zarcó
 */
public class ComparatorEquipoTorneo implements Comparator<Torneo> {
    @Override
    public int compare(Torneo o1, Torneo o2) {
        int res = -1;
        if (o1.getAnio()==o2.getAnio()) {
            if (o1.getNombre().equals(o2.getNombre())) {
             res=0;   
            }else{
                res=1;
            }
        }else{
         if (o1.getAnio()>o2.getAnio()){
                res= 1;
         }   
        }
    return res;
    } 
}
