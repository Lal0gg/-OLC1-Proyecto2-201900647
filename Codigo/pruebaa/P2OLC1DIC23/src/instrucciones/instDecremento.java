package instrucciones;

import Abstract.Instruccion;
import clases.Simbolito;
import clases.TablaSimbolos;

public class instDecremento extends Instruccion {

    private String identificador;
    private TablaSimbolos tablaSimbolos;

    public instDecremento(String identificador, TablaSimbolos tablaSimbolos) {
        this.identificador = identificador;
        this.tablaSimbolos = tablaSimbolos;
    }

    @Override
    public Instruccion Interpretarr() {
        try {
            // Verificar si el identificador existe en la tabla de símbolos
            if (tablaSimbolos.ExisteSimbolo(identificador)) {
                Simbolito simbolo = tablaSimbolos.ObtenerSimbolo(identificador);

                if (simbolo.getTipo().equals("ENTERO") || simbolo.getTipo().equals("DOUBLE")) {
                    // Verificar que la variable sea numérica antes de decrementar
                    Object valorActual = simbolo.getValor();
                    if (valorActual instanceof Integer) {
                        int valorEntero = (int) valorActual;
                        valorEntero--;
                        simbolo.setValor(valorEntero);
                        tablaSimbolos.ActualizarSimbolo(identificador, simbolo);
                    } else if (valorActual instanceof Double) {
                        double valorDecimal = (double) valorActual;
                        valorDecimal--;
                        simbolo.setValor(valorDecimal);
                        tablaSimbolos.ActualizarSimbolo(identificador, simbolo);
                    } else {
                        // Manejar error: No se puede decrementar una variable no numérica
                        System.out.println("Error: No se puede decrementar una variable no numérica.");
                    }
                } else {
                    // Manejar error: No se puede decrementar una variable que no es numérica
                    System.out.println("Error: No se puede decrementar una variable que no es numérica.");
                }
            } else {
                // Manejar error: La variable no existe en la tabla de símbolos
                System.out.println("Error: La variable '" + identificador + "' no existe en la tabla de símbolos.");
            }
        } catch (Exception e) {
            System.out.println("Error al procesar la instrucción DECREMENTO");
            e.printStackTrace();
        }
        return this;
    }
}
