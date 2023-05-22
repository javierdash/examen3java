
package com.mycompany.examen3;


public class Main {
    public static void main(String[] args) {
        
        Arbol arbolito = new Arbol("ficus", "alto", 0, "marron", "dura", "ficucito", 0, true, "verano");
        Flor florcita = new Flor("rojos", 0, "verde", "grande", "primavera", "florcecita", 0, true, "tropical");
        Arbusto arbustito = new Arbusto(18.66, true, "granx", "grises", true, "arbusto juan", 0, true, "subtropico");
    
        arbolito.mostrarMensaje1();
        //florcita.mostrarMensajeFlor();
        //arbustito.mostrarMensajeArbusto();
        
        
    }
}
