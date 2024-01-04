package instrucciones;

import Abstract.Instruccion;
import clases.Simbolito;
import clases.TablaSimbolos;

public class instIncremento extends Instruccion {
    private String identificador;
    private TablaSimbolos tablaSimbolos;

    public instIncremento(String identificador, TablaSimbolos tablaSimbolos) {
        this.identificador = identificador;
        this.tablaSimbolos = tablaSimbolos;
    }

    @Override
    public Instruccion Interpretarr() {
        if (tablaSimbolos.ExisteSimbolo(identificador)) {
            Simbolito simbolo = tablaSimbolos.ObtenerSimbolo(identificador);

            if (simbolo.getTipo().equals("ENTERO") || simbolo.getTipo().equals("DECIMAL")) {
                // Verificar que la variable sea numérica antes de incrementar
                System.out.println("Valor actual: " + simbolo.getValor());
                Object valorActual = simbolo.getValor();
                if (valorActual instanceof Integer) {
                    int valorEntero = (int) valorActual;
                    valorEntero++;
                    simbolo.setValor(valorEntero);
                    tablaSimbolos.ActualizarSimbolo(identificador, simbolo);
                } else if (valorActual instanceof Double) {
                    double valorDecimal = (double) valorActual;
                    valorDecimal++;
                    simbolo.setValor(valorDecimal);
                    tablaSimbolos.ActualizarSimbolo(identificador, simbolo);
                } else {
                    // Manejar error: No se puede incrementar una variable no numérica
                    System.out.println("Error: No se puede incrementar una variable no numérica.");
                }
            } else {
                // Manejar error: No se puede incrementar una variable que no es numérica
                System.out.println("Error: No se puede incrementar una variable que no es numérica.");
            }
        } else {
            // Manejar error: La variable no existe en la tabla de símbolos
            System.out.println("Error: La variable '" + identificador + "' no existe en la tabla de símbolos.");
        }
        return this;
    }

}
