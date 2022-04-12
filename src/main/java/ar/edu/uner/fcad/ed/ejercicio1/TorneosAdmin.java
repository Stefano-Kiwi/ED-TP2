package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TorneosAdmin extends TorneoAdminAbstract {

    @Override
    public void agregar(EquipoTorneo equipoTorneo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ordenar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<EquipoTorneo> tablaPosiciones(Torneo torneo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Torneo> todosLosTorneos(Equipo equipo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EquipoTorneo masGoleador() {
        var res= new ArrayList<EquipoTorneo>();
        for (var Equipo : iterable) {
            
        }
        return res;
    }

    @Override
    public EquipoTorneo vallaMenosVencida() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
     return this.equipoTorneoList.toString();
    }


   

}
