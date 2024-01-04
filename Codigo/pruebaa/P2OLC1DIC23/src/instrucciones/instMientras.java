package instrucciones;

import Abstract.Instruccion;
import clases.Erroor;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class instMientras extends Instruccion {

Instruccion condicion;
Instruccion sentencia;

public instMientras(Instruccion condicion, Instruccion sentencia) {
    this.condicion = condicion;
    this.sentencia = sentencia;
}

public void EjecutarMientras(Instruccion condicion) {
    try {
        if (condicion.valor instanceof Boolean) {
            Auxiliar.getInstancia().agregar(SentenciaTransfer.MIENTRAS);
            System.out.println("Condicion: " + condicion.valor);
            while ((Boolean) condicion.valor) {
                System.out.println("Ejecutando sentencia");
                if(Auxiliar.getInstancia().ObtenerEstadoBreak()) break;
                if(Auxiliar.getInstancia().ObtenerEstadoContinue()) {
                    Auxiliar.getInstancia().setEstado(SentenciaTransfer.MIENTRAS);
                    System.out.println("Continue");
                    continue;
                }
                sentencia.Interpretarr();
            }
            Auxiliar.getInstancia().eliminar();
        }else{
            System.out.println("Error: Al procesar la condicion del Mientras");
            textAreaGG2.setText(textAreaGG2.getText() + "\n" + "Error: Al procesar la condicion del Mientras");
            Erroor error = new Erroor("Semantico", "Error: Al procesar ", "la condicion del Mientras", 0,0);
            ErrorList.add(error);
        }
    } catch (Exception e) {
        System.out.println("Error: Al procesar la condicion del Mientras");
        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "Error: Al procesar la condicion del Mientras");
        Erroor error = new Erroor("Semantico", "Error: Al procesar ", "la condicion del Mientras", 0,0);
        ErrorList.add(error);
    }
}


    @Override
    public Instruccion Interpretarr() {
        condicion.Interpretarr();
        EjecutarMientras(condicion);
        return this;
    }
}
