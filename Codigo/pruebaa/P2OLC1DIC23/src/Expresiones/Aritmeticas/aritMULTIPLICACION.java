/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones.Aritmeticas;

import Abstract.Instruccion;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

import clases.Erroor;

/**
 * @author edujr
 */
public class aritMULTIPLICACION extends Instruccion {
    Instruccion Nodo1;
    Instruccion Nodo2;

    public aritMULTIPLICACION(Instruccion Nodo1, Instruccion Nodo2) {
        this.Nodo1 = Nodo1;
        this.Nodo2 = Nodo2;

    }

    private void MultiplicandoNodos(Instruccion Nodoo1, Instruccion Nodoo2) {
        try {

            if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Integer) {
                int multi = (int) Nodoo1.valor * (int) Nodoo2.valor;
                System.out.println("Resultado de la Multiplicacion: " + multi);
               // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multi));
                this.valor = multi;

            } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Double) {
                double multip = (int) Nodoo1.valor * (double) Nodoo2.valor;
                System.out.println("Resultado de la multi: " + multip);
               // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multip));
                this.valor = multip;

            } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Boolean) {
                System.out.println("No se puede realizar la multi entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la multi entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la multi entre: ", Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Character) {
                int n1 = (int) Nodoo1.valor;
                Character n2 = (Character) Nodoo2.valor;
                System.out.println("char: " + n2);
                int multip = n1 * (int) n2;
                System.out.println("Resultado de la multi: " + multip);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multip));
                this.valor = multip;
            } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof String) {
                System.out.println("No se puede realizar la multi entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la multi entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la multi entre: ", Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Integer) {
                double mult = (Double) Nodoo1.valor * (int) Nodoo2.valor;
                System.out.println("Resultado de la mult: " + mult);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(mult));
                this.valor = mult;
            } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Double) {
                double mul = (Double) Nodoo1.valor * (double) Nodoo2.valor;
                System.out.println("Resultado de la mul: " + mul);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(mul));
                this.valor = mul;
            } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Boolean) {
                System.out.println("No se puede realizar la mul entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mul entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mul entre: ", Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Character) {
                Double n1 = (Double) Nodoo1.valor;
                Character n2 = (Character) Nodoo2.valor;
                Double multchar = n1 * (double) n2;
                System.out.println("Resultado de la mult: " + multchar);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multchar));
                this.valor = multchar;
            } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof String) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Integer) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Double) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Boolean) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Character) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof String) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}", 0, 0);
            } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Integer) {
                Character n1 = (Character) Nodoo1.valor;
                System.out.println("N1: " + Nodoo1.valor);
                int n2 = (int) Nodoo2.valor;
                System.out.println("N2: " + n2);
                int nuevo1 = (int) n1;
                int multx = nuevo1 * n2;
                System.out.println("Resultado de la mult: " + multx);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multx));
                this.valor = multx;
            } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Double) {
                Character n1 = (Character) Nodoo1.valor;
                System.out.println("N1: " + Nodoo1.valor);
                Double n2 = (Double) Nodoo2.valor;
                System.out.println("N2: " + n2);
                Double nuevo1 = (double) n1;
                Double multx = nuevo1 * n2;
                System.out.println("Resultado de la mult: " + multx);
               // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multx));
                this.valor = multx;
            } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Boolean) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Character) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {char}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof String) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {string}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Integer) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Double) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Boolean) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Character) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof String) {
                System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}", 0, 0);
                ErrorList.add(error);
            } else {
                System.out.println("¡Error! Tipo de dato   incorrecto");
                textAreaGG2.setText("¡Error! Tipo de dato   incorrecto");
                Erroor error = new Erroor("Semantico", "¡Error!  ", "Tipo de dato   incorrecto", 0, 0);
                ErrorList.add(error);

            }
        } catch (Exception e) {
            System.out.println(e);
            textAreaGG2.setText("No se realizó la multiplicacion ¡ERROR!");

        }
    }

    @Override
    public Instruccion Interpretarr() {
        Instruccion Nodoo1 = Nodo1.Interpretarr();
        Instruccion Nodoo2 = Nodo2.Interpretarr();
        MultiplicandoNodos(Nodoo1, Nodoo2);
        return this;

    }

}
