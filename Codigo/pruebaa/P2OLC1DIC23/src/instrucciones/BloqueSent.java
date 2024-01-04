package instrucciones;

import Abstract.Instruccion;

import java.util.ArrayList;

public class BloqueSent extends Instruccion {
    private Sentencias sentencias;

    public BloqueSent(Sentencias sentencias) {
        this.sentencias = sentencias;
    }

    @Override
    public Instruccion Interpretarr() {
        sentencias.Interpretarr();
        return this;  // Puedes ajustar el valor de retorno según tus necesidades
    }
}
