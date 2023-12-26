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
                textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(resta));
                this.valor = resta;
            
            }else{
                System.out.println("¡Error! Tipo de dato   incorrecto");
               textAreaGG2.setText("¡Error! Tipo de dato   incorrecto");

            }
        
        }catch(Exception e){
            System.out.println(e);   
            textAreaGG2.setText("No se realizó la suma ¡ERROR!");

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
