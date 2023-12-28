/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones.Aritmeticas;

import static GUI.GUI.textAreaGG2;
import Abstract.Instruccion;
import static func.Funcion.ErrorList;
import clases.Erroor;

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
                    sum = n1;
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
            } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Integer){
                Boolean n1= (Boolean) Nodoo1.valor;
                int n2 = (int) Nodoo2.valor;
                if(n1==true){
                    int sumitad;
                    sumitad = n2 + 1;
                    System.out.println("Resultado de la suma: " + sumitad);
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitad));
                    this.valor = sumitad;
                }else{
                    int sumitax;
                    sumitax = n2;
                    System.out.println("Resultado de la suma: " + sumitax);
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitax));
                    this.valor = sumitax;
                }
            }else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Double){
                Boolean n1= (Boolean) Nodoo1.valor;
                double n2 = (double) Nodoo2.valor;
                if(n1==true){
                    double sumitadd;
                    sumitadd = n2 + 1.0;
                    System.out.println("Resultado de la suma: " + sumitadd);
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitadd));
                    this.valor = sumitadd;
                }else{
                    double sumitaxd;
                    sumitaxd = n2;
                    System.out.println("Resultado de la suma: " + sumitaxd);
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaxd));
                    this.valor = sumitaxd;
                }
            } else if(Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Boolean){
                System.out.println("No se puede realizar la suma entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor+ " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la suma entre: " + Nodoo1.valor +" {bool} y " + Nodoo2.valor+ " {bool}");
                Erroor errorsito = new Erroor("Semantico", "No se puede realizar la suma entre" ,Nodoo1.valor +" {bool} y " + Nodoo2.valor+ " {bool}", 0, 0);
                ErrorList.add(errorsito);
            }else if(Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Character){
                System.out.println("No se puede realizar la suma entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor+ " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la suma entre: " + Nodoo1.valor +" {bool} y " + Nodoo2.valor+ " {char}");
                Erroor errorsito = new Erroor("Semantico", "No se puede realizar la suma entre" , Nodoo1.valor +" {bool} y " + Nodoo2.valor+ " {char}", 0, 0);
                ErrorList.add(errorsito);
            }else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof String){
                Boolean n1= (Boolean) Nodoo1.valor;
                String n2 = (String) Nodoo2.valor;
                if(n1==true){
                    String sumitad;
                    sumitad = n2 + "true";
                    System.out.println("Resultado de la suma: " + sumitad);
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitad));
                    this.valor = sumitad;
                }else{
                    String sumitax;
                    sumitax = n2 + "false";
                    System.out.println("Resultado de la suma: " + sumitax);
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitax));
                    this.valor = sumitax;
                }

            }else if(Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Integer){
                Character n1= (Character) Nodoo1.valor;
                System.out.println("N1: " + Nodoo1.valor);
                int n2 = (int) Nodoo2.valor;
                System.out.println("N2: " + n2);
                int nuevo1 = (int)n1;
                int sumitax = nuevo1 + n2;
                System.out.println("Resultado de la suma: " + sumitax);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitax));
                this.valor = sumitax;
            }
            else if(Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Double){
                Character n1= (Character) Nodoo1.valor;
                Double n2 = (Double) Nodoo2.valor;
                double nuevo1 = (double)n1;
                double sumitadd = nuevo1 + n2;
                System.out.println("Resultado de la suma: " + sumitadd);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitadd));
                this.valor = sumitadd;

            }else if(Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Boolean){
                System.out.println("No se puede realizar la suma entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor+ " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la suma entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor+ " {bool}");
                Erroor errorsito = new Erroor("Semantico", "No se puede realizar la suma entre" , Nodoo1.valor + " {char} y " + Nodoo2.valor+ " {bool}", 0, 0);
                ErrorList.add(errorsito);
            }else if(Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Character) {
                String n1 = (String) Nodoo1.valor;
                String n2 = (String) Nodoo2.valor;
                String sumitax = n1 + n2;
                System.out.println("Resultado de la suma: " + sumitax);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitax));
                this.valor = sumitax;
            }
            else if(Nodoo1.valor instanceof Character && Nodoo2.valor instanceof String) {
                Character n1 = (Character) Nodoo1.valor;
                String n2 = (String) Nodoo2.valor;
                String sumitaxd = n1 + n2;
                System.out.println("Resultado de la suma: " + sumitaxd);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaxd));
                this.valor = sumitaxd;
            }else if(Nodoo1.valor instanceof String && Nodoo2.valor instanceof Integer){
                String n1= (String) Nodoo1.valor;
                int n2 = (int) Nodoo2.valor;
                String sumitax = n1 + n2;
                System.out.println("Resultado de la suma: " + sumitax);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitax));
                this.valor = sumitax;
            }else if(Nodoo1.valor instanceof String && Nodoo2.valor instanceof Double) {
                String n1 = (String) Nodoo1.valor;
                Double n2 = (Double) Nodoo2.valor;
                String sumitaxd = n1 + n2;
                System.out.println("Resultado de la suma: " + sumitaxd);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaxd));
                this.valor = sumitaxd;
            }else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Boolean){
                String n1= (String) Nodoo1.valor;
                Boolean n2 = (Boolean) Nodoo2.valor;
                if(n2==true){
                    String sumitad;
                    sumitad = n1 + "true";
                    System.out.println("Resultado de la suma: " + sumitad);
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitad));
                    this.valor = sumitad;
                }else{
                    String sumitax;
                    sumitax = n1 + "false";
                    System.out.println("Resultado de la suma: " + sumitax);
                    textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitax));
                    this.valor = sumitax;
                }

            }else if(Nodoo1.valor instanceof String && Nodoo2.valor instanceof Character) {
                String n1 = (String) Nodoo1.valor;
                Character n2 = (Character) Nodoo2.valor;
                String sumitaxd = n1 + n2;
                System.out.println("Resultado de la suma: " + sumitaxd);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaxd));
                this.valor = sumitaxd;
            } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof String) {
                String n1 = (String) Nodoo1.valor;
                String n2 = (String) Nodoo2.valor;
                String sumitaxd = n1 + n2;
                System.out.println("Resultado de la suma: " + sumitaxd);
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaxd));
                this.valor = sumitaxd;
            }else {
                System.out.println("N1 " + Nodoo1.valor);
                System.out.println("N2 " + Nodoo2.valor);
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
