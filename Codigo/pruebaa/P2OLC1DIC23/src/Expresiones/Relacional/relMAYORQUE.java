package Expresiones.Relacional;

import Abstract.Instruccion;
import clases.Erroor;
import clases.TablaSimbolos;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class relMAYORQUE extends Instruccion {

    Instruccion Nodo1;
    Instruccion Nodo2;

    public relMAYORQUE(Instruccion Nodo1, Instruccion Nodo2) {
        this.Nodo1 = Nodo1;
        this.Nodo2 = Nodo2;
    }

    private void verificarMayorQ(Instruccion No1, Instruccion No2) {
        System.out.println("Entro a verificar mayor int: " + No1.valor + " > " + No2.valor);

        try {
            if (No1.valor instanceof Integer && No2.valor instanceof Integer) {
                System.out.println("Entro a verificar mayor int: " + No1.valor + " > " + No2.valor);
                boolean valor = ((int) No1.valor) > ((int) No2.valor);
                System.out.println("Valor de mayor int: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Integer && No2.valor instanceof Double) {
                System.out.println("Entro a verificar mayor int double: " + No1.valor + " > " + No2.valor);
                boolean valor = ((double) (int) No1.valor) > ((double) No2.valor);
                System.out.println("Valor de mayor int double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Integer && No2.valor instanceof Character) {
                System.out.println("Entro a verificar mayor int double: " + No1.valor + " > " + No2.valor);
                boolean valor = ( (int) No1.valor) > ((char) No2.valor);
                System.out.println("Valor de mayor int double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Double && No2.valor instanceof Double) {
                System.out.println("Entro a verificar mayor double: " + No1.valor + " > " + No2.valor);
                boolean valor = ((double) No1.valor) > ((double) No2.valor);
                System.out.println("Valor de mayor double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Double && No2.valor instanceof Integer) {
                System.out.println("Entro a verificar mayor double: " + No1.valor + " > " + No2.valor);
                boolean valor = ((double) No1.valor) > ((int) No2.valor);
                System.out.println("Valor de mayor double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Double && No2.valor instanceof Character) {
                System.out.println("Entro a verificar mayor double: " + No1.valor + " > " + No2.valor);
                boolean valor = ((double) No1.valor) > ((char) No2.valor);
                System.out.println("Valor de mayor double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Character && No2.valor instanceof Character) {
                System.out.println("Entro a verificar mayor char: " + No1.valor + " > " + No2.valor);
                boolean valor = ((char) No1.valor) > ((char) No2.valor);
                System.out.println("Valor de mayor char: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Character && No2.valor instanceof Integer) {
                System.out.println("Entro a verificar mayor char int: " + No1.valor + " > " + No2.valor);
                boolean valor = ((char) No1.valor) > ((int) No2.valor);
                System.out.println("Valor de mayor char int: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Character && No2.valor instanceof Double) {
                System.out.println("Entro a verificar mayor char double: " + No1.valor + " > " + No2.valor);
                boolean valor = ((char) No1.valor) > ((double) No2.valor);
                System.out.println("Valor de mayor char double: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Character && No2.valor instanceof String) {
                // Puedes implementar según tus necesidades

            } else if (No1.valor instanceof String && No2.valor instanceof Character) {
                // Puedes implementar según tus necesidades

            } else if (No1.valor instanceof String && No2.valor instanceof String) {
                System.out.println("Entro a verificar mayor String: " + No1.valor + " > " + No2.valor);
                boolean valor = ((String) No1.valor).compareTo((String) No2.valor) > 0;
                System.out.println("Valor de mayor String: " + valor);
                this.valor = valor;
            } else if (No1.valor instanceof Boolean && No2.valor instanceof Boolean) {
                // Puedes implementar según tus necesidades

            } else {
                System.out.println("Tipos no manejados en la mayor: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                textAreaGG2.setText("Tipos no manejados en la mayor: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                Erroor error = new Erroor("Semantico", "Tipos no manejados en la mayor: ", No1.valor.getClass() + " y " + No2.valor.getClass(), 0, 0);
                ErrorList.add(error);
            }
        } catch (Exception e) {
            System.out.println("Error al verificar mayor");
        }
    }

    @Override
    public Instruccion Interpretarr( ){
        Instruccion Nod1 = Nodo1.Interpretarr();
        Instruccion Nod2 = Nodo2.Interpretarr();
        verificarMayorQ(Nod1, Nod2);
        return this;
    }
}
