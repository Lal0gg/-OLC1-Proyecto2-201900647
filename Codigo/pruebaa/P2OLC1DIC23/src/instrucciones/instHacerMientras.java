package instrucciones;

import Abstract.Instruccion;
import clases.Erroor;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class instHacerMientras extends Instruccion {

    Instruccion cuerpo;
    Instruccion condicion;

    public instHacerMientras(Instruccion cuerpo, Instruccion condicion) {
        this.cuerpo = cuerpo;
        this.condicion = condicion;
    }

    @Override
    public Instruccion Interpretarr() {
        try {
            do {
                // Ejecutar el cuerpo al menos una vez
                if (cuerpo != null) {
                    cuerpo.Interpretarr();
                }
                // Evaluar la condición
                condicion.Interpretarr();

            } while ((Boolean) condicion.valor); // Mientras la condición sea verdadera, repetir

        } catch (Exception e) {
            System.out.println("Error: Al procesar la instrucción HACER-MIENTRAS");
            textAreaGG2.setText(textAreaGG2.getText() + "\n" + "Error: Al procesar la instrucción HACER-MIENTRAS");
            Erroor error = new Erroor("Semántico", "Error: Al procesar ", "la instrucción HACER-MIENTRAS", 0, 0);
            ErrorList.add(error);
        }

        return this;
    }
}
