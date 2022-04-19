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
        for (var equipoTorneo : equipoTorneoList) {
            if (equipoTorneo.getTorneo().equals(torneo)) {
                res.add(equipoTorneo);
            }
        }
        Collections.sort(res,new TorneoComparatorPuntos());
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

    void ordenar(ComparatorEquipoTorneo comparatorEquipoTorneo) {
    }

}
