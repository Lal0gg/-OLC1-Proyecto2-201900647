/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones.Aritmeticas;

import Abstract.Instruccion;
import static GUI.GUI.textAreaGG2;

/**
 *
 * @author edujr
 */
public class aritPOTENCIA extends Instruccion {

    Instruccion base;
    Instruccion exponente;

    public aritPOTENCIA(Instruccion base, Instruccion exponente) {
        this.base = base;
        this.exponente = exponente;
    }

    private void PotenciandoNodos(Instruccion base, Instruccion exponente) {
        try {
            if (base.valor instanceof Integer && exponente.valor instanceof Integer) {
                int resultado = (int) Math.pow((int) base.valor, (int) exponente.valor);
                System.out.println("Resultado de la Potenciación: " + resultado);
                textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(resultado));
                this.valor = resultado;
            } else {
                System.out.println("¡Error! Tipo de dato incorrecto para potenciación");
                textAreaGG2.setText("¡Error! Tipo de dato incorrecto para potenciación");
            }
        } catch (Exception e) {
            System.out.println(e);
            textAreaGG2.setText("No se realizó la potenciación ¡ERROR!");
        }
    }

    @Override
    public Instruccion Interpretarr() {
        Instruccion baseInterpretada = base.Interpretarr();
        Instruccion exponenteInterpretado = exponente.Interpretarr();
        PotenciandoNodos(baseInterpretada, exponenteInterpretado);
        return this;
    }
}
