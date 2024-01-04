package instrucciones;

import Abstract.Instruccion;

import java.util.ArrayList;

public class BloqueSent extends Instruccion {
    private ArrayList<Instruccion> instrucciones;

    public BloqueSent(ArrayList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }

    @Override
    public Instruccion Interpretarr() {
        try {
            for (Instruccion instruccion : instrucciones) {
                instruccion.Interpretarr();
            }
        } catch (Exception e) {
            // Manejar excepciones, por ejemplo, imprimir un mensaje de error.
            System.err.println("Error en la interpretación del bloque de instrucciones: " + e.getMessage());
        }
        return this;  // O ajusta el valor de retorno según tus necesidades.
    }
}
