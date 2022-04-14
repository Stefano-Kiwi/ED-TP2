package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TorneosAdmin extends TorneoAdminAbstract {

    @Override
    public void agregar(EquipoTorneo equipoTorneo) {
<<<<<<< HEAD
    this.agregar(equipoTorneo);    
=======
        this.equipoTorneoList.add(equipoTorneo);
>>>>>>> 14b4e5de4a1cf41743b16d485088c36cf922c60b
        
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
<<<<<<< HEAD
        var res= new EquipoTorneo();
        int aux=0;
        for (var equipoTorneo : equipoTorneoList) {
            if (equipoTorneo.getGolesAFavor()>aux) {
            aux=equipoTorneo.getGolesAFavor();
            res= equipoTorneo;    
=======
        int aux = 0;
        var goleador= new EquipoTorneo();
        for (var equipoTorneo : equipoTorneoList) {
            if (equipoTorneo.getGolesAFavor()>aux) {
                goleador = equipoTorneo;
                aux = equipoTorneo.getGolesAFavor();
>>>>>>> 14b4e5de4a1cf41743b16d485088c36cf922c60b
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
