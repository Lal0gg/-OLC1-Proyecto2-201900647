package instrucciones;

import Abstract.ExpresionPrim;
import Abstract.Instruccion;
import Abstract.Retorno;
import Expresiones.Primitivos.DataPrimitiva;
import clases.Erroor;
import clases.Simbolito;
import clases.TablaSimbolos;
import clases.TipoDato;

import java.util.LinkedList;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class instDeclararVariable extends Instruccion {


    Instruccion valor;
    TablaSimbolos entorno;

    TipoDato tipo;

    private LinkedList<String> id;

    public instDeclararVariable(TipoDato tipo, LinkedList<String> id, Instruccion valor, TablaSimbolos entorno) {
        this.tipo = tipo;
        this.id = id;
        this.valor = valor;
        this.entorno = entorno;

    }

    private void declararVariable() {
        for (String id1 : id) {
            try {
                boolean existe = entorno.ExisteSimbolo(id1);
                Instruccion resultadoxx = valor.Interpretarr();
                System.out.println("RESULTADO: " + resultadoxx.valor + resultadoxx.valor.getClass());

                if (existe) {
                    String errorMessage = "ERROR Semantico: Variable " + id1 + " ya declarada";
                    System.out.println(errorMessage);
                    textAreaGG2.setText(errorMessage);
                    Erroor error = new Erroor("Semantico", id1, "Variable ya declarada", 0, 0);
                    ErrorList.add(error);
                } else {
                    // Variable no existe, proceder con la declaración

                    if (tipo == TipoDato.ENTERO && resultadoxx.valor instanceof Integer) {

                        Simbolito simbolito = new Simbolito(id1, tipo.toString(), (Object) valor, entorno);

                        if (valor != null) {
                            // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                            System.out.println("Asignando valor a variable: " + id);
                            Instruccion resultado = valor.Interpretarr();
                            simbolito.valor = resultado.valor;
                            String nuevoTipo = simbolito.Casteartipo(tipo);
                            simbolito.tipo = nuevoTipo;
                        }
                        System.out.println("Declarando variable: " + id1 + " de tipo: " + tipo + " con valor: " + valor);
                        // Agregar la variable a la tabla de símbolos
                        System.out.println("Agregando variable a la tabla de símbolos");
                        entorno.Agregarsimbolo(id1, simbolito);
                        entorno.ImprimirTabla();


                    } else if (tipo == TipoDato.DECIMAL && resultadoxx.valor instanceof Double) {
                        Simbolito simbolito = new Simbolito(id1, tipo.toString(), (Object) valor, entorno);

                        if (valor != null) {
                            // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                            System.out.println("Asignando valor a variable: " + id1);
                            Instruccion resultado = valor.Interpretarr();
                            simbolito.valor = resultado.valor;
                            String nuevoTipo = simbolito.Casteartipo(tipo);
                            simbolito.tipo = nuevoTipo;
                            System.out.println("Nuevo tipo: " + nuevoTipo);
                        }
                        System.out.println("Declarando variable: " + id1 + " de tipo: " + tipo + " con valor: " + valor);
                        // Agregar la variable a la tabla de símbolos
                        System.out.println("Agregando variable a la tabla de símbolos");
                        entorno.Agregarsimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    } else if (tipo == TipoDato.CADENA && resultadoxx.valor instanceof String) {
                        Simbolito simbolito = new Simbolito(id1, tipo.toString(), (Object) valor, entorno);

                        if (valor != null) {
                            // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                            System.out.println("Asignando valor a variable: " + id1);
                            Instruccion resultado = valor.Interpretarr();
                            simbolito.valor = resultado.valor;
                            String nuevoTipo = simbolito.Casteartipo(tipo);
                            simbolito.tipo = nuevoTipo;
                            System.out.println("Nuevo tipo: " + nuevoTipo);
                        }
                        System.out.println("Declarando variable: " + id1 + " de tipo: " + tipo + " con valor: " + valor);
                        // Agregar la variable a la tabla de símbolos
                        System.out.println("Agregando variable a la tabla de símbolos");
                        entorno.Agregarsimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    } else if (tipo == TipoDato.BOOLEANO && resultadoxx.valor instanceof Boolean) {
                        Simbolito simbolito = new Simbolito(id1, tipo.toString(), (Object) valor, entorno);

                        if (valor != null) {
                            // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                            System.out.println("Asignando valor a variable: " + id1);
                            Instruccion resultado = valor.Interpretarr();
                            simbolito.valor = resultado.valor;
                            String nuevoTipo = simbolito.Casteartipo(tipo);
                            simbolito.tipo = nuevoTipo;
                            System.out.println("Nuevo tipo: " + nuevoTipo);
                        }
                        System.out.println("Declarando variable: " + id1 + " de tipo: " + tipo + " con valor: " + valor);
                        // Agregar la variable a la tabla de símbolos
                        System.out.println("Agregando variable a la tabla de símbolos");
                        entorno.Agregarsimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    } else if (tipo == TipoDato.CARACTER && resultadoxx.valor instanceof Character) {
                        Simbolito simbolito = new Simbolito(id1, tipo.toString(), (Object) valor, entorno);
                        System.out.println("tipo: " + tipo.toString());
                        if (valor != null) {
                            // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                            System.out.println("Asignando valor a variable: " + id1);
                            Instruccion resultado = valor.Interpretarr();
                            simbolito.valor = resultado.valor;
                            String nuevoTipo = simbolito.Casteartipo(tipo);
                            simbolito.tipo = nuevoTipo;
                            System.out.println("Nuevo tipo: " + nuevoTipo);
                        }
                        System.out.println("Declarando variable: " + id1 + " de tipo: " + tipo + " con valor: " + valor);
                        // Agregar la variable a la tabla de símbolos
                        System.out.println("Agregando variable a la tabla de símbolos");
                        entorno.Agregarsimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    } else {
                        String errorMessage = "ERROR Semantico: Variable [" + id1 + "] no coincide con el tipo esperado";
                        System.out.println(errorMessage);
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + errorMessage);
                        Erroor error = new Erroor("Semantico", id1, "El tipo de dato de la variable no coincide con el tipo esperado", 0, 0);
                        ErrorList.add(error);
                    }
                }
            } catch (Exception e) {
                System.out.println("ERROR: Tipo de dato no reconocido" + e);
                textAreaGG2.setText("ERROR: Tipo de dato no reconocido");
                Erroor error = new Erroor("Semantico", id1, "Tipo de dato no reconocido", 0, 0);
                ErrorList.add(error);
            }

        }


    }

    @Override
    public Instruccion Interpretarr() {
        declararVariable();
        return this;
    }
}
