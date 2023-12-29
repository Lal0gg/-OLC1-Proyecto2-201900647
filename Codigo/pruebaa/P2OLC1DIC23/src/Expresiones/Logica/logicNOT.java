package Expresiones.Logica;

import Abstract.Instruccion;
import clases.Erroor;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class logicNOT extends Instruccion {

    Instruccion Nodo1;

    public logicNOT(Instruccion Nodo1) {
        this.Nodo1 = Nodo1;
    }

    private void operarNOT(Instruccion No1) {
        System.out.println("Antes de entrar a verificar NOT: " + No1.valor);
        try {
            if (No1.valor instanceof Boolean) {
                System.out.println("Entro a verificar NOT: " + No1.valor);
                boolean valor = !((boolean) No1.valor);
                System.out.println("Valor de NOT: " + valor);
                this.valor = valor;
            } else {
                System.out.println("Tipos no manejados en el not: " + No1.valor.getClass());
                textAreaGG2.setText("Tipos no manejados en el not: " + No1.valor.getClass() );
                Erroor error =  new Erroor("Semantico", "Tipos no manejados en el not : " ,No1.valor.getClass().toString() ,0, 0);
                ErrorList.add(error);

            }
        } catch (Exception e) {
            System.out.println("Error en NOT: " + e);
        }
    }



    @Override
    public Instruccion Interpretarr() {
        Instruccion nod1 = Nodo1.Interpretarr();
        operarNOT(nod1);
        return this;
    }
}
