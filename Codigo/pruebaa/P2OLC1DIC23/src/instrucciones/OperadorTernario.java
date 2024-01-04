package instrucciones;

import Abstract.Instruccion;

public class OperadorTernario extends Instruccion {
    Instruccion condicion;
    Instruccion expresionTrue;
    Instruccion expresionFalse;

    public OperadorTernario(Instruccion condicion, Instruccion expresionTrue, Instruccion expresionFalse) {
        this.condicion = condicion;
        this.expresionTrue = expresionTrue;
        this.expresionFalse = expresionFalse;
    }

    @Override
    public Instruccion Interpretarr() {
        try {
            System.out.println("Ejecutando operador ternario");
            condicion.Interpretarr();

            if (condicion.valor instanceof Boolean) {
                System.out.println("Condición: " + condicion.valor);

                valor = (Boolean) condicion.valor ? expresionTrue.Interpretarr().valor : expresionFalse.Interpretarr().valor;

                System.out.println("Valor: " + valor);
            } else {
                System.out.println("Error: La condición del operador ternario no es booleana");
                // Puedes agregar manejo de errores según tu estructura
            }
        } catch (Exception e) {
            System.out.println("Error al procesar el operador ternario");
            e.printStackTrace();
            // Puedes agregar manejo de errores según tu estructura
        }
        return this;
    }
}
