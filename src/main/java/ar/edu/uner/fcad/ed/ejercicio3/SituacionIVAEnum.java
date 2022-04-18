package ar.edu.uner.fcad.ed.ejercicio3;

public enum SituacionIVAEnum {
    RESP_INSCRIPTO("Responsable inscripto"),
    RESP_NO_INSCRIPTO("Responsable no inscripto"),
    CONSUMIDOR_FINAL("Consumidor final"),
    RESP_MONOTRIBUTO("Responsable monotributo");
    
    private final String descripcion;
    
    private SituacionIVAEnum(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "SituacionIVAEnum{" + "descripcion=" + descripcion + '}';
    }
    
}
