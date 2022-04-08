package ar.edu.uner.fcad.ed.ejercicio1;

/**
 *
 * @author stefa
 */
public class ClienteTorneos {
    public static void main(String[] args) {
        Equipo boca = new Equipo("bokita", new Ciudad("CABA"));
        System.out.println("boca = " + boca);
        Torneo torneo1 = new Torneo("libertadores", 2020);
        EquipoTorneo piratas = new EquipoTorneo(boca, torneo1, 4, 2, 20, 4, 2, 4);
        System.out.println("piratas = " + piratas);
        System.out.println("Diferencia entre goles:"+piratas.getDiferenciaGol());
        
    }
}
