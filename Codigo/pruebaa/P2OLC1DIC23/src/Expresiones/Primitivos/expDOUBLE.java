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
public class expDOUBLE extends  Instruccion{
    
    public expDOUBLE(String valor){
        this.valor = Double.valueOf(valor);
    }

    @Override
    public Instruccion Interpretarr() {
        return this;
    }
    
}
