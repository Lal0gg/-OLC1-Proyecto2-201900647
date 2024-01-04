package instrucciones;


import java.util.ArrayList;

//diseño singleton
// realiza una unica instancia de la clase en toodo el tiempo de ejecucion
public class Auxiliar {


    private static Auxiliar unicainstancia = null;
    public ArrayList<String> auxxx = new ArrayList<String>();
    public static Auxiliar getInstancia(){
        if(unicainstancia == null)  unicainstancia = new Auxiliar();
        return unicainstancia;
    }

    private Auxiliar(){
    }
    public void agregar(String a){
        auxxx.add(a);
    }

    public boolean MandarEstadoBreak(){
        if(getStatus()){
            auxxx.set(auxxx.size()-1, SentenciaTransfer.CORTAR);
            return true;
        }
        return false;
    }

    public boolean ObtenerEstadoBreak(){
        if(getStatus()) return auxxx.get(auxxx.size()-1).equals(SentenciaTransfer.CORTAR);
        return false;
    }

    public boolean MandarEstadoContinue(){
        if(getStatus()){
            auxxx.set(auxxx.size()-1, SentenciaTransfer.CONTINUAR);
            return true;
        }
        return false;
    }

    public boolean ObtenerEstadoContinue(){
        if(getStatus()) return auxxx.get(auxxx.size()-1).equals(SentenciaTransfer.CONTINUAR);
        return false;
    }

    public boolean getStatus(){
        return auxxx.size() > 0;
    }
    public void eliminar(){
        auxxx.remove(auxxx.size()-1);
    }

    public boolean setEstado(String estado){
        if(getStatus()){
            auxxx.set(auxxx.size()-1, estado);
            return true;
        }
        return false;
    }


    public static void  reInicializar() {
        unicainstancia = new Auxiliar();
    }
}
