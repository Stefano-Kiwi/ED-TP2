package ar.edu.uner.fcad.ed.ejercicio1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author stefa
 */
public class ClienteTorneos {
    public static void main(String[] args) {
        TorneosAdmin Torneos = new TorneosAdmin();
        
        Equipo equipo1 = new Equipo("CABJ",new Ciudad("CABA"));
        Equipo equipo2 = new Equipo("CARP",new Ciudad("CABA"));
        Equipo equipo3 = new Equipo("PSTP",new Ciudad("CABA"));
        Equipo equipo4 = new Equipo("FCB",new Ciudad("España"));
        Equipo equipo5 = new Equipo("RMA",new Ciudad("España"));
        Equipo equipo6 = new Equipo("RVM",new Ciudad("España"));
  
        
        //Primer torneo
        Torneo torneo1 = new Torneo("libertadores", 2020);
        EquipoTorneo equipotorneo1 = new EquipoTorneo(equipo1, torneo1, 12, 2, 6, 4, 2, 3);
        EquipoTorneo equipotorneo2 = new EquipoTorneo(equipo2, torneo1, 12, 10, 0, 13, 4, 5);
        EquipoTorneo equipotorneo3 = new EquipoTorneo(equipo3, torneo1, 12, 0, 0, 12, 6, 7);

        //Segundo torneo
        Torneo torneo2 = new Torneo("MILK CUP", 2009);
        EquipoTorneo equipotorneo4 = new EquipoTorneo(equipo4, torneo2, 10, 4, 0, 6, 5, 1);
        EquipoTorneo equipotorneo5 = new EquipoTorneo(equipo5, torneo2, 10, 2, 3, 6, 2, 2);
        EquipoTorneo equipotorneo6 = new EquipoTorneo(equipo6, torneo2, 10, 3, 1, 6, 3, 3);
        //Tercer torneo
        Torneo torneo3 = new Torneo("Copa del mundo",2017);
        EquipoTorneo equipotorneo7 = new EquipoTorneo(equipo1, torneo3, 15, 1, 10, 4, 4, 4);
        EquipoTorneo equipotorneo8 = new EquipoTorneo(equipo2, torneo3, 15, 2, 9, 5, 3, 5);
        EquipoTorneo equipotorneo9 = new EquipoTorneo(equipo5, torneo3, 15, 3, 8, 7, 2, 6);
          
        Torneos.agregar(equipotorneo7);
        Torneos.agregar(equipotorneo8);
        Torneos.agregar(equipotorneo3);
        Torneos.agregar(equipotorneo4);
        Torneos.agregar(equipotorneo2);
        Torneos.agregar(equipotorneo6);
        Torneos.agregar(equipotorneo1);
        Torneos.agregar(equipotorneo5);
        Torneos.agregar(equipotorneo9);
 
        
        System.out.println("Cantidad de puntos que le corresponde:" +equipotorneo1.getPuntos());
        System.out.println("Diferencia entre goles:"+equipotorneo1.getDiferenciaGol());
        System.out.println("Mayor goleador: "+Torneos.masGoleador()); 
        System.out.println("Equipo al que menos goles le metieron: "+Torneos.vallaMenosVencida());
        System.out.println("Torneos participados por:(" + equipo1.getNombre() + ")" + Torneos.todosLosTorneos(new Equipo("CABJ",new Ciudad("CABA"))));
        System.out.println("***************");
        System.out.println("Tabla de posiciones por parametro:(" + torneo1.getNombre()+   ")"+ "\n"  + Torneos.tablaPosiciones(torneo1));
        System.out.println("***************");
        Torneos.ordenar();
        System.out.println("Ordenado por nombre:");
        System.out.println(Torneos.toString());
        
        
        
        
        
        
    }
}
