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

    public Equipo getEquipo() {
        return this.equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Torneo getTorneo() {
        return this.torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public int getPartJugados() {
        return this.partJugados;
    }

    public void setPartJugados(int partJugados) {
        this.partJugados = partJugados;
    }

    public int getPartGanados() {
        return this.partGanados;
    }

    public void setPartGanados(int partGanados) {
        this.partGanados = partGanados;
    }

    public int getPartEmpatados() {
        return this.partEmpatados;
    }

    public void setPartEmpatados(int partEmpatados) {
        this.partEmpatados = partEmpatados;
    }

    public int getPartPerdidos() {
        return this.partPerdidos;
    }

    public void setPartPerdidos(int partPerdidos) {
        this.partPerdidos = partPerdidos;
    }

    public int getGolesAFavor() {
        return this.golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return this.golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    
}
