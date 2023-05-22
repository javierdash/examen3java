
package com.mycompany.examen3;

public class Flor extends Planta{
    
    protected String colorPetalos;
    protected double cantPromPetalos;
    protected String colorPistillo;
    protected String variedadFlor;
    protected String estacionFlorece;

    public Flor() {
    }

    public Flor(String colorPetalos, double cantPromPetalos, String colorPistillo, String variedadFlor, String estacionFlorece, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPromPetalos = cantPromPetalos;
        this.colorPistillo = colorPistillo;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public double getCantPromPetalos() {
        return cantPromPetalos;
    }

    public void setCantPromPetalos(double cantPromPetalos) {
        this.cantPromPetalos = cantPromPetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
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
    
    public void mostrarMensajeFlor(){
        System.out.println("Hola soy una flor");
    }
    
    
    
}
