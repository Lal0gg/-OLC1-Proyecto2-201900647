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
 *
 * @author edujr
 */
public class aritRESTA extends Instruccion {
    
    
    Instruccion Nodo1;
    Instruccion Nodo2;
    
    public aritRESTA (Instruccion Nodo1, Instruccion Nodo2){
        this.Nodo1 = Nodo1;
        this.Nodo2 = Nodo2;
    
    }
    
    
    private void RestandoNodos(Instruccion Nodoo1, Instruccion  Nodoo2){
        try{
            
            if(Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Integer){
                int resta = (int) Nodoo1.valor - (int) Nodoo2.valor;
                System.out.println("Resultado de la Resta: " + resta);
                //textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(resta));
                this.valor = resta;
            
            }else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Double) {
                double resta = (int) Nodoo1.valor - (double) Nodoo2.valor;
                System.out.println("Resultado de la resta: " + resta);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(resta));
                this.valor = resta;
            }else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Boolean) {
                int n1 = (int) Nodoo1.valor;
                Boolean n2 = (Boolean) Nodoo2.valor;

                if (n2 == true) {
                    int restita;
                    restita = n1 - 1;
                    System.out.println("Resultado de la resta: " + restita);
                    //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restita));
                    this.valor = restita;


                } else {
                    int rest;
                    rest = n1;
                    System.out.println("Resultado de la resta: " + rest);
                    //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(rest));
                    this.valor = rest;
                }
            }else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Character) {
                int n1 = (int) Nodoo1.valor;
                Character n2 = (Character) Nodoo2.valor;
                System.out.println("char: " + n2);
                int restita = n1 - (int) n2;
                System.out.println("Resultado de la resta: " + restita);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restita));
                this.valor = restita;
            }else if(Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof String){
                System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor+ " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor +" {int} y " + Nodoo2.valor+ " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: " , Nodoo1.valor +" {int} y " + Nodoo2.valor+ " {string}", 0, 0);
                ErrorList.add(error);

            }else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Double) {
                double resta = (Double) Nodoo1.valor - (double) Nodoo2.valor;
                System.out.println("Resultado de la resta: " + resta);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(resta));
                this.valor = resta;
            }else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Integer) {
                double restax = (Double) Nodoo1.valor - (int) Nodoo2.valor;
                System.out.println("Resultado de la resta: " + restax);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restax));
                this.valor = restax;
            }else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Boolean) {
                Double n1 = (Double) Nodoo1.valor;
                Boolean n2 = (Boolean) Nodoo2.valor;

                if (n2 == true) {
                    Double restagg;
                    restagg = n1 - 1.0;
                    System.out.println("Resultado de la resta: " + restagg);
                   //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restagg));
                    this.valor = restagg;
                } else {
                    Double resc;
                    resc = n1 - 0;
                    System.out.println("Resultado de la resta: " + resc);
                    //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(resc));
                    this.valor = resc;
                }
            }else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Character) {
                Double n1 = (Double) Nodoo1.valor;
                Character n2 = (Character) Nodoo2.valor;
                Double restitachar = n1 - (double) n2;
                System.out.println("Resultado de la resta: " + restitachar);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restitachar));
                this.valor = restitachar;
            }else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof String) {
                System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: "  , Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}", 0,0);
                ErrorList.add(error);
            }else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Integer){
                Boolean n1= (Boolean) Nodoo1.valor;
                int n2 = (int) Nodoo2.valor;
                if(n1==true){
                    int restita;
                    restita = 1-n2 ;
                    System.out.println("Resultado de la resta: " + restita);
                    //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restita));
                    this.valor = restita;
                }else{
                    int restx;
                    restx = 0-n2;
                    System.out.println("Resultado de la resta: " + restx);
                    //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restx));
                    this.valor = restx;
                }
            }else if(Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Boolean){
                System.out.println("No se puede realizar la suma entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor+ " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor +" {bool} y " + Nodoo2.valor+ " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: " , Nodoo1.valor +" {bool} y " + Nodoo2.valor+ " {bool}", 0, 0);
                ErrorList.add(error);
            }else if(Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Character){
                System.out.println("No se puede realizar la suma entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor+ " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor +" {bool} y " + Nodoo2.valor+ " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: " , Nodoo1.valor +" {bool} y " + Nodoo2.valor+ " {char}", 0, 0);
                ErrorList.add(error);
            }else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof String){
                System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor+ " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor +" {bool} y " + Nodoo2.valor+ " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: " , Nodoo1.valor +" {bool} y " + Nodoo2.valor+ " {string}", 0, 0);
                ErrorList.add(error);
            }else if(Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Integer){
                Character n1= (Character) Nodoo1.valor;
                System.out.println("N1: " + Nodoo1.valor);
                int n2 = (int) Nodoo2.valor;
                System.out.println("N2: " + n2);
                int nuevo1 = (int)n1;
                int restx = nuevo1 - n2;
                System.out.println("Resultado de la resta: " + restx);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restx));
                this.valor = restx;
            }else if(Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Double){
                Character n1= (Character) Nodoo1.valor;
                Double n2 = (Double) Nodoo2.valor;
                double nuevo1 = (double)n1;
                double restxx = nuevo1 - n2;
                System.out.println("Resultado de la resta: " + restxx);
                //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restxx));
                this.valor = restxx;
            }else if(Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Boolean){
                System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor+ " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor+ " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: " , Nodoo1.valor + " {char} y " + Nodoo2.valor+ " {bool}", 0, 0);
                ErrorList.add(error);
            }else if(Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Character) {
                System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor+ " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor+ " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: " , Nodoo1.valor + " {char} y " + Nodoo2.valor+ " {char}", 0, 0);
                ErrorList.add(error);
            }else if(Nodoo1.valor instanceof Character && Nodoo2.valor instanceof String) {
                System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor+ " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor+ " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: " , Nodoo1.valor + " {char} y " + Nodoo2.valor+ " {string}", 0, 0);
                ErrorList.add(error);
            } else if(Nodoo1.valor instanceof String && Nodoo2.valor instanceof Integer){
                System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {int}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {int}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: " , Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {int}", 0, 0);
                ErrorList.add(error);
            } else if(Nodoo1.valor instanceof String && Nodoo2.valor instanceof Double) {
                System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {double}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {double}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: " , Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {double}", 0, 0);
                ErrorList.add(error);
            }else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Boolean){
                System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {bool}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {bool}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: " , Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {bool}", 0, 0);
                ErrorList.add(error);
            } else if(Nodoo1.valor instanceof String && Nodoo2.valor instanceof Character) {
                System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {char}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {char}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: " , Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {char}", 0, 0);
                ErrorList.add(error);
            } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof String) {
                System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {string}");
                textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {string}");
                Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: " , Nodoo1.valor + " {string} y " + Nodoo2.valor+ " {string}", 0, 0);
                ErrorList.add(error);
            }
            else{
                System.out.println("¡Error! Tipo de dato   incorrecto");
                textAreaGG2.setText("¡Error! Tipo de dato   incorrecto");
                Erroor error = new Erroor("Semantico", "¡Error! "," Tipo de dato   incorrecto",0, 0);
                ErrorList.add(error);

            }
        
        }catch(Exception e){
            System.out.println(e);   
            textAreaGG2.setText("No se realizó la resta ¡ERROR!");

        }
    }

    @Override
    public Instruccion Interpretarr() {
        Instruccion Nodoo1 = Nodo1.Interpretarr();
        Instruccion Nodoo2 = Nodo2.Interpretarr();
        RestandoNodos(Nodoo1, Nodoo2);
        return this;
   }
    
}
