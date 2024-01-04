package instrucciones;

import Abstract.Instruccion;
import clases.Erroor;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class instSI extends Instruccion {
    Instruccion condicion;
    Instruccion sentenc1;
    Instruccion sentenc2;

    public instSI(Instruccion condicion, Instruccion sentenc1){
        this.condicion = condicion;
        this.sentenc1 = sentenc1;

    }

    public instSI(Instruccion condicion, Instruccion sentenc1, Instruccion sentenc2){
        this.condicion = condicion;
        this.sentenc1 = sentenc1;
        this.sentenc2 = sentenc2;
    }


    public void EjecutarSI(Instruccion condicion){
        try{
            System.out.println("Ejecutando SI");
            if(condicion.valor instanceof  Boolean){
                System.out.println("Condicion: " + condicion.valor);
                System.out.println("sentencia 1: " + sentenc1);
                if((Boolean) condicion.valor ){
                    System.out.println("Ejecutando sentencia 1");
                    sentenc1.Interpretarr();
                }else if(sentenc2 != null){
                    System.out.println("sentencia 2: " + sentenc2);
                    System.out.println("Ejecutando sentencia 2");
                    sentenc2.Interpretarr();
                }else {
                    System.out.println("Error: Al procesar la condicion del SIIIIIIIII");
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + "Error: Al procesar la condicion del SI");
                    Erroor error = new Erroor("Semantico", "Error: Al procesar ", "la condicion del SI", 0,0);
                    ErrorList.add(error);
                }
            }

        } catch (Exception e){
            System.out.println("Error: Al procesar la condicion del SI");
            textAreaGG2.setText(textAreaGG2.getText() + "\n" + "Error: Al procesar la condicion del SI");
            Erroor error = new Erroor("Semantico", "Error: Al procesar ", "la condicion del SI", 0,0);
            ErrorList.add(error);
        }

    }

    @Override
    public Instruccion Interpretarr() {
        condicion.Interpretarr();
        EjecutarSI(condicion);
        return this;
    }
}
