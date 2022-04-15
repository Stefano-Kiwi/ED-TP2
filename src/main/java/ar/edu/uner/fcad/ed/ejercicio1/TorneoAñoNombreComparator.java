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
public class TorneoAñoNombreComparator implements Comparator<Torneo>{
    
    @Override
    public int compare(Torneo o1, Torneo o2) {
         int resultado = -1;
        if(o1.getAnio() == o2.getAnio()){
            resultado = 0;
        }else{
            if(o1.getAnio()> o2.getAnio()){
                resultado = 1;
            }
        }
            if(resultado == 0){
                resultado = o1.getNombre().compareTo(o2.getNombre());
            }
        return resultado;
    }
}
