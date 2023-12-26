/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

import java.util.LinkedList;

/**
 *
 * @author edujr
 */
public class Nodo {
    
    public String token;
    public String lexema;
    public int line;
    public int column;
    public LinkedList<Nodo> hijoss = new LinkedList<>();

    public Nodo(String token, String lexema, int line, int column) {
        this.token = token;
        this.lexema = lexema;
        this.line = line;
        this.column = column;
        this.hijoss = new LinkedList<Nodo>();
    }
 
    public void AgregarHijo(Nodo nodito){
        this.hijoss.add(nodito);
    }    
}
