package Expresiones.Relacional;

import Abstract.Instruccion;
import clases.Erroor;
import clases.TablaSimbolos;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;
public class relMENORQUE extends Instruccion {

    Instruccion Nodo1;
    Instruccion Nodo2;

    public relMENORQUE(Instruccion Nodo1, Instruccion Nodo2) {
        this.Nodo1 = Nodo1;
        this.Nodo2 = Nodo2;
    }

    private void verificarMenor(Instruccion No1, Instruccion No2) {
        System.out.println("Entro a verificar menor int: " + No1.valor + " < " + No2.valor);

        try {
            if (No1.valor instanceof Integer && No2.valor instanceof Integer) {
                System.out.println("Entro a verificar menor int: " + No1.valor + " < " + No2.valor);
                boolean valor = ((int) No1.valor) < ((int) No2.valor);
                System.out.println("Valor de menor int: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Integer && No2.valor instanceof Double) {
                System.out.println("Entro a verificar menor int double: " + No1.valor + " < " + No2.valor);
                boolean valor = ((double) (int) No1.valor) < ((double) No2.valor);
                System.out.println("Valor de menor int double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Integer && No2.valor instanceof Character) {
                System.out.println("Entro a verificar menor int double: " + No1.valor + " < " + No2.valor);
                boolean valor = ( (int) No1.valor) < ((char) No2.valor);
                System.out.println("Valor de menor int double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Double && No2.valor instanceof Double) {
                System.out.println("Entro a verificar menor double: " + No1.valor + " < " + No2.valor);
                boolean valor = ((double) No1.valor) < ((double) No2.valor);
                System.out.println("Valor de menor double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Double && No2.valor instanceof Integer) {
                System.out.println("Entro a verificar menor double: " + No1.valor + " < " + No2.valor);
                boolean valor = ((double) No1.valor) < ((int) No2.valor);
                System.out.println("Valor de menor double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Double && No2.valor instanceof Character) {
                System.out.println("Entro a verificar menor double: " + No1.valor + " < " + No2.valor);
                boolean valor = ((double) No1.valor) < ((char) No2.valor);
                System.out.println("Valor de menor double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Character && No2.valor instanceof Character) {
                System.out.println("Entro a verificar menor char: " + No1.valor + " < " + No2.valor);
                boolean valor = ((char) No1.valor) < ((char) No2.valor);
                System.out.println("Valor de menor char: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Character && No2.valor instanceof Integer) {
                System.out.println("Entro a verificar menor char int: " + No1.valor + " < " + No2.valor);
                boolean valor = ((char) No1.valor) < ((int) No2.valor);
                System.out.println("Valor de menor char int: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Character && No2.valor instanceof Double) {
                System.out.println("Entro a verificar menor char double: " + No1.valor + " < " + No2.valor);
                boolean valor = ((char) No1.valor) < ((double) No2.valor);
                System.out.println("Valor de menor char double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Character && No2.valor instanceof String) {
                // Puedes implementar según tus necesidades

            } else if (No1.valor instanceof String && No2.valor instanceof Character) {
                // Puedes implementar según tus necesidades

            } else if (No1.valor instanceof String && No2.valor instanceof String) {
                System.out.println("Entro a verificar menor String: " + No1.valor + " < " + No2.valor);
                boolean valor = ((String) No1.valor).compareTo((String) No2.valor) < 0;
                System.out.println("Valor de menor String: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Boolean && No2.valor instanceof Boolean) {
                // Puedes implementar según tus necesidades

            } else {
                System.out.println("Tipos no manejados en la menor: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                textAreaGG2.setText("Tipos no manejados en la menor: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                Erroor error = new Erroor("Semantico", "Tipos no manejados en la menor: ", No1.valor.getClass() + " y " + No2.valor.getClass(), 0, 0);
                ErrorList.add(error);
            }
        } catch (Exception e) {
            System.out.println("Error al verificar menor");
        }
    }


    @Override
    public Instruccion Interpretarr( ) {
        Instruccion Nod1 = Nodo1.Interpretarr();
        Instruccion Nod2 = Nodo2.Interpretarr();
        verificarMenor(Nod1, Nod2);
        return this;
    }
}
