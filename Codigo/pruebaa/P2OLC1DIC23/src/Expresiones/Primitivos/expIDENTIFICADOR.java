/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones.Primitivos;

import Abstract.Instruccion;
import clases.*;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

/**
 *
 * @author edujr
 */
public class expIDENTIFICADOR extends Instruccion{

    private String id;
    private TablaSimbolos tablaSimbolos;  // Agrega este campo

    public expIDENTIFICADOR(String id , TablaSimbolos tablaSimbolos) {
        this.id = id;
        this.tablaSimbolos = tablaSimbolos;
    }

    public void setTablaSimbolos(TablaSimbolos tablaSimbolos) {
        this.tablaSimbolos = tablaSimbolos;
    }

    private void exp(String id) {

        if (tablaSimbolos == null) {
            System.out.println("Error Semantico: No hay entorno");
            textAreaGG2.setText("Error Semantico: No hay entorno");
            Erroor error = new Erroor("Semantico", "No hay entorno", "No hay entorno", 0, 0);
            ErrorList.add(error);
            return;
        }

        System.out.println("IDENTIFICADOR: " + id);
        boolean existe = tablaSimbolos.ExisteSimbolo(id);
        System.out.println("EXISTE: " + existe);
        if (existe) {
            Simbolito simbolito = tablaSimbolos.ObtenerSimbolo(id);
            System.out.println("SIMBOLO: " + simbolito.toString());
            this.valor = simbolito.valor;
        } else {
            System.out.println("ERROR: Variable " + id + " no declarada");
            textAreaGG2.setText("ERROR: Variable " + id + " no declarada");
            Erroor error = new Erroor("Semantico", id, "Variable no declarada", 0, 0);
            ErrorList.add(error);
        }
    }

    @Override
    public Instruccion Interpretarr() {
        exp(id);
        return this;
    }
    
}
