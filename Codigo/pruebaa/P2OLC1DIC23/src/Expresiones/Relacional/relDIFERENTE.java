package Expresiones.Relacional;

import Abstract.Instruccion;
import clases.Erroor;

import java.util.Objects;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class relDIFERENTE extends Instruccion {

    Instruccion Nodo1;
    Instruccion Nodo2;

    public relDIFERENTE(Instruccion Nodo1, Instruccion Nodo2) {
        this.Nodo1 = Nodo1;
        this.Nodo2 = Nodo2;
    }

    private void  verificarDiferente(Instruccion No1, Instruccion No2){
        if (No1.valor instanceof Integer && No2.valor instanceof Integer) {
            System.out.println("Entro a verificar distinto int: " + No1.valor + " != " + No2.valor);
            boolean valor = ((int) No1.valor) != ((int) No2.valor);
            System.out.println("Valor de distinto int: " + valor);
            this.valor = valor;
        } else if (No1.valor instanceof Integer && No2.valor instanceof Double) {
            System.out.println("Entro a verificar distinto int double: " + No1.valor + " != " + No2.valor);
            boolean valor = ((double) (int) No1.valor) != ((double) No2.valor);
            System.out.println("Valor de distinto int double: " + valor);
            this.valor = valor;
        } else if (No1.valor instanceof Integer && No2.valor instanceof Character) {
            System.out.println("Entro a verificar distinto int char: " + No1.valor + " != " + No2.valor);
            boolean valor = ((int) No1.valor) != ((char) No2.valor);
            System.out.println("Valor de distinto int char: " + valor);
            this.valor = valor;
        } else if (No1.valor instanceof Double && No2.valor instanceof Double) {
            System.out.println("Entro a verificar distinto double: " + No1.valor + " != " + No2.valor);
            boolean valor = ((double) No1.valor) != ((double) No2.valor);
            System.out.println("Valor de distinto double: " + valor);
            this.valor = valor;
        } else if (No1.valor instanceof Double && No2.valor instanceof Integer) {
            System.out.println("Entro a verificar distinto double int: " + No1.valor + " != " + No2.valor);
            boolean valor = ((double) No1.valor) != ((double) (int) No2.valor);
            System.out.println("Valor de distinto double int: " + valor);
            this.valor = valor;
        } else if (No1.valor instanceof Double && No2.valor instanceof Character) {
            System.out.println("Entro a verificar distinto double char: " + No1.valor + " != " + No2.valor);
            boolean valor = ((double) No1.valor) != ((double) (char) No2.valor);
            System.out.println("Valor de distinto double char: " + valor);
            this.valor = valor;
        } else if (No1.valor instanceof Character && No2.valor instanceof Character) {
            System.out.println("Entro a verificar distinto char: " + No1.valor + " != " + No2.valor);
            boolean valor = ((char) No1.valor) != ((char) No2.valor);
            System.out.println("Valor de distinto char: " + valor);
            this.valor = valor;
        } else if (No1.valor instanceof Character && No2.valor instanceof Integer) {
            System.out.println("Entro a verificar distinto char int: " + No1.valor + " != " + No2.valor);
            boolean valor = ((char) No1.valor) != ((int) No2.valor);
            System.out.println("Valor de distinto char int: " + valor);
            this.valor = valor;
        } else if (No1.valor instanceof Character && No2.valor instanceof Double) {
            System.out.println("Entro a verificar distinto char double: " + No1.valor + " != " + No2.valor);
            boolean valor = ((char) No1.valor) != ((double) No2.valor);
            System.out.println("Valor de distinto char double: " + valor);
            this.valor = valor;
        } else if (No1.valor instanceof Character && No2.valor instanceof String) {
            System.out.println("Entro a verificar distinto char String: " + No1.valor + " != " + No2.valor);
            boolean valor = !Objects.equals(String.valueOf(No1.valor), No2.valor);
            System.out.println("Valor de distinto char String: " + valor);
            this.valor = valor;
        } else if (No1.valor instanceof String && No2.valor instanceof Character) {
            System.out.println("Entro a verificar distinto String char: " + No1.valor + " != " + No2.valor);
            boolean valor = !Objects.equals(No1.valor, String.valueOf(No2.valor));
            System.out.println("Valor de distinto String char: " + valor);
            this.valor = valor;
        } else if (No1.valor instanceof String && No2.valor instanceof String) {
            System.out.println("Entro a verificar distinto String: " + No1.valor + " != " + No2.valor);
            boolean valor = !Objects.equals((String) No1.valor, (String) No2.valor);
            System.out.println("Valor de distinto String: " + valor);
            this.valor = valor;
        } else if (No1.valor instanceof Boolean && No2.valor instanceof Boolean) {
            System.out.println("Entro a verificar distinto boolean: " + No1.valor + " != " + No2.valor);
            boolean valor = ((boolean) No1.valor) != ((boolean) No2.valor);
            System.out.println("Valor de distinto boolean: " + valor);
            this.valor = valor;
        } else {
            System.out.println("Tipos no manejados en el distinto: " + No1.valor.getClass() + " y " + No2.valor.getClass());
            textAreaGG2.setText("Tipos no manejados en el distinto: " + No1.valor.getClass() + " y " + No2.valor.getClass());
            Erroor error = new Erroor("Semantico", "Tipos no manejados en el distinto: ", No1.valor.getClass() + " y " + No2.valor.getClass(), 0, 0);
            ErrorList.add(error);
        }

    }

    @Override
    public Instruccion Interpretarr() {
        Instruccion Nod1 = Nodo1.Interpretarr();
        Instruccion Nod2 = Nodo2.Interpretarr();
        verificarDiferente(Nod1, Nod2);
        return this;
    }
}
