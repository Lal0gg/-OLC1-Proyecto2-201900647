package instrucciones;

import Abstract.Instruccion;
import clases.TablaSimbolos;
import clases.TipoDato;

public class instAsignarVariable extends Instruccion {

    private String id;
    Instruccion valor;
    TablaSimbolos entorno;

    TipoDato tipo;

    public instAsignarVariable(String id, Instruccion valor, TablaSimbolos entorno) {
        this.id = id;
        this.valor = valor;
        this.entorno = entorno;
    }



    @Override
    public Instruccion Interpretarr() {
        return this;
    }
}
