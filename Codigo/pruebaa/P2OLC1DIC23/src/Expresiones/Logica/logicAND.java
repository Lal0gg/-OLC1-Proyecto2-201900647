package Expresiones.Logica;

import Abstract.Instruccion;
import clases.Erroor;
import clases.TablaSimbolos;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class logicAND extends Instruccion {

    Instruccion Nodo1;
    Instruccion Nodo2;

    public logicAND(Instruccion Nodo1, Instruccion Nodo2) {
        this.Nodo1 = Nodo1;
        this.Nodo2 = Nodo2;
    }

    private void verificarAND(Instruccion No1, Instruccion No2) {
        System.out.println("Antes de verificar AND: " + No1.valor + " && " + No2.valor);
        try {
            if (No1.valor instanceof Boolean && No2.valor instanceof Boolean) {
                System.out.println("Entro a verificar AND: " + No1.valor + " && " + No2.valor);
                boolean valor = ((boolean) No1.valor) &&  ((boolean) No2.valor);
                System.out.println("Valor de OR: " + valor);
                this.valor = valor;
            } else {
                System.out.println("Tipos no manejados en la AND: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                textAreaGG2.setText("Tipos no manejados en la AND: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                Erroor error =  new Erroor("Semantico", "Tipos no manejados en el AND : " ,No1.valor.getClass() + " y " + No2.valor.getClass(),0, 0);
                ErrorList.add(error);
            }
        } catch (Exception e) {
            System.out.println("Error en AND: " + e);
        }
    }





    @Override
    public Instruccion Interpretarr( ) {
        Instruccion nod1 = Nodo1.Interpretarr();
        Instruccion nod2 = Nodo2.Interpretarr();
        verificarAND(nod1, nod2);
        return this;
    }
}
