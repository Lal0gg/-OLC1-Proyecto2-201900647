package instrucciones;

import Abstract.Instruccion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sentencias extends Instruccion {
    ArrayList<Instruccion> sentencias = new ArrayList<Instruccion>();

    public Sentencias(){
    }

    public void AgregarSentencia(Instruccion sentencia){
        sentencias.add(sentencia);
    }


    @Override
    public Instruccion Interpretarr() {
        for (Instruccion sentencia : sentencias) {
            sentencia.Interpretarr();
            if(Auxiliar.getInstancia().MandarEstadoBreak() || Auxiliar.getInstancia().MandarEstadoContinue()){
                break;
            }
        }
        return this;
    }
}
