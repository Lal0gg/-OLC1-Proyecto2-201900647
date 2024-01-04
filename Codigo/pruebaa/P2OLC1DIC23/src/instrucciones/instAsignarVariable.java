package instrucciones;

import Abstract.Instruccion;
import clases.Erroor;
import clases.Simbolito;
import clases.TablaSimbolos;
import clases.TipoDato;

import java.util.LinkedList;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class instAsignarVariable extends Instruccion {

    private LinkedList<String> id;
    Instruccion valor;
    TablaSimbolos entorno;

    TipoDato tipo;

    public instAsignarVariable(LinkedList<String> id, Instruccion valor, TablaSimbolos entorno) {
        this.id = id;
        this.valor = valor;
        this.entorno = entorno;
    }

    private void AsignarAvariables() {
        for (String id1 : id) {
            System.out.println("Buscando variable: " + id1);
            try {
                boolean existe = entorno.ExisteSimbolo(id1);
                if (existe) {
                    System.out.println("Variable [" + id1 + "] encontrada");

                    // Validar que el tipo de dato del valor coincida con el de la variable
                    if (valor.Interpretarr().valor instanceof Integer) {
                        Simbolito simbolito = entorno.ObtenerSimbolo(id1);
                        // Asignación de valor aquí
                        System.out.println("Asignando valor["+ valor +"]a variable: [" + id1+"]");
                        Object valorAsignar = valor.Interpretarr().valor;
                        simbolito.valor = valorAsignar;
                        entorno.ActualizarSimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    } else if( valor.Interpretarr().valor instanceof Double){
                        Simbolito simbolito = entorno.ObtenerSimbolo(id1);
                        // Asignación de valor aquí
                        System.out.println("Asignando valor["+ valor +"]a variable: [" + id1+"]");
                        Object valorAsignar = valor.Interpretarr().valor;
                        simbolito.valor = valorAsignar;
                        entorno.ActualizarSimbolo(id1, simbolito);
                        entorno.ImprimirTabla();

                    } else if (valor.Interpretarr().valor instanceof String) {
                        Simbolito simbolito = entorno.ObtenerSimbolo(id1);
                        // Asignación de valor aquí
                        System.out.println("Asignando valor["+ valor +"]a variable: [" + id1+"]");
                        Object valorAsignar = valor.Interpretarr().valor;
                        simbolito.valor = valorAsignar;
                        entorno.ActualizarSimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    }else if (valor.Interpretarr().valor instanceof Boolean) {
                        Simbolito simbolito = entorno.ObtenerSimbolo(id1);
                        // Asignación de valor aquí
                        System.out.println("Asignando valor["+ valor +"]a variable: [" + id1+"]");
                        Object valorAsignar = valor.Interpretarr().valor;
                        simbolito.valor = valorAsignar;
                        entorno.ActualizarSimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    } else if (valor.Interpretarr().valor instanceof Character) {
                        Simbolito simbolito = entorno.ObtenerSimbolo(id1);
                        // Asignación de valor aquí
                        System.out.println("Asignando valor["+ valor +"]a variable: [" + id1+"]");
                        Object valorAsignar = valor.Interpretarr().valor;
                        simbolito.valor = valorAsignar;
                        entorno.ActualizarSimbolo(id1, simbolito);
                        entorno.ImprimirTabla();
                    }
                    else {

                        System.out.println("ERROR Semántico: Tipo de dato incorrecto para la variable " + id1);
                        textAreaGG2.setText( textAreaGG2.getText()+"\n"+"ERROR Semántico: Tipo de dato incorrecto para la variable " + id1);
                        Erroor error = new Erroor("Semantico", id1, "Tipo de dato incorrecto para la variable", 0, 0);
                        ErrorList.add(error);
                    }
                } else {
                    System.out.println("ERROR Semántico: Variable " + id1 + " no declarada");
                    textAreaGG2.setText( textAreaGG2.getText()+"\n"+"ERROR Semántico: Variable " + id1 + " no declarada");
                    Erroor error = new Erroor("Semantico", id1, "Variable no declarada", 0, 0);
                    ErrorList.add(error);
                }
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }


    @Override
    public Instruccion Interpretarr() {
        AsignarAvariables();
        return this;
    }
}
