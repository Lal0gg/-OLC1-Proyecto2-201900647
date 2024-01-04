package instrucciones;

import Abstract.Instruccion;
import clases.Erroor;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class instMientras extends Instruccion {
    Instruccion condicion;
    Instruccion bloqueSentencias;

    public instMientras(Instruccion condicion, Instruccion bloqueSentencias) {
        this.condicion = condicion;
        this.bloqueSentencias = bloqueSentencias;
    }

    @Override
    public Instruccion Interpretarr() {
        try {
            System.out.println("Ejecutando MIENTRAS");
            do {
                bloqueSentencias.Interpretarr();
                // Actualizar la condición al final de cada ejecución del bloque de sentencias
                condicion.Interpretarr();
            } while (condicion.valor instanceof Boolean && (Boolean) condicion.valor);
        } catch (Exception e) {
            System.out.println("Error al procesar la condición del MIENTRAS");
            textAreaGG2.setText(textAreaGG2.getText() + "\n" + "Error al procesar la condición del MIENTRAS");
            Erroor error = new Erroor("Semántico", "Error al procesar", "la condición del MIENTRAS", 0, 0);
            ErrorList.add(error);
        }
        return this;
    }
}
