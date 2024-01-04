package clases;

import Abstract.Instruccion;
import instrucciones.Sentencias;

public class Metodo extends Instruccion {
    private String nombre;
    private Sentencias cuerpo;

    public Metodo(String nombre, Sentencias cuerpo) {
        this.nombre = nombre;
        this.cuerpo = cuerpo;
    }

    @Override
    public Instruccion Interpretarr() {
        cuerpo.Interpretarr();
        return this;
    }
}
