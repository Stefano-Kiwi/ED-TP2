package ar.edu.uner.fcad.ed.ejercicio1;

/**
 *
 * @author stefa
 */
public class EquipoTorneo {
    private Equipo equipo;
    private Torneo torneo;
    private int partJugados,partGanados,partEmpatados,partPerdidos,golesAFavor,golesEnContra;

    public EquipoTorneo(Equipo equipo, Torneo torneo, int partJugados, int partGanados, int partEmpatados, int partPerdidos, int golesAFavor, int golesEnContra) {
        this.equipo = equipo;
        this.torneo = torneo;
        this.partJugados = partJugados;
        this.partGanados = partGanados;
        this.partEmpatados = partEmpatados;
        this.partPerdidos = partPerdidos;
        this.golesAFavor = golesAFavor;
        this.golesEnContra = golesEnContra;
    }
    
}
