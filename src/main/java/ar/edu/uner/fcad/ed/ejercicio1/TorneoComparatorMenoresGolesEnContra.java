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
public class TorneoComparatorMenoresGolesEnContra implements Comparator<EquipoTorneo> {
  @Override
    public int compare(EquipoTorneo o1, EquipoTorneo o2) {
        int antigoleador = -1;
        if (o1.getGolesEnContra()==o2.getGolesEnContra()) {
        antigoleador = 0;    
        }else{
         if (o1.getGolesEnContra()>o2.getGolesEnContra()){
                antigoleador= 1;
         }   
        }
        return antigoleador;
    }
}
    