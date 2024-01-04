package instrucciones;

import Abstract.Instruccion;

public class Metodo extends Instruccion {

    private String nombre;
    private Sentencias cuerpo;

    public Metodo(String nombre) {
        this.nombre = nombre;
        this.cuerpo = null;
    }

    public Metodo(String nombre, Sentencias cuerpo) {
        this.nombre = nombre;
        this.cuerpo = cuerpo;
    }

    @Override
    public Instruccion Interpretarr() {
        if (cuerpo != null) {
            cuerpo.Interpretarr();
        } else {
            // Lógica para ejecuciones
            System.out.println("Ejecutando método: " + nombre);
            // Puedes agregar la lógica específica para ejecuciones
        }
        return this;
    }
}
