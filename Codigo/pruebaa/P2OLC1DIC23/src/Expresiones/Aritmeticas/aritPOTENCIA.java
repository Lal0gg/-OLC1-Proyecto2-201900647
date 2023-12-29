/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones.Aritmeticas;

import Abstract.Instruccion;
import clases.Erroor;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

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
               //textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(resultado));
                this.valor = resultado;
            }else if( base.valor instanceof Double && exponente.valor instanceof Double){
                double resultado = Math.pow((double) base.valor, (double) exponente.valor);
                System.out.println("Resultado de la Potenciación: " + resultado);
                //textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(resultado));
                this.valor = resultado;
            }else if( base.valor instanceof Integer && exponente.valor instanceof Double) {
                double resultado = Math.pow((int) base.valor, (double) exponente.valor);
                System.out.println("Resultado de la Potenciación: " + resultado);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(resultado));
                this.valor = resultado;
            }else  if( base.valor instanceof Double && exponente.valor instanceof Integer) {
                double resultado = Math.pow((double) base.valor, (int) exponente.valor);
                System.out.println("Resultado de la Potenciación: " + resultado);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(resultado));
                this.valor = resultado;
            } else if (base.valor instanceof Integer &&  exponente.valor instanceof Boolean ) {
                System.out.println("No se puede realizar la Potenciación entre: " + base.valor + " {int} y " + exponente.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + base.valor + " {int} y " + exponente.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", base.valor + " {int} y " + exponente.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof Integer && exponente.valor instanceof String) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {int} y " + exponente.valor + " {String}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {int} y " + exponente.valor + " {String}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {int} y " + exponente.valor + " {String}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof Integer && exponente.valor instanceof Character) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {int} y " + exponente.valor + " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {int} y " + exponente.valor + " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {int} y " + exponente.valor + " {char}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof Double && exponente.valor instanceof Boolean) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {double} y " + exponente.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {double} y " + exponente.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {double} y " + exponente.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof Double && exponente.valor instanceof String) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {double} y " + exponente.valor + " {String}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {double} y " + exponente.valor + " {String}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {double} y " + exponente.valor + " {String}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof Double && exponente.valor instanceof Character) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {double} y " + exponente.valor + " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {double} y " + exponente.valor + " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {double} y " + exponente.valor + " {char}", 0, 0);
                ErrorList.add(error);
            }else if (base.valor instanceof Boolean && exponente.valor instanceof Integer) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {bool} y " + exponente.valor + " {int}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {bool} y " + exponente.valor + " {int}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {bool} y " + exponente.valor + " {int}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof Boolean && exponente.valor instanceof Double) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {bool} y " + exponente.valor + " {double}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {bool} y " + exponente.valor + " {double}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {bool} y " + exponente.valor + " {double}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof Boolean && exponente.valor instanceof String) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {bool} y " + exponente.valor + " {String}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {bool} y " + exponente.valor + " {String}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {bool} y " + exponente.valor + " {String}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof Boolean && exponente.valor instanceof Character) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {bool} y " + exponente.valor + " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {bool} y " + exponente.valor + " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {bool} y " + exponente.valor + " {char}", 0, 0);
                ErrorList.add(error);

            }else if (base.valor instanceof Boolean && exponente.valor instanceof Boolean) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {bool} y " + exponente.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {bool} y " + exponente.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {bool} y " + exponente.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof String && exponente.valor instanceof Integer) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {String} y " + exponente.valor + " {int}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {String} y " + exponente.valor + " {int}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {String} y " + exponente.valor + " {int}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof String && exponente.valor instanceof Double) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {String} y " + exponente.valor + " {double}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {String} y " + exponente.valor + " {double}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {String} y " + exponente.valor + " {double}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof String && exponente.valor instanceof String) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {String} y " + exponente.valor + " {String}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {String} y " + exponente.valor + " {String}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {String} y " + exponente.valor + " {String}", 0, 0);
                ErrorList.add(error);
            }
            else if (base.valor instanceof String && exponente.valor instanceof Boolean) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {String} y " + exponente.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {String} y " + exponente.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {String} y " + exponente.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof String && exponente.valor instanceof Character) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {String} y " + exponente.valor + " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {String} y " + exponente.valor + " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {String} y " + exponente.valor + " {char}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof Character && exponente.valor instanceof Integer) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {char} y " + exponente.valor + " {int}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {char} y " + exponente.valor + " {int}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {char} y " + exponente.valor + " {int}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof Character && exponente.valor instanceof Double) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {char} y " + exponente.valor + " {double}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {char} y " + exponente.valor + " {double}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {char} y " + exponente.valor + " {double}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof Character && exponente.valor instanceof Boolean) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {char} y " + exponente.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {char} y " + exponente.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {char} y " + exponente.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (base.valor instanceof Character && exponente.valor instanceof Character) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {char} y " + exponente.valor + " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {char} y " + exponente.valor + " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {char} y " + exponente.valor + " {char}", 0, 0);
                ErrorList.add(error);
            }else if (base.valor instanceof Character && exponente.valor instanceof String) {
                System.out.println("No se puede realizar la pot entre: " + base.valor + " {char} y " + exponente.valor + " {String}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + base.valor + " {char} y " + exponente.valor + " {String}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", base.valor + " {char} y " + exponente.valor + " {String}", 0, 0);
                ErrorList.add(error);
            }

            else {
                System.out.println("¡Error! Tipo de dato incorrecto para potenciación");
                textAreaGG2.setText("¡Error! Tipo de dato incorrecto para potenciación");
                Erroor error = new Erroor("Semantico", "¡Error! ", "Tipo de dato incorrecto para potenciación", 0, 0);
                ErrorList.add(error);
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
