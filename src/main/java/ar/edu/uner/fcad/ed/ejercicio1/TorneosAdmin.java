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
        var res= new ArrayList<EquipoTorneo>();
        for (var equipoTorneo : equipoTorneoList) {
            if () {
                
                
            }    
        }
        return null;
    }

    @Override
    public List<Torneo> todosLosTorneos(Equipo equipo) {
        
        return null;
    }

    @Override
    public EquipoTorneo masGoleador() {
        int aux = 0;
        var goleador= new EquipoTorneo();
        for (var equipoTorneo : equipoTorneoList) {
            if (equipoTorneo.getGolesAFavor()>aux) {
                goleador = equipoTorneo;
                aux = equipoTorneo.getGolesAFavor();
            }    
        }
        return goleador;
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
