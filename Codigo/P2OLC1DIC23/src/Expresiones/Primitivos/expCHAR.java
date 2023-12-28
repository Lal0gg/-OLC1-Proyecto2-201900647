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
    
    private char valor;

    public expCHAR(String valor){
        System.out.println("valor: "+ valor);
        if (valor.length() == 3) {
            // Si es un solo carácter, asignar directamente
            this.valor = valor.charAt(0);
        } else if (valor.startsWith("\\")) {
            // Manejar la secuencia de escape \\ como un solo carácter '\'
            System.out.println("xd:"+ this.valor);
            this.valor = '\\';
        } else {
            // Interpretar secuencias de escape comunes
            System.out.println("c: " +valor);
            switch (valor.substring(1)) {
                case "n":
                    this.valor = '\n';
                    break;
                case "r":
                    this.valor = '\r';
                    break;
                case "\"":
                    this.valor = '\"';
                    break;
                case "t":
                    this.valor = '\t';
                    break;
                // Puedes agregar más casos según sea necesario
                default:
                    // Si no es ninguna secuencia de escape conocida, asignar el segundo carácter
                    this.valor = valor.charAt(1);
                    break;
            }
        }
    }

    @Override
    public Instruccion Interpretarr() {
        return this;
    }
    
}
