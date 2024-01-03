package Expresiones.Relacional;

import Abstract.Instruccion;

import java.util.Objects;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;
import clases.Erroor;
import clases.TablaSimbolos;

public class relIGUALIGUAL  extends Instruccion {

    Instruccion Nodo1;
    Instruccion Nodo2;

    public relIGUALIGUAL(Instruccion Nodo1, Instruccion Nodo2) {
        this.Nodo1 = Nodo1;
        this.Nodo2 = Nodo2;
    }

    private void verificarIgualdad(Instruccion No1, Instruccion No2){
        try {
            if (No1.valor instanceof Integer && No2.valor instanceof Integer) {
                System.out.println("Entro a verificar igualdad int: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals((int) No1.valor, (int) No2.valor);
                System.out.println("Valor de la igualdad int: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Integer && No2.valor instanceof Double) {
                System.out.println("Entro a verificar igualdad int double: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals((double)(int) No1.valor, (double) No2.valor);
                System.out.println("Valor de la igualdad int double: " + valor);
                this.valor = valor;

            } else if (No1.valor instanceof Integer && No2.valor instanceof Character) {
                System.out.println("Entro a verificar igualdad char int: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals((char) (int) No1.valor,(char) No2.valor);
                System.out.println("Valor de la igualdad int char: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Double && No2.valor instanceof Double) {
                System.out.println("Entro a verificar igualdad double: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals((double) No1.valor, (double) No2.valor);
                System.out.println("Valor de la igualdad double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Double && No2.valor instanceof Integer) {
                System.out.println("Entro a verificar igualdad double int: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals((double) No1.valor, (double) (int) No2.valor);
                System.out.println("Valor de la igualdad double int: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Double && No2.valor instanceof Character) {
                System.out.println("Entro a verificar igualdad double char: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals((double) No1.valor, (double) (char) No2.valor);
                System.out.println("Valor de la igualdad double char: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Character && No2.valor instanceof Character) {
                System.out.println("Entro a verificar igualdad char: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals((char) No1.valor, (char) No2.valor);
                System.out.println("Valor de la igualdad char: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Character && No2.valor instanceof Integer) {
                System.out.println("Entro a verificar igualdad char int: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals((char) No1.valor, (int) No2.valor);
                System.out.println("Valor de la igualdad char int: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Character && No2.valor instanceof Double) {
                System.out.println("Entro a verificar igualdad char double: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals((char) No1.valor, (double) No2.valor);
                System.out.println("Valor de la igualdad char double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Character && No2.valor instanceof String) {
                System.out.println("Entro a verificar igualdad char String: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals(String.valueOf(No1.valor), No2.valor);
                System.out.println("Valor de la igualdad char String: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof String && No2.valor instanceof Character) {
                System.out.println("Entro a verificar igualdad String char: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals(No1.valor, String.valueOf(No2.valor));
                System.out.println("Valor de la igualdad String char: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof String && No2.valor instanceof String) {
                System.out.println("Entro a verificar igualdad String: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals((String) No1.valor, (String) No2.valor);
                System.out.println("Valor de la igualdad String: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Boolean && No2.valor instanceof Boolean) {
                System.out.println("Entro a verificar igualdad boolean: " + No1.valor + " == " + No2.valor);
                boolean valor = Objects.equals((boolean) No1.valor, (boolean) No2.valor);
                System.out.println("Valor de la igualdad boolean: " + valor);
                this.valor = valor;
            } else {
                System.out.println("Tipos no manejados en la igualdad: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                textAreaGG2.setText("Tipos no manejados en la igualdad: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                Erroor error =  new Erroor("Semantico", "Tipos no manejados en la igualdad: " ,No1.valor.getClass() + " y " + No2.valor.getClass(),0, 0);
                ErrorList.add(error);
            }
        } catch (Exception e) {
            System.out.println("Error al verificar igualdad");
        }
    }

    @Override
    public Instruccion Interpretarr( ) {
        Instruccion Nod1 = Nodo1.Interpretarr();
        Instruccion Nod2 = Nodo2.Interpretarr();
        verificarIgualdad(Nod1,Nod2);
        return this;
    }
}
