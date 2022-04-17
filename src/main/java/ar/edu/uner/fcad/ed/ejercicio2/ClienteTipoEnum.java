package ar.edu.uner.fcad.ed.ejercicio2;

public enum ClienteTipoEnum {
    
    PERSONA("Persona"), 
    COMERCIO("Comercio"), 
    EMPRESADECONSTRUCCION("Empresa de construccion");
    
    private final String descripcion;

    private ClienteTipoEnum(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
