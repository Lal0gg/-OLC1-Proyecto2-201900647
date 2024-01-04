package instrucciones;

import Abstract.Instruccion;
import clases.Erroor;
import clases.Simbolito;
import clases.TablaSimbolos;
import clases.TipoDato;

import java.util.LinkedList;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class instDeclararVariableSolaList extends Instruccion {


    private LinkedList<String> id;
    TablaSimbolos entorno;
    TipoDato tipo;

    public instDeclararVariableSolaList(TipoDato tipo,LinkedList<String> id, TablaSimbolos entorno){
        this.id = id;
        this.entorno = entorno;
        this.tipo = tipo;
    }

    private void DeclararVariableLista(){
        try {
            if (tipo == TipoDato.ENTERO) {
                for (String id1 : id) {
                    boolean existe = entorno.ExisteSimbolo(id1);
                    if (existe) {
                        System.out.println("ERROR Semantico: Variable " + id1 + " ya declarada");
                    } else {
                        Simbolito simbolito = new Simbolito(id1, tipo.toString(), null, entorno);
                        System.out.println("Declarando variable: " + id1 + " de tipo: " + tipo.toString());
                        // Agregar la variable a la tabla de símbolos
                        String nuevotipo= simbolito.Casteartipo(tipo);
                        simbolito.tipo = nuevotipo;
                        System.out.println("Agregando variable a la tabla de símbolos");
                        entorno.Agregarsimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    }
                }

            }else if (tipo == TipoDato.DECIMAL) {
                for (String id1 : id) {
                    boolean existe = entorno.ExisteSimbolo(id1);
                    if (existe) {
                        System.out.println("ERROR Semantico: Variable " + id1 + " ya declarada");
                    } else {
                        Simbolito simbolito = new Simbolito(id1, tipo.toString(), null, entorno);
                        System.out.println("Declarando variable: " + id1 + " de tipo: " + tipo.toString());
                        // Agregar la variable a la tabla de símbolos
                        String nuevotipo= simbolito.Casteartipo(tipo);
                        simbolito.tipo = nuevotipo;
                        System.out.println("Agregando variable a la tabla de símbolos");
                        entorno.Agregarsimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    }
                }
            } else if (tipo == TipoDato.CADENA) {
                for (String id1 : id) {
                    boolean existe = entorno.ExisteSimbolo(id1);
                    if (existe) {
                        System.out.println("ERROR Semantico: Variable " + id1 + " ya declarada");
                    } else {
                        Simbolito simbolito = new Simbolito(id1, tipo.toString(), null, entorno);
                        System.out.println("Declarando variable: " + id1 + " de tipo: " + tipo.toString());
                        // Agregar la variable a la tabla de símbolos
                        String nuevotipo= simbolito.Casteartipo(tipo);
                        simbolito.tipo = nuevotipo;
                        System.out.println("Agregando variable a la tabla de símbolos");
                        entorno.Agregarsimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    }
                }
            } else if (tipo == TipoDato.BOOLEANO) {
                for (String id1 : id) {
                    boolean existe = entorno.ExisteSimbolo(id1);
                    if (existe) {
                        System.out.println("ERROR Semantico: Variable " + id1 + " ya declarada");
                    } else {
                        Simbolito simbolito = new Simbolito(id1, tipo.toString(), null, entorno);
                        System.out.println("Declarando variable: " + id1 + " de tipo: " + tipo.toString());
                        // Agregar la variable a la tabla de símbolos
                        String nuevotipo= simbolito.Casteartipo(tipo);
                        simbolito.tipo = nuevotipo;
                        System.out.println("Agregando variable a la tabla de símbolos");
                        entorno.Agregarsimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    }
                }
            } else if (tipo == TipoDato.CARACTER){
                for (String id1 : id) {
                    boolean existe = entorno.ExisteSimbolo(id1);
                    if (existe) {
                        System.out.println("ERROR Semantico: Variable " + id1 + " ya declarada");
                    } else {
                        Simbolito simbolito = new Simbolito(id1, tipo.toString(), null, entorno);
                        System.out.println("Declarando variable: " + id1 + " de tipo: " + tipo.toString());
                        // Agregar la variable a la tabla de símbolos
                        String nuevotipo= simbolito.Casteartipo(tipo);
                        simbolito.tipo = nuevotipo;
                        System.out.println("Agregando variable a la tabla de símbolos");
                        entorno.Agregarsimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    }
                }
            }
            else{
                for (String id1 : id) {
                    System.out.println("ERROR: Tipo de dato no reconocidoo" );
                    textAreaGG2.setText(textAreaGG2.getText()+"\n"+"ERROR: Tipo de dato no reconocido");
                    Erroor error = new Erroor("Semantico", id1, "Tipo de dato no reconocido", 0, 0);
                    ErrorList.add(error);
                }
            }
        }catch (Exception e){
            for (String id1 : id) {
                System.out.println("ERROR: Tipo de dato no reconocido" + e);
                textAreaGG2.setText(textAreaGG2.getText()+"\n"+"ERROR: Tipo de dato no reconocido");
                Erroor error = new Erroor("Semantico", id1, "Tipo de dato no reconocido", 0, 0);
                ErrorList.add(error);
            }

        }

    }




    @Override
    public Instruccion Interpretarr() {
        DeclararVariableLista();
        return this;
    }
}
