package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TorneosAdmin extends TorneoAdminAbstract {

    @Override
    public void agregar(EquipoTorneo equipoTorneo) {
    this.agregar(equipoTorneo);    
        
    }

    @Override
    public void ordenar() {
        
        
    }

    @Override
    public List<EquipoTorneo> tablaPosiciones(Torneo torneo) {
        
        return null;
    }

    @Override
    public List<Torneo> todosLosTorneos(Equipo equipo) {
        
        return null;
    }

    @Override
    public EquipoTorneo masGoleador() {
        var res= new EquipoTorneo();
        int aux=0;
        for (var equipoTorneo : equipoTorneoList) {
            if (equipoTorneo.getGolesAFavor()>aux) {
            aux=equipoTorneo.getGolesAFavor();
            res= equipoTorneo;    
            }    
        }
        return res;
    }

    @Override
    public EquipoTorneo vallaMenosVencida() {
        
        return null;
    }

    @Override
    public String toString() {
     return this.equipoTorneoList.toString();
    }


   

}
