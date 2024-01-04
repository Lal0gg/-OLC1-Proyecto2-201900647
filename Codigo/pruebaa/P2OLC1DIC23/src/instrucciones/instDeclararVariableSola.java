package instrucciones;

import Abstract.Instruccion;
import clases.Erroor;
import clases.Simbolito;
import clases.TablaSimbolos;
import clases.TipoDato;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class instDeclararVariableSola extends Instruccion {

    private String id;

    TablaSimbolos entorno;

    TipoDato tipo;

    public instDeclararVariableSola(String id, TablaSimbolos entorno, TipoDato tipo){
        this.id = id;
        this.entorno = entorno;
        this.tipo = tipo;
    }

    private void DeclararVariableSola() {
        try {
            boolean existe = entorno.ExisteSimbolo(id);
            if (existe) {
                String errorMessage = "ERROR Semantico: Variable " + id + " ya declarada";
                System.out.println(errorMessage);
                textAreaGG2.setText(errorMessage);
                Erroor error = new Erroor("Semantico", id, "Variable ya declarada", 0, 0);
                ErrorList.add(error);
            } else {
                if (tipo == TipoDato.ENTERO) {
                    Simbolito simbolito = new Simbolito(id, tipo.toString(), 0 , entorno);
                    if (valor != null) {
                        // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                        System.out.println("Asignando valor a variable: " + id);

                    }
                    System.out.println("Declarando variable: " + id + " de tipo: " + tipo.toString() + " con valor: " + valor);
                    // Agregar la variable a la tabla de símbolos
                    System.out.println("Agregando variable a la tabla de símbolos");
                    entorno.Agregarsimbolo(id, simbolito);
                    entorno.ImprimirTabla();

                } else if (tipo == TipoDato.DECIMAL) {
                    Simbolito simbolito = new Simbolito(id, tipo.toString(), 0.0, entorno);
                    if (valor != null) {
                        // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                        System.out.println("Asignando valor a variable: " + id);

                    }
                    System.out.println("Declarando variable: " + id + " de tipo: " + tipo.toString() + " con valor: " + valor);
                    // Agregar la variable a la tabla de símbolos
                    System.out.println("Agregando variable a la tabla de símbolos");
                    entorno.Agregarsimbolo(id, simbolito);
                    entorno.ImprimirTabla();

                } else if (tipo == TipoDato.CADENA) {
                    Simbolito simbolito = new Simbolito(id, tipo.toString(), "", entorno);
                    if (valor != null) {
                        // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                        System.out.println("Asignando valor a variable: " + id);

                    }
                    System.out.println("Declarando variable: " + id + " de tipo: " + tipo.toString() + " con valor: " + valor);
                    // Agregar la variable a la tabla de símbolos
                    System.out.println("Agregando variable a la tabla de símbolos");
                    entorno.Agregarsimbolo(id, simbolito);
                    entorno.ImprimirTabla();

                } else if (tipo == TipoDato.BOOLEANO) {
                    Simbolito simbolito = new Simbolito(id, tipo.toString(), false, entorno);
                    if (valor != null) {
                        // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                        System.out.println("Asignando valor a variable: " + id);

                    }
                    System.out.println("Declarando variable: " + id + " de tipo: " + tipo.toString() + " con valor: " + valor);
                    // Agregar la variable a la tabla de símbolos
                    System.out.println("Agregando variable a la tabla de símbolos");
                    entorno.Agregarsimbolo(id, simbolito);
                    entorno.ImprimirTabla();
                } else if (tipo == TipoDato.CARACTER) {
                    Simbolito simbolito = new Simbolito(id, tipo.toString(), null, entorno);
                    if (valor != null) {
                        // Si hay un valor asignado, evaluar la expresión y asignar el valor a la variable
                        System.out.println("Asignando valor a variable: " + id);

                    }
                    System.out.println("Declarando variable: " + id + " de tipo: " + tipo.toString() + " con valor: " + valor);
                    // Agregar la variable a la tabla de símbolos
                    System.out.println("Agregando variable a la tabla de símbolos");
                    entorno.Agregarsimbolo(id, simbolito);
                    entorno.ImprimirTabla();
                } else {
                    String errorMessage = "ERROR Semantico: Tipo de dato no reconocido";
                    System.out.println(errorMessage);
                    textAreaGG2.setText(textAreaGG2.getText()+"\n"+errorMessage);
                    Erroor error = new Erroor("Semantico", id, "Tipo de dato no reconocido", 0, 0);
                    ErrorList.add(error);
                }

            }

        }catch(Exception e){
            System.out.println("ERROR: Tipo de dato no reconocido" + e);
            textAreaGG2.setText(textAreaGG2.getText()+"\n"+"ERROR: Tipo de dato no reconocido");
            Erroor error = new Erroor("Semantico", id, "Tipo de dato no reconocido", 0, 0);
            ErrorList.add(error);

        }
    }



    @Override
    public Instruccion Interpretarr() {
        DeclararVariableSola();
        return this;
    }
}
