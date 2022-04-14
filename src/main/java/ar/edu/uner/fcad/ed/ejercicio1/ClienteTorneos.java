package ar.edu.uner.fcad.ed.ejercicio1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class ClienteTorneos {
    public static void main(String[] args) {
        List <EquipoTorneo> ListaTorneo = new ArrayList();
        Equipo boca = new Equipo("bokita", new Ciudad("CABA"));
        Equipo river = new Equipo("bokita", new Ciudad("CABA"));
        Equipo sanlo = new Equipo("bokita", new Ciudad("CABA"));

        System.out.println("boca = " + boca);
        Torneo torneo1 = new Torneo("libertadores", 2020);
        EquipoTorneo equipo1 = new EquipoTorneo(boca, torneo1, 12, 2, 6, 4, 2, 3);
        EquipoTorneo equipo2 = new EquipoTorneo(river, torneo1, 12, 2, 6, 4, 4, 5);
        EquipoTorneo equipo3 = new EquipoTorneo(sanlo, torneo1, 12, 2, 6, 4, 6, 7);

        System.out.println("equipo1 = " + equipo1);
        System.out.println("Cantidad de puntos que le corresponde:" +equipo1.getPuntos());
        System.out.println("Diferencia entre goles:"+equipo1.getDiferenciaGol());
        ListaTorneo.add(equipo1);
        ListaTorneo.add(equipo2);
        ListaTorneo.add(equipo3);
        
    }
}
