package clases;

import java.util.HashMap;
import java.util.Stack;

public class TablaSimbolos {

    public TablaSimbolos anterior;



    public HashMap<String, Simbolito> actual;

    public TablaSimbolos() {
        this.anterior = null;
        this.actual = new HashMap<String,Simbolito>();
    }

    public TablaSimbolos getAnterior() {
        return anterior;
    }

    public void setAnterior(TablaSimbolos anterior) {
        this.anterior = anterior;
    }

    public void setActual(HashMap<String, Simbolito> actual) {
        this.actual = actual;
    }

    public HashMap<String, Simbolito> getActual() {
        return actual;
    }

    // =================================================== MANEJO SIMBOLOS ===================================================

    public boolean ExisteSimbolo(String id) {
        TablaSimbolos entorno = this;
        while (entorno != null) {
            if (entorno.getActual().containsKey(id)) {
                return true;
            }
            entorno = entorno.getAnterior();
        }
        return false;

    }

    public void Agregarsimbolo(String id, Simbolito simbolo) {
        this.getActual().put(id, simbolo);
    }


    public Simbolito ObtenerSimbolo(String id) {
        TablaSimbolos entorno = this;
        while (entorno != null) {
            if (entorno.getActual().containsKey(id)) {
                return entorno.getActual().get(id);
            }
            entorno = entorno.getAnterior();
        }
        return null;
    }

    public void ActualizarSimbolo(String id, Simbolito simbolo) {
        TablaSimbolos entorno = this;
        while (entorno != null) {
            if (entorno.getActual().containsKey(id)) {
                entorno.getActual().put(id, simbolo);
                return;
            }
            entorno = entorno.getAnterior();
        }
    }


    public void ImprimirTabla() {
        TablaSimbolos entorno = this;
        while (entorno != null) {
            System.out.println("ENTORNO: " + entorno.toString());
            for (String key : entorno.getActual().keySet()) {
                System.out.println("SIMBOLO: " + entorno.getActual().get(key).ToxdString());
            }
            entorno = entorno.getAnterior();
        }
    }







}