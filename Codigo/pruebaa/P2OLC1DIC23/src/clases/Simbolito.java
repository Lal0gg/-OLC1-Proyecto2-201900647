/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author edujr
 */
public class Simbolito {

    public String nombre;
    public String tipo;
    public Object valor;
    public Object entorno;

    public Simbolito(String nombre, String tipo, Object valor, Object entorno) {
        this.nombre = "";
        this.tipo = "";
        this.valor = null;
        this.entorno = null;
    }


    public String ToxdString(){
        return "ID: " + nombre + ", Tipo: " + tipo + ", Valor: " + valor + ", Entorno: " + entorno;

    }




}
