package Expresiones;

import Abstract.Instruccion;
import clases.Erroor;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

import clases.TablaSimbolos;
import clases.TipoOperacionUnitaria;
public class OperacionUnaria extends Instruccion {

    private final Instruccion Nodo;
    TipoOperacionUnitaria tipoOperacionU;

    public OperacionUnaria(Instruccion Nodo, TipoOperacionUnitaria tipoOperacionU) {
        this.Nodo = Nodo;
        this.tipoOperacionU = tipoOperacionU;
    }


    private void Operar(Instruccion Nodo) {
        if(tipoOperacionU== TipoOperacionUnitaria.RESTAUNARIA){
            try {
                if (Nodo.valor instanceof Integer) {
                    int restaUnaria = -((int) Nodo.valor);
                    System.out.println("Resultado de la Resta Unaria: " + restaUnaria);
                    //textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(restaUnaria));
                    this.valor = restaUnaria;
                } else if (Nodo.valor instanceof Double) {
                    double restaUnaria = -((double) Nodo.valor);
                    System.out.println("Resultado de la Resta Unaria: " + restaUnaria);
                    //textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(restaUnaria));
                    this.valor = restaUnaria;
                }else {
                    System.out.println("¡Error Semantico! Tipo de dato   incorrecto, no se puede realizar la operacion");
                    textAreaGG2.setText("¡Error Semantico! Tipo de dato   incorrecto, no se puede realizar la operacion");
                    Erroor error = new Erroor("Semantico", "¡Error Semantico! Tipo de dato   incorrecto", "no se puede realizar la operacion", 0, 0);
                    ErrorList.add(error);
                }
            } catch (Exception e) {
                System.out.println(e);
                textAreaGG2.setText("No se realizó la resta unaria ¡ERROR!");
            }
        } else if(tipoOperacionU== TipoOperacionUnitaria.NOT){
            try {
                if (Nodo.valor instanceof Boolean) {
                    System.out.println("Entro a verificar NOT: " + Nodo.valor);
                    boolean valor = !((boolean) Nodo.valor);
                    System.out.println("Valor de NOT: " + valor);
                    this.valor = valor;
                } else {
                    System.out.println("Tipos no manejados en el not: " + Nodo.valor.getClass());
                    textAreaGG2.setText("Tipos no manejados en el not: " + Nodo.valor.getClass() );
                    Erroor error =  new Erroor("Semantico", "Tipos no manejados en el not : " ,Nodo.valor.getClass().toString() ,0, 0);
                    ErrorList.add(error);

                }
            } catch (Exception e) {
                System.out.println("Error en NOT: " + e);
            }

        }else{
            System.out.println("¡Error Semantico! Tipo de dato   incorrecto, no se puede realizar la operacion");
            textAreaGG2.setText("¡Error Semantico! Tipo de dato   incorrecto, no se puede realizar la operacion");
            Erroor error = new Erroor("Semantico", "¡Error Semantico! Tipo de dato   incorrecto", "no se puede realizar la operacion", 0, 0);
            ErrorList.add(error);
        }
    }


    @Override
    public Instruccion Interpretarr( ) {
        Operar(Nodo.Interpretarr());
        return this;
    }
}
