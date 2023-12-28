/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones.Primitivos;

import Abstract.Instruccion;

/**
 *
 * @author edujr
 */
public class expCHAR extends Instruccion{


    public expCHAR(String valor){
        System.out.println("CHAR: " + valor);
        System.out.println("CHARv: " + valor.length());
        if (valor.length() == 3) {
            // Si es un solo carácter, asignar directamente
            System.out.println("CHARa: " + valor);
            this.valor = valor.charAt(1);
            System.out.println("CHARb: " + this.valor);
        } else if (valor.length()>3) {
            // Manejar la secuencia de escape \\ como un solo carácter '\'
            System.out.println("CHARf1: " + valor.charAt(2));
            System.out.println("CHARf2: " + valor.charAt(1));
            System.out.println("CHARf3: " + valor.charAt(3));
            System.out.println("CHARf4: " + valor.charAt(4));
            if(valor.charAt(3) == 'n') {
                System.out.println("CHARn: " + valor);
                this.valor = "\\n";
            }
            else if(valor.charAt(3) == 'r') {
                System.out.println("CHARr: " + valor);
                this.valor = "\\r";
            }
            else if(valor.charAt(3) == '\"') {
                System.out.println("CHARq: " + valor);
                this.valor = "\"";
            }
            else if(valor.charAt(3) == 't') {
                System.out.println("CHARt: " + valor);
                this.valor = "\\t";
            }
            else if (valor.charAt(3) == 'b') {
                System.out.println("CHARb: " + valor);
                this.valor = "\\b";
            }else if( valor.charAt(3) == 'f') {
                System.out.println("CHARf: " + valor);
                this.valor = "\\f";
            }else if( valor.charAt(3) == '\\') {
                System.out.println("CHARfz: " + valor);
                this.valor = "\\\\";
            }
        }
    }

    @Override
    public Instruccion Interpretarr() {
        return this;
    }
    
}
