package instrucciones;

import Abstract.ExpresionPrim;
import Abstract.Instruccion;
import Abstract.Retorno;
import Expresiones.Primitivos.DataPrimitiva;
import clases.Erroor;
import clases.Simbolito;
import clases.TablaSimbolos;
import clases.TipoDato;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class instDeclararVariable extends Instruccion {

    private String id;
    Instruccion valor;
    TablaSimbolos entorno;

    TipoDato tipo;

    public instDeclararVariable(TipoDato tipo,String id, Instruccion valor, TablaSimbolos entorno ) {
        this.tipo = tipo;
        this.id = id;
        this.valor = valor;
        this.entorno = entorno;
    }

    private void declararVariable() {
        try {
            boolean existe = entorno.ExisteSimbolo(id);
            Instruccion resultadoxx = valor.Interpretarr();
            System.out.println("RESULTADO: " + resultadoxx.valor + resultadoxx.valor.getClass());

            if (existe) {
                String errorMessage = "ERROR Semantico: Variable " + id + " ya declarada";
                System.out.println(errorMessage);
                textAreaGG2.setText(errorMessage);
                Erroor error = new Erroor("Semantico", id, "Variable ya declarada", 0, 0);
                ErrorList.add(error);
            } else {
                // Variable no existe, proceder con la declaración
                if (tipo == TipoDato.ENTERO && resultadoxx.valor instanceof Integer) {
                    Simbolito simbolito = new Simbolito(id, tipo.toString(), (Object) valor, entorno);
                    if (valor != null) {
                        // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                        System.out.println("Asignando valor a variable: " + id);
                        Instruccion resultado = valor.Interpretarr();
                        simbolito.valor = resultado.valor;
                    }
                    System.out.println("Declarando variable: " + id + " de tipo: " + tipo.toString() + " con valor: " + valor);
                    // Agregar la variable a la tabla de símbolos
                    System.out.println("Agregando variable a la tabla de símbolos");
                    entorno.Agregarsimbolo(id, simbolito);
                    entorno.ImprimirTabla();
                }
                else if (tipo == TipoDato.DECIMAL  && resultadoxx.valor instanceof Double) {
                    Simbolito simbolito = new Simbolito(id, tipo.toString(), (Object) valor, entorno);
                    if (valor != null) {
                        // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                        System.out.println("Asignando valor a variable: " + id);
                        Instruccion resultado = valor.Interpretarr();
                        simbolito.valor = resultado.valor;
                    }
                    System.out.println("Declarando variable: " + id + " de tipo: " + tipo.toString() + " con valor: " + valor);
                    // Agregar la variable a la tabla de símbolos
                    System.out.println("Agregando variable a la tabla de símbolos");
                    entorno.Agregarsimbolo(id, simbolito);
                    entorno.ImprimirTabla();
                }else if (tipo == TipoDato.CADENA  && resultadoxx.valor instanceof String) {
                    Simbolito simbolito = new Simbolito(id, tipo.toString(), (Object) valor, entorno);
                    if (valor != null) {
                        // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                        System.out.println("Asignando valor a variable: " + id);
                        Instruccion resultado = valor.Interpretarr();
                        simbolito.valor = resultado.valor;
                    }
                    System.out.println("Declarando variable: " + id + " de tipo: " + tipo.toString() + " con valor: " + valor);
                    // Agregar la variable a la tabla de símbolos
                    System.out.println("Agregando variable a la tabla de símbolos");
                    entorno.Agregarsimbolo(id, simbolito);
                    entorno.ImprimirTabla();
                } else if (tipo == TipoDato.BOOLEANO && resultadoxx.valor instanceof Boolean) {
                    Simbolito simbolito = new Simbolito(id, tipo.toString(), (Object) valor, entorno);
                    if (valor != null) {
                        // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                        System.out.println("Asignando valor a variable: " + id);
                        Instruccion resultado = valor.Interpretarr();
                        simbolito.valor = resultado.valor;
                    }
                    System.out.println("Declarando variable: " + id + " de tipo: " + tipo.toString() + " con valor: " + valor);
                    // Agregar la variable a la tabla de símbolos
                    System.out.println("Agregando variable a la tabla de símbolos");
                    entorno.Agregarsimbolo(id, simbolito);
                    entorno.ImprimirTabla();
                } else if (tipo == TipoDato.CARACTER && resultadoxx.valor instanceof Character) {
                    Simbolito simbolito = new Simbolito(id, tipo.toString(), (Object) valor, entorno);
                    if (valor != null) {
                        // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                        System.out.println("Asignando valor a variable: " + id);
                        Instruccion resultado = valor.Interpretarr();
                        simbolito.valor = resultado.valor;
                    }
                    System.out.println("Declarando variable: " + id + " de tipo: " + tipo.toString() + " con valor: " + valor);
                    // Agregar la variable a la tabla de símbolos
                    System.out.println("Agregando variable a la tabla de símbolos");
                    entorno.Agregarsimbolo(id, simbolito);
                    entorno.ImprimirTabla();
                } else {
                    String errorMessage = "ERROR Semantico: Variable [" + id + "] no coincide con el tipo esperado";
                    System.out.println(errorMessage);
                    textAreaGG2.setText(textAreaGG2.getText()+"\n"+errorMessage);
                    Erroor error = new Erroor("Semantico", id, "El tipo de dato de la variable no coincide con el tipo esperado", 0, 0);
                    ErrorList.add(error);
                }
            }
        }catch (Exception  e){
            System.out.println("ERROR: Tipo de dato no reconocido" + e);
            textAreaGG2.setText("ERROR: Tipo de dato no reconocido");
            Erroor error = new Erroor("Semantico", id, "Tipo de dato no reconocido", 0, 0);
            ErrorList.add(error);
        }

    }

    @Override
    public Instruccion Interpretarr() {
        declararVariable();
        return this;
    }
}
