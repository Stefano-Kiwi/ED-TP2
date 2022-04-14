package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TorneosAdmin extends TorneoAdminAbstract {

    @Override
    public void agregar(EquipoTorneo equipoTorneo) {
    //this.agregar(equipoTorneo); 
}   


    @Override
    public void ordenar() {
        
        
    }

    @Override
    public List<EquipoTorneo> tablaPosiciones(Torneo torneo) {
        var res= new ArrayList<EquipoTorneo>();
                    System.out.println("nombre del torneo que le pasas por parametro: " + torneo.getNombre());
        for (var equipoTorneo : equipoTorneoList) {
        System.out.println(equipoTorneo.getTorneo().getNombre());
            System.out.println("pepe" );
        if(torneo.getNombre().equals(equipoTorneo.getTorneo().getNombre())){
            System.out.println("PEPE");    
        }    
                    
        }
        return res;
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
