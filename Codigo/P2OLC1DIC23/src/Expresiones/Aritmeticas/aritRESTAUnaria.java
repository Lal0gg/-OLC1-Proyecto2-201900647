/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones.Aritmeticas;

import Abstract.Instruccion;
import static GUI.GUI.textAreaGG2;

public class aritRESTAUnaria extends Instruccion {

    private final Instruccion Nodo;

    public aritRESTAUnaria(Instruccion Nodo) {
        this.Nodo = Nodo;
    }

    private void RestandoNodoUnario(Instruccion Nodo) {
        try {
            if (Nodo.valor instanceof Integer) {
                int restaUnaria = -((int) Nodo.valor);
                System.out.println("Resultado de la Resta Unaria: " + restaUnaria);
                textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(restaUnaria));
                this.valor = restaUnaria;
            } else {
                System.out.println("¡Error! Tipo de dato incorrecto para resta unaria");
                textAreaGG2.setText("¡Error! Tipo de dato incorrecto para resta unaria");
            }
        } catch (Exception e) {
            System.out.println(e);
            textAreaGG2.setText("No se realizó la resta unaria ¡ERROR!");
        }
    }

    @Override
    public Instruccion Interpretarr() {
        RestandoNodoUnario(Nodo.Interpretarr());
        return this;
    }
}