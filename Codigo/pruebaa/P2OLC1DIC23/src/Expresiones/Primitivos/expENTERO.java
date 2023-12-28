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
public class expENTERO extends Instruccion {
    
    public expENTERO(String valor){
        this.valor = Integer.parseInt(valor);
    }

    @Override
    public Instruccion Interpretarr() {
        return this;
    }
    
}
