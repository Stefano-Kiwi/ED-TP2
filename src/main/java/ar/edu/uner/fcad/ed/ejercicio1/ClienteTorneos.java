package ar.edu.uner.fcad.ed.ejercicio1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class ClienteTorneos {
    public static void main(String[] args) {
        TorneosAdmin Torneos = new TorneosAdmin();
        
        Equipo equipo1 = new Equipo("CABJ", new Ciudad("CABA"));
        Equipo equipo2 = new Equipo("CARP", new Ciudad("CABA"));
        Equipo equipo3 = new Equipo("CASLA", new Ciudad("CABA"));
        Equipo equipo4 = new Equipo("FCB", new Ciudad("CABA"));
        Equipo equipo5 = new Equipo("RMA", new Ciudad("CABA"));
  
        

        Torneo torneo1 = new Torneo("libertadores", 2020);
        EquipoTorneo equipotorneo1 = new EquipoTorneo(equipo1, torneo1, 12, 2, 6, 4, 2, 3);
        EquipoTorneo equipotorneo2 = new EquipoTorneo(equipo2, torneo1, 12, 2, 6, 4, 4, 5);
        EquipoTorneo equipotorneo3 = new EquipoTorneo(equipo3, torneo1, 12, 2, 6, 4, 6, 7);

        //administrador.tablaPosiciones(torneo1);
        /*
        Segundo torneo
        
        */
        Equipo barsa = new Equipo("barcelona", new Ciudad("Madrid"));
        Equipo manzana = new Equipo("manzanero", new Ciudad("Concordia"));
        Equipo salsamora = new Equipo("salseros", new Ciudad("Republica del Congo"));
        
        Torneo torneo2 = new Torneo("copaMilk", 2009);
        EquipoTorneo equipo01 = new EquipoTorneo(barsa, torneo2, 10, 0, 0, 0, 0, 0);
        EquipoTorneo equipo02 = new EquipoTorneo(manzana, torneo2, 10, 0, 0, 0, 0, 0);
        EquipoTorneo equipo03 = new EquipoTorneo(salsamora, torneo2, 10, 0, 0, 0, 0, 0);
      
        System.out.println("Cantidad de puntos que le corresponde:" +equipotorneo1.getPuntos());
        System.out.println("Diferencia entre goles:"+equipotorneo1.getDiferenciaGol());
        Torneos.agregar(equipotorneo1);
        Torneos.agregar(equipotorneo2);
        Torneos.agregar(equipotorneo3);
        System.out.println("Mayor goleador: "+Torneos.masGoleador());
        System.out.println("Torneos participados por (Equipo): "+Torneos.todosLosTorneos(new Equipo("CABJ",new Ciudad("CABA"))));
    }
}
