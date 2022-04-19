package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TorneosAdmin extends TorneoAdminAbstract {

    @Override
    public void agregar(EquipoTorneo equipoTorneo) {
    this.equipoTorneoList.add(equipoTorneo);
    
}   


    @Override
    public void ordenar() {
     Collections.sort(equipoTorneoList);    
    }
/** Devuelve la tabla de posiciones para el torneo pasado como parámetro.
 * De esta forma los equipos quedan en orden descendente de puntos,
 * diferencia de gol, * partidos ganados y empatados */

    @Override
    public List<EquipoTorneo> tablaPosiciones(Torneo torneo) {  
        var res= new ArrayList<EquipoTorneo>();
//        int cantidad = 0;
    
       EquipoTorneo aux;
            System.out.println(torneo);
        for (var equipoTorneo : equipoTorneoList) {
            if (equipoTorneo.getTorneo().equals(torneo)) {
                res.add(equipoTorneo);
            }
        }
        Collections.sort(res,new TorneoComparatorPuntos());
    
//        
//        int indice = 0;
//         EquipoTorneo [] arrayaux = new EquipoTorneo[cantidad];
//         for (var equipoTorneo : equipoTorneoList) {
//            if (equipoTorneo.getTorneo().equals(torneo)) {
//                arrayaux[indice++] = equipoTorneo;
//            }
//         }
//         for ( int i=0; i<arrayaux.length-1; i++){
//             for (int j=0; j<arrayaux.length-1;j++){
//                 if(arrayaux[j].getPuntos() <= arrayaux[j+1].getPuntos()){
//                     aux = arrayaux[j];
//                     arrayaux[j] = arrayaux[j+1];
//                     arrayaux[j+1] = aux;
//                 }
//              }
//            }
//         for ( int i=0; i<(arrayaux.length); i++){
//            res.add(arrayaux[i]);
//        }           
        return res;
    }

    @Override
    public List<Torneo> todosLosTorneos(Equipo equipo) {
           var res= new ArrayList<Torneo>();
           for (var equipoTorneo :  equipoTorneoList){
               if (equipoTorneo.getEquipo().equals(equipo)){
                   res.add(equipoTorneo.getTorneo());
               }
           }
        return res;
    }

    @Override
    public EquipoTorneo masGoleador() {
        EquipoTorneo goleador = new EquipoTorneo();
        goleador=Collections.max(equipoTorneoList, new TorneoComparatorGolesMayor());
        return goleador;
    }

    @Override
    public EquipoTorneo vallaMenosVencida() {
        EquipoTorneo goleador = new EquipoTorneo();
        goleador=Collections.min(equipoTorneoList, new TorneoComparatorMenoresGolesEnContra());
        return goleador;
    }

    @Override
    public String toString() {
     return this.equipoTorneoList.toString();
    }

}
