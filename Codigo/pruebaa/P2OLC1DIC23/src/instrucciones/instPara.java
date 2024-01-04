package instrucciones;

import Abstract.Instruccion;
import clases.Erroor;
import clases.TablaSimbolos;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class instPara extends Instruccion {
    Instruccion instrInicial;
    Instruccion condicion;
    Instruccion instDecreIncre;
    Instruccion bloqueSentencias;

    public instPara(Instruccion instrInicial, Instruccion condicion, Instruccion instDecreIncre, Instruccion bloqueSentencias) {
        this.instrInicial = instrInicial;
        this.condicion = condicion;
        this.instDecreIncre = instDecreIncre;
        this.bloqueSentencias = bloqueSentencias;
    }



    @Override
    public Instruccion Interpretarr() {
        try {
            instrInicial.Interpretarr();
            while ((boolean) condicion.valor) {
                bloqueSentencias.Interpretarr();
                instDecreIncre.Interpretarr();
            }
        } catch (Exception e) {
            System.out.println("Error en la instrucción PARA: " + e.getMessage());
            textAreaGG2.setText(textAreaGG2.getText() + "\n" + "Error en la instrucción PARA: " + e.getMessage());
            Erroor error = new Erroor("Semantico", "Error en la instrucción PARA", e.getMessage(), 0, 0);
            ErrorList.add(error);
        }
        return this;
    }
}
