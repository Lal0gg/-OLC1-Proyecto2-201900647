package instrucciones;

import Abstract.Instruccion;
import clases.Erroor;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class CORTAR extends Instruccion {


    @Override
    public Instruccion Interpretarr() {
       if (!Auxiliar.getInstancia().MandarEstadoBreak())
           System.out.println("Error: No se puede usar CORTAR fuera de un ciclo");
            textAreaGG2.setText(textAreaGG2.getText() + "\n" + "Error: No se puede usar CORTAR fuera de un ciclo");
            Erroor error = new Erroor("Semantico", "Error: No se puede usar ", "CORTAR fuera de un ciclo", 0,0);
            ErrorList.add(error);
       return this;
    }
}
