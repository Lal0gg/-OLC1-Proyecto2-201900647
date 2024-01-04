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
    public Simbolito(String nombre, String tipo, Object valor, Object entorno) {
        this.nombre = "";
        this.tipo = "";
        this.valor = null;
        this.entorno = null;
    }
    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Object getEntorno() {
        return entorno;
    }

    public void setEntorno(Object entorno) {
        this.entorno = entorno;
    }

    public Object valor;
    public Object entorno;




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String Casteartipo(TipoDato tipo) {

        if(tipo == TipoDato.ENTERO){
            return "ENTERO";
        }else if(tipo == TipoDato.DECIMAL){
            return "DECIMAL";
        } else if(tipo == TipoDato.CADENA){
            return "CADENA";
        } else if(tipo == TipoDato.BOOLEANO){
            return "BOOLEANO";
        } else if(tipo == TipoDato.CARACTER){
            return "CARACTER";
        } else {
            return "null";
        }
    }
    public String ToxdString(){
        return "ID: " + nombre + ", Tipo: " + tipo + ", Valor: " + valor + ", Entorno: " + entorno;

    }




}
