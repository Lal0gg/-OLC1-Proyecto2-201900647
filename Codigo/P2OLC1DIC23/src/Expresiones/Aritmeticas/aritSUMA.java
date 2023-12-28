/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones.Aritmeticas;

import static GUI.GUI.textAreaGG2;
import Abstract.Instruccion;

/**
 *
 * @author edujr
 */
public class aritSUMA extends Instruccion {

    Instruccion Nodo1;
    Instruccion Nodo2;

    public aritSUMA(Instruccion Nodo1, Instruccion Nodo2) {
        this.Nodo1 = Nodo1;
        this.Nodo2 = Nodo2;

    }

    private void SumandoNodos(Instruccion Nodoo1, Instruccion Nodoo2) {
        try {

            if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Integer) {
                int suma = (int) Nodoo1.valor + (int) Nodoo2.valor;
                System.out.println("Resultado de la suma: " + suma);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(suma));
                this.valor = suma;
            } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Double) {
                double suma = (int) Nodoo1.valor + (double) Nodoo2.valor;
                System.out.println("Resultado de la suma: " + suma);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(suma));
                this.valor = suma;
            } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Boolean) {
                int n1 = (int) Nodoo1.valor;
                Boolean n2 = (Boolean) Nodoo2.valor;

                if (n2 == true) {
                    int sumita;
                    sumita = n1 + 1;
                    System.out.println("Resultado de la suma: " + sumita);
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumita));
                    this.valor = sumita;
                    

                } else {
                    int sum;
                    sum = n1 + 0;
                    System.out.println("Resultado de la suma: " + sum);
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sum));
                    this.valor = sum;
                }
            } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Character) {
                int n1 = (int) Nodoo1.valor;
                Character n2 = (Character) Nodoo2.valor;
                System.out.println("char: " + n2);
                int sumitaChar = n1 + (int) n2;
                System.out.println("Resultado de la suma: " + sumitaChar);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaChar));
                this.valor = sumitaChar;
            } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof String) {
                int n1 = (int) Nodoo1.valor;
                String n2 = (String) Nodoo2.valor;
                String sumitaChar = n1 +  n2;
                System.out.println("Resultado de la suma: " + sumitaChar);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaChar));
                this.valor = sumitaChar;
            } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Double) {
                double sumadouble = (Double) Nodoo1.valor + (double) Nodoo2.valor;
                System.out.println("Resultado de la suma: " + sumadouble);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumadouble));
                this.valor = sumadouble;
            }else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Integer) {
                double sumad = (Double) Nodoo1.valor + (int) Nodoo2.valor;
                System.out.println("Resultado de la suma: " + sumad);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumad));
                this.valor = sumad;
            }else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Boolean) {
                Double n1 = (Double) Nodoo1.valor;
                Boolean n2 = (Boolean) Nodoo2.valor;

                if (n2 == true) {
                    Double sumitad;
                    sumitad = n1 + 1.0;
                    System.out.println("Resultado de la suma: " + sumitad);
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitad));
                    this.valor = sumitad;

                } else {
                    Double sum;
                    sum = n1 + 0;
                    System.out.println("Resultado de la suma: " + sum);
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sum));
                    this.valor = sum;
                }
            }else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Character) {
                Double n1 = (Double) Nodoo1.valor;
                Character n2 = (Character) Nodoo2.valor;
                Double sumitaChar = n1 + (double) n2;
                System.out.println("Resultado de la suma: " + sumitaChar);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaChar));
                this.valor = sumitaChar;
            } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof String) {
                Double n1 = (Double) Nodoo1.valor;
                String n2 = (String) Nodoo2.valor;
                String sumitaChar = n1 + (String) n2;
                System.out.println("Resultado de la suma: " + sumitaChar);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaChar));
                this.valor = sumitaChar;
            } 
             
           
            else {
                System.out.println("¡Error! Tipo de dato   incorrecto");
                textAreaGG2.setText("¡Error! Tipo de dato   incorrecto");

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
        SumandoNodos(Nodoo1, Nodoo2);
        return this;

    }

}
