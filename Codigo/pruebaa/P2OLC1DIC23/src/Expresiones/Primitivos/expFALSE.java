/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones.Primitivos;

import Abstract.Instruccion;
import clases.TablaSimbolos;

/**
 *
 * @author edujr
 */
public class expFALSE extends Instruccion {
    
    public expFALSE(String valor){
        this.valor = Boolean.parseBoolean(valor);
    }

    @Override
    public Instruccion Interpretarr( ) {
        return  this;
    }
    
}
