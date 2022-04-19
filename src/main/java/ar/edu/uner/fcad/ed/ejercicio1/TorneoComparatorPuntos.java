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
public class TorneoComparatorPuntos implements Comparator<EquipoTorneo> {

    @Override
    public int compare(EquipoTorneo o1, EquipoTorneo o2) {
        int ptos = -1;
        if (o1.getPuntos()==o2.getPuntos()) {
        ptos = 0;    
        }else{
         if (o1.getPuntos()<o2.getPuntos()){
                ptos= 1;
         }   
        }
        return ptos;
    }
    
}