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
 * @author edujr
 */
public class aritDIVISION extends Instruccion {
    Instruccion Nodo1;
    Instruccion Nodo2;

    public aritDIVISION(Instruccion Nodo1, Instruccion Nodo2) {
        this.Nodo1 = Nodo1;
        this.Nodo2 = Nodo2;

    }

    private void DivisionNodos(Instruccion Nodoo1, Instruccion Nodoo2) {
        try {

            if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Integer) {

                if ((int) Nodoo2.valor == 0) {
                    System.out.println("No se puede dividr en 0, porque es indefinido D:");
                    textAreaGG2.setText("No se puede dividr en 0, porque es indefinido D:");
                } else {
                    double div = (double) (int) Nodoo1.valor / (double) (int) Nodoo2.valor;
                    System.out.println("Resultado de la division: " + div);
                    //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(div));
                    this.valor = div;
                }
            } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Double) {

                if ((double) Nodoo2.valor == 0) {
                    System.out.println("No se puede dividr en 0, porque es indefinido D:");
                    textAreaGG2.setText("No se puede dividr en 0, porque es indefinido D:");
                    Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: 0, ", "porque es indefinido D:", 0, 0);
                    ErrorList.add(error);
                } else {
                    double div = (double) (int) Nodoo1.valor / (double) Nodoo2.valor;
                    System.out.println("Resultado de la division: " + div);
                    //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(div));
                    this.valor = div;

                }
            } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Boolean) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Character) {
                double n1 = (int) Nodoo1.valor;
                Character n2 = (Character) Nodoo2.valor;
                System.out.println("char: " + n2);
                double divp = n1 / (double) n2;
                System.out.println("Resultado de la div: " + divp);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(divp));
                this.valor = divp;
            } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof String) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Integer) {
                if ((int) Nodoo2.valor == 0) {
                    System.out.println("No se puede dividr en 0, porque es indefinido D:");
                    textAreaGG2.setText("No se puede dividr en 0, porque es indefinido D:");
                    Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: 0, ", "porque es indefinido D:", 0, 0);
                    ErrorList.add(error);
                } else {
                    double div = (Double) Nodoo1.valor / (int) Nodoo2.valor;
                    System.out.println("Resultado de la div: " + div);
                    //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(div));
                    this.valor = div;
                }

            } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Double) {

                if ((double) Nodoo2.valor == 0) {
                    System.out.println("No se puede dividr en 0, porque es indefinido D:");
                    textAreaGG2.setText("No se puede dividr en 0, porque es indefinido D:");
                    Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: 0, ", "porque es indefinido D:", 0, 0);
                    ErrorList.add(error);
                } else {
                    double divv = (double) Nodoo1.valor / (double) Nodoo2.valor;
                    System.out.println("Resultado de la divv: " + divv);
                    //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(divv));
                    this.valor = divv;

                }
            } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Character) {
                Double n1 = (Double) Nodoo1.valor;
                Character n2 = (Character) Nodoo2.valor;
                Double divchar = n1 / (double) n2;
                System.out.println("Resultado de la div: " + divchar);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(divchar));
                this.valor = divchar;
            } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Boolean) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof String) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Integer) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Double) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Boolean) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Character) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof String) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}", 0, 0);
            } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Integer) {
                Character n1 = (Character) Nodoo1.valor;
                System.out.println("N1: " + Nodoo1.valor);
                int n2 = (int) Nodoo2.valor;
                System.out.println("N2: " + n2);
                int nuevo1 = (int) n1;
                Double  multx = (double) (nuevo1 / n2);
                System.out.println("Resultado de la mult: " + multx);
               // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multx));
                this.valor = multx;
            } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Double) {
                Character n1 = (Character) Nodoo1.valor;
                System.out.println("N1: " + Nodoo1.valor);
                Double n2 = (Double) Nodoo2.valor;
                System.out.println("N2: " + n2);
                Double nuevo1 = (double) n1;
                Double divx = nuevo1 /n2;
                System.out.println("Resultado de la div: " + divx);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(divx));
                this.valor = divx;
            }
            else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Integer) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Double) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Boolean) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Character) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof String) {
                System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}", 0, 0);
                ErrorList.add(error);
            }
            else {
                System.out.println("¡Error! Tipo de dato   incorrecto");
                textAreaGG2.setText("¡Error! Tipo de dato   incorrecto");
                Erroor error = new Erroor("Semantico", "¡Error!  ", "Tipo de dato   incorrecto", 0, 0);
                ErrorList.add(error);

            }
        } catch (Exception e) {
            System.out.println(e);
            textAreaGG2.setText("No se realizó la suma ¡ERROR!");
        }
    }

    @Override
    public Instruccion Interpretarr() {
        Instruccion Nodoo1 = Nodo1.Interpretarr();
        Instruccion Nodoo2 = Nodo2.Interpretarr();
        DivisionNodos(Nodoo1, Nodoo2);
        return this;

    }
}