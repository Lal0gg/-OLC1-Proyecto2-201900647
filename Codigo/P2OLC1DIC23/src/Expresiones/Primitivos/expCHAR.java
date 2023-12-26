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
        this.valor = valor.charAt(0);
    
    }

    @Override
    public Instruccion Interpretarr() {
        return this;
    }
    
}
