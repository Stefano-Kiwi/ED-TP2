package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.Objects;

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

//    c) Modifique EquipoTorneo de forma que establezca como criterio de comparación la
// propiedad Equipo y luego Torneo.
// i. Para la clase Equipo deberá considerar el atributo Nombre.
// ii. Para la clase Torneo deberá considerar primero el atributo Año y luego Nombre.

    
    @Override
    public String toString() {
        return "EquipoTorneo{" + "equipo=" + equipo + ", torneo=" + torneo + ", partJugados=" + partJugados + ", partGanados=" + partGanados + ", partEmpatados=" + partEmpatados + ", partPerdidos=" + partPerdidos + ", golesAFavor=" + golesAFavor + ", golesEnContra=" + golesEnContra + '}';
    }
    
    public int getPuntos(){
        int puntos = 0;
        puntos = (partGanados*3)+partEmpatados;
        return puntos;
    }
    public int getDiferenciaGol(){
        int puntos = 0;
        puntos = Math.abs(golesAFavor-golesEnContra);
        return puntos;
    }
    
}
