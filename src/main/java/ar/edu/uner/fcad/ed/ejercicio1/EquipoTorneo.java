package ar.edu.uner.fcad.ed.ejercicio1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author stefa
 */
public class EquipoTorneo implements Comparable<EquipoTorneo> {
    private Equipo equipo;
    private Torneo torneo;
    private int partJugados,partGanados,partEmpatados,partPerdidos,golesAFavor,golesEnContra;
    private List<EquipoTorneo> torneoList;
   public EquipoTorneo(){
        this.torneoList = new ArrayList();
    }
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
    
    public void ordenar(){
    Collections.sort(torneoList);
    }
    
 public void ordenar(Comparator<EquipoTorneo> comparator){
       torneoList.sort(comparator);
    }


    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Equipo getEquipo() {
        return equipo;
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

//    c) Modifique EquipoTorneo de forma que establezca como criterio de comparación la
// propiedad Equipo y luego Torneo.
// i. Para la clase Equipo deberá considerar el atributo Nombre.
// ii. Para la clase Torneo deberá considerar primero el atributo Año y luego Nombre.


    public int compareTo(EquipoTorneo o) {
        int resultado = 0;
        resultado = this.equipo.getNombre().compareTo(o.getEquipo().getNombre());
        return resultado;
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
   
    public String toString() {
        return "EquipoTorneo{" + "equipo=" + equipo + ", torneo=" + torneo + ", partJugados=" + partJugados + ", partGanados=" + partGanados + ", partEmpatados=" + partEmpatados + ", partPerdidos=" + partPerdidos + ", golesAFavor=" + golesAFavor + ", golesEnContra=" + golesEnContra + "\n";
    }

   
  
    
}
