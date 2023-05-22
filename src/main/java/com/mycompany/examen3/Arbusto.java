
package com.mycompany.examen3;

public class Arbusto extends Planta{
    
    protected double anchoArbusto;
    protected boolean esDomestico;
    protected String variedadArbusto;
    protected String colorHojas;
    protected boolean sePoda;

    public Arbusto() {
    }

    public Arbusto(double anchoArbusto, boolean esDomestico, String variedadArbusto, String colorHojas, boolean sePoda, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePoda = sePoda;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePoda() {
        return sePoda;
    }

    public void setSePoda(boolean sePoda) {
        this.sePoda = sePoda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    public void mostrarMensajeArbusto(){
        System.out.println("Hola soy un arbusto");
    }
    
    
}
