package Expresiones.Relacional;

import Abstract.Instruccion;
import clases.Erroor;
import clases.TablaSimbolos;
import clases.TipoOperacion;

import java.util.Objects;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class OperacionRelacional extends Instruccion {

    Instruccion Nodo1;
    Instruccion Nodo2;
    TipoOperacion tipo;

    public OperacionRelacional(Instruccion Nodo1, Instruccion Nodo2, TipoOperacion tipo) {
        this.Nodo1 = Nodo1;
        this.Nodo2 = Nodo2;
        this.tipo = tipo;
    }


    private void OperarRelacional(Instruccion No1, Instruccion No2) {
        try {
            if (tipo == TipoOperacion.IGUALIGUALQ) {
                try {
                    if (No1.valor instanceof Integer && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar igualdad int: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals((int) No1.valor, (int) No2.valor);
                        System.out.println("Valor de la igualdad int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Integer && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar igualdad int double: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals((double) (int) No1.valor, (double) No2.valor);
                        System.out.println("Valor de la igualdad int double: " + valor);
                        this.valor = valor;

                    } else if (No1.valor instanceof Integer && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar igualdad char int: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals((char) (int) No1.valor, (char) No2.valor);
                        System.out.println("Valor de la igualdad int char: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar igualdad double: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals((double) No1.valor, (double) No2.valor);
                        System.out.println("Valor de la igualdad double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar igualdad double int: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals((double) No1.valor, (double) (int) No2.valor);
                        System.out.println("Valor de la igualdad double int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar igualdad double char: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals((double) No1.valor, (double) (char) No2.valor);
                        System.out.println("Valor de la igualdad double char: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar igualdad char: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals((char) No1.valor, (char) No2.valor);
                        System.out.println("Valor de la igualdad char: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar igualdad char int: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals((char) No1.valor, (int) No2.valor);
                        System.out.println("Valor de la igualdad char int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar igualdad char double: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals((char) No1.valor, (double) No2.valor);
                        System.out.println("Valor de la igualdad char double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof String) {
                        System.out.println("Entro a verificar igualdad char String: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals(String.valueOf(No1.valor), No2.valor);
                        System.out.println("Valor de la igualdad char String: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof String && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar igualdad String char: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals(No1.valor, String.valueOf(No2.valor));
                        System.out.println("Valor de la igualdad String char: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof String && No2.valor instanceof String) {
                        System.out.println("Entro a verificar igualdad String: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals((String) No1.valor, (String) No2.valor);
                        System.out.println("Valor de la igualdad String: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Boolean && No2.valor instanceof Boolean) {
                        System.out.println("Entro a verificar igualdad boolean: " + No1.valor + " == " + No2.valor);
                        boolean valor = Objects.equals((boolean) No1.valor, (boolean) No2.valor);
                        System.out.println("Valor de la igualdad boolean: " + valor);
                        this.valor = valor;
                    } else {
                        System.out.println("Tipos no manejados en la igualdad: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                        textAreaGG2.setText("Tipos no manejados en la igualdad: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                        Erroor error = new Erroor("Semantico", "Tipos no manejados en la igualdad: ", No1.valor.getClass() + " y " + No2.valor.getClass(), 0, 0);
                        ErrorList.add(error);
                    }
                } catch (Exception e) {
                    System.out.println("Error al verificar igualdad");
                }
            } else if (tipo == TipoOperacion.MAYORIGUALQ) {
                System.out.println("Entro a verificar mayor o igual int: " + No1.valor + " >= " + No2.valor);

                try {
                    if (No1.valor instanceof Integer && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar mayor o igual int: " + No1.valor + " >= " + No2.valor);
                        boolean valor = ((int) No1.valor) >= ((int) No2.valor);
                        System.out.println("Valor de mayor o igual int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Integer && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar mayor o igual int double: " + No1.valor + " >= " + No2.valor);
                        boolean valor = ((double) (int) No1.valor) >= ((double) No2.valor);
                        System.out.println("Valor de mayor o igual int double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Integer && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar mayor o igual int double: " + No1.valor + " >= " + No2.valor);
                        boolean valor = ((int) No1.valor) >= ((char) No2.valor);
                        System.out.println("Valor de mayor o igual int double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar mayor o igual double: " + No1.valor + " >= " + No2.valor);
                        boolean valor = ((double) No1.valor) >= ((double) No2.valor);
                        System.out.println("Valor de mayor o igual double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar mayor o igual double: " + No1.valor + " >= " + No2.valor);
                        boolean valor = ((double) No1.valor) >= ((int) No2.valor);
                        System.out.println("Valor de mayor o igual double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar mayor o igual double: " + No1.valor + " >= " + No2.valor);
                        boolean valor = ((double) No1.valor) >= ((char) No2.valor);
                        System.out.println("Valor de mayor o igual double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar mayor o igual char: " + No1.valor + " >= " + No2.valor);
                        boolean valor = ((char) No1.valor) >= ((char) No2.valor);
                        System.out.println("Valor de mayor o igual char: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar mayor o igual char int: " + No1.valor + " >= " + No2.valor);
                        boolean valor = ((char) No1.valor) >= ((int) No2.valor);
                        System.out.println("Valor de mayor o igual char int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar mayor o igual char double: " + No1.valor + " >= " + No2.valor);
                        boolean valor = ((char) No1.valor) >= ((double) No2.valor);
                        System.out.println("Valor de mayor o igual char double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof String) {
                        // Puedes implementar según tus necesidades

                    } else if (No1.valor instanceof String && No2.valor instanceof Character) {
                        // Puedes implementar según tus necesidades

                    } else if (No1.valor instanceof String && No2.valor instanceof String) {
                        System.out.println("Entro a verificar mayor o igual String: " + No1.valor + " >= " + No2.valor);
                        boolean valor = ((String) No1.valor).compareTo((String) No2.valor) >= 0;
                        System.out.println("Valor de mayor o igual String: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Boolean && No2.valor instanceof Boolean) {
                        // Puedes implementar según tus necesidades

                    } else {
                        System.out.println("Tipos no manejados en la mayor o igual: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                        textAreaGG2.setText("Tipos no manejados en la mayor o igual: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                        Erroor error = new Erroor("Semantico", "Tipos no manejados en la mayor o igual: ", No1.valor.getClass() + " y " + No2.valor.getClass(), 0, 0);
                        ErrorList.add(error);
                    }
                } catch (Exception e) {
                    System.out.println("Error al verificar mayor o igual");
                }

            } else if (tipo == TipoOperacion.MAYORQ) {
                System.out.println("Entro a verificar mayor int: " + No1.valor + " > " + No2.valor);

                try {
                    if (No1.valor instanceof Integer && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar mayor int: " + No1.valor + " > " + No2.valor);
                        boolean valor = ((int) No1.valor) > ((int) No2.valor);
                        System.out.println("Valor de mayor int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Integer && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar mayor int double: " + No1.valor + " > " + No2.valor);
                        boolean valor = ((double) (int) No1.valor) > ((double) No2.valor);
                        System.out.println("Valor de mayor int double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Integer && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar mayor int double: " + No1.valor + " > " + No2.valor);
                        boolean valor = ((int) No1.valor) > ((char) No2.valor);
                        System.out.println("Valor de mayor int double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar mayor double: " + No1.valor + " > " + No2.valor);
                        boolean valor = ((double) No1.valor) > ((double) No2.valor);
                        System.out.println("Valor de mayor double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar mayor double: " + No1.valor + " > " + No2.valor);
                        boolean valor = ((double) No1.valor) > ((int) No2.valor);
                        System.out.println("Valor de mayor double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar mayor double: " + No1.valor + " > " + No2.valor);
                        boolean valor = ((double) No1.valor) > ((char) No2.valor);
                        System.out.println("Valor de mayor double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar mayor char: " + No1.valor + " > " + No2.valor);
                        boolean valor = ((char) No1.valor) > ((char) No2.valor);
                        System.out.println("Valor de mayor char: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar mayor char int: " + No1.valor + " > " + No2.valor);
                        boolean valor = ((char) No1.valor) > ((int) No2.valor);
                        System.out.println("Valor de mayor char int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar mayor char double: " + No1.valor + " > " + No2.valor);
                        boolean valor = ((char) No1.valor) > ((double) No2.valor);
                        System.out.println("Valor de mayor char double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof String) {
                        // Puedes implementar según tus necesidades

                    } else if (No1.valor instanceof String && No2.valor instanceof Character) {
                        // Puedes implementar según tus necesidades

                    } else if (No1.valor instanceof String && No2.valor instanceof String) {
                        System.out.println("Entro a verificar mayor String: " + No1.valor + " > " + No2.valor);
                        boolean valor = ((String) No1.valor).compareTo((String) No2.valor) > 0;
                        System.out.println("Valor de mayor String: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Boolean && No2.valor instanceof Boolean) {
                        // Puedes implementar según tus necesidades

                    } else {
                        System.out.println("Tipos no manejados en la mayor: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                        textAreaGG2.setText("Tipos no manejados en la mayor: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                        Erroor error = new Erroor("Semantico", "Tipos no manejados en la mayor: ", No1.valor.getClass() + " y " + No2.valor.getClass(), 0, 0);
                        ErrorList.add(error);
                    }
                } catch (Exception e) {
                    System.out.println("Error al verificar mayor");
                }
            } else if (tipo == TipoOperacion.MENORIGUALQ) {
                System.out.println("Entro a verificar menor o igual int: " + No1.valor + " <= " + No2.valor);

                try {
                    if (No1.valor instanceof Integer && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar menor o igual int: " + No1.valor + " <= " + No2.valor);
                        boolean valor = ((int) No1.valor) <= ((int) No2.valor);
                        System.out.println("Valor de menor o igual int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Integer && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar menor o igual int double: " + No1.valor + " <= " + No2.valor);
                        boolean valor = ((double) (int) No1.valor) <= ((double) No2.valor);
                        System.out.println("Valor de menor o igual int double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Integer && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar menor o igual int double: " + No1.valor + " <= " + No2.valor);
                        boolean valor = ((int) No1.valor) <= ((char) No2.valor);
                        System.out.println("Valor de menor o igual int double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar menor o igual double: " + No1.valor + " <= " + No2.valor);
                        boolean valor = ((double) No1.valor) <= ((double) No2.valor);
                        System.out.println("Valor de menor o igual double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar menor o igual double: " + No1.valor + " <= " + No2.valor);
                        boolean valor = ((double) No1.valor) <= ((int) No2.valor);
                        System.out.println("Valor de menor o igual double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar menor o igual double: " + No1.valor + " <= " + No2.valor);
                        boolean valor = ((double) No1.valor) <= ((char) No2.valor);
                        System.out.println("Valor de menor o igual double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar menor o igual char: " + No1.valor + " <= " + No2.valor);
                        boolean valor = ((char) No1.valor) <= ((char) No2.valor);
                        System.out.println("Valor de menor o igual char: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar menor o igual char int: " + No1.valor + " <= " + No2.valor);
                        boolean valor = ((char) No1.valor) <= ((int) No2.valor);
                        System.out.println("Valor de menor o igual char int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar menor o igual char double: " + No1.valor + " <= " + No2.valor);
                        boolean valor = ((char) No1.valor) <= ((double) No2.valor);
                        System.out.println("Valor de menor o igual char double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof String) {
                        // Puedes implementar según tus necesidades

                    } else if (No1.valor instanceof String && No2.valor instanceof Character) {
                        // Puedes implementar según tus necesidades

                    } else if (No1.valor instanceof String && No2.valor instanceof String) {
                        System.out.println("Entro a verificar menor o igual String: " + No1.valor + " <= " + No2.valor);
                        boolean valor = ((String) No1.valor).compareTo((String) No2.valor) <= 0;
                        System.out.println("Valor de menor o igual String: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Boolean && No2.valor instanceof Boolean) {
                        // Puedes implementar según tus necesidades

                    } else {
                        System.out.println("Tipos no manejados en la menor o igual: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                        textAreaGG2.setText("Tipos no manejados en la menor o igual: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                        Erroor error = new Erroor("Semantico", "Tipos no manejados en la menor o igual: ", No1.valor.getClass() + " y " + No2.valor.getClass(), 0, 0);
                        ErrorList.add(error);
                    }
                } catch (Exception e) {
                    System.out.println("Error al verificar menor o igual");
                }

            } else if (tipo == TipoOperacion.MENORQ) {
                System.out.println("Entro a verificar menor int: " + No1.valor + " < " + No2.valor);

                try {
                    if (No1.valor instanceof Integer && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar menor int: " + No1.valor + " < " + No2.valor);
                        boolean valor = ((int) No1.valor) < ((int) No2.valor);
                        System.out.println("Valor de menor int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Integer && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar menor int double: " + No1.valor + " < " + No2.valor);
                        boolean valor = ((double) (int) No1.valor) < ((double) No2.valor);
                        System.out.println("Valor de menor int double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Integer && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar menor int double: " + No1.valor + " < " + No2.valor);
                        boolean valor = ((int) No1.valor) < ((char) No2.valor);
                        System.out.println("Valor de menor int double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar menor double: " + No1.valor + " < " + No2.valor);
                        boolean valor = ((double) No1.valor) < ((double) No2.valor);
                        System.out.println("Valor de menor double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar menor double: " + No1.valor + " < " + No2.valor);
                        boolean valor = ((double) No1.valor) < ((int) No2.valor);
                        System.out.println("Valor de menor double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar menor double: " + No1.valor + " < " + No2.valor);
                        boolean valor = ((double) No1.valor) < ((char) No2.valor);
                        System.out.println("Valor de menor double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar menor char: " + No1.valor + " < " + No2.valor);
                        boolean valor = ((char) No1.valor) < ((char) No2.valor);
                        System.out.println("Valor de menor char: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar menor char int: " + No1.valor + " < " + No2.valor);
                        boolean valor = ((char) No1.valor) < ((int) No2.valor);
                        System.out.println("Valor de menor char int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar menor char double: " + No1.valor + " < " + No2.valor);
                        boolean valor = ((char) No1.valor) < ((double) No2.valor);
                        System.out.println("Valor de menor char double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof String) {
                        // Puedes implementar según tus necesidades

                    } else if (No1.valor instanceof String && No2.valor instanceof Character) {
                        // Puedes implementar según tus necesidades

                    } else if (No1.valor instanceof String && No2.valor instanceof String) {
                        System.out.println("Entro a verificar menor String: " + No1.valor + " < " + No2.valor);
                        boolean valor = ((String) No1.valor).compareTo((String) No2.valor) < 0;
                        System.out.println("Valor de menor String: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Boolean && No2.valor instanceof Boolean) {
                        // Puedes implementar según tus necesidades

                    } else {
                        System.out.println("Tipos no manejados en la menor: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                        textAreaGG2.setText("Tipos no manejados en la menor: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                        Erroor error = new Erroor("Semantico", "Tipos no manejados en la menor: ", No1.valor.getClass() + " y " + No2.valor.getClass(), 0, 0);
                        ErrorList.add(error);
                    }
                } catch (Exception e) {
                    System.out.println("Error al verificar menor");
                }

            } else if (tipo == TipoOperacion.DIFERENTEQUE) {
                try {
                    if (No1.valor instanceof Integer && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar distinto int: " + No1.valor + " != " + No2.valor);
                        boolean valor = ((int) No1.valor) != ((int) No2.valor);
                        System.out.println("Valor de distinto int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Integer && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar distinto int double: " + No1.valor + " != " + No2.valor);
                        boolean valor = ((double) (int) No1.valor) != ((double) No2.valor);
                        System.out.println("Valor de distinto int double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Integer && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar distinto int char: " + No1.valor + " != " + No2.valor);
                        boolean valor = ((int) No1.valor) != ((char) No2.valor);
                        System.out.println("Valor de distinto int char: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar distinto double: " + No1.valor + " != " + No2.valor);
                        boolean valor = ((double) No1.valor) != ((double) No2.valor);
                        System.out.println("Valor de distinto double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar distinto double int: " + No1.valor + " != " + No2.valor);
                        boolean valor = ((double) No1.valor) != ((double) (int) No2.valor);
                        System.out.println("Valor de distinto double int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Double && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar distinto double char: " + No1.valor + " != " + No2.valor);
                        boolean valor = ((double) No1.valor) != ((double) (char) No2.valor);
                        System.out.println("Valor de distinto double char: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar distinto char: " + No1.valor + " != " + No2.valor);
                        boolean valor = ((char) No1.valor) != ((char) No2.valor);
                        System.out.println("Valor de distinto char: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Integer) {
                        System.out.println("Entro a verificar distinto char int: " + No1.valor + " != " + No2.valor);
                        boolean valor = ((char) No1.valor) != ((int) No2.valor);
                        System.out.println("Valor de distinto char int: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof Double) {
                        System.out.println("Entro a verificar distinto char double: " + No1.valor + " != " + No2.valor);
                        boolean valor = ((char) No1.valor) != ((double) No2.valor);
                        System.out.println("Valor de distinto char double: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Character && No2.valor instanceof String) {
                        System.out.println("Entro a verificar distinto char String: " + No1.valor + " != " + No2.valor);
                        boolean valor = !Objects.equals(String.valueOf(No1.valor), No2.valor);
                        System.out.println("Valor de distinto char String: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof String && No2.valor instanceof Character) {
                        System.out.println("Entro a verificar distinto String char: " + No1.valor + " != " + No2.valor);
                        boolean valor = !Objects.equals(No1.valor, String.valueOf(No2.valor));
                        System.out.println("Valor de distinto String char: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof String && No2.valor instanceof String) {
                        System.out.println("Entro a verificar distinto String: " + No1.valor + " != " + No2.valor);
                        boolean valor = !Objects.equals((String) No1.valor, (String) No2.valor);
                        System.out.println("Valor de distinto String: " + valor);
                        this.valor = valor;
                    } else if (No1.valor instanceof Boolean && No2.valor instanceof Boolean) {
                        System.out.println("Entro a verificar distinto boolean: " + No1.valor + " != " + No2.valor);
                        boolean valor = ((boolean) No1.valor) != ((boolean) No2.valor);
                        System.out.println("Valor de distinto boolean: " + valor);
                        this.valor = valor;
                    } else {
                        System.out.println("Tipos no manejados en el distinto: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                        textAreaGG2.setText("Tipos no manejados en el distinto: " + No1.valor.getClass() + " y " + No2.valor.getClass());
                        Erroor error = new Erroor("Semantico", "Tipos no manejados en el distinto: ", No1.valor.getClass() + " y " + No2.valor.getClass(), 0, 0);
                        ErrorList.add(error);
                    }
                } catch (Exception e) {
                    System.out.println("Error al verificar menor");
                }

            } else {

            }
        } catch (Exception e) {
            System.out.println("Error en OperarRelacional: " + e);
        }
    }


    @Override
    public Instruccion Interpretarr( ) {
        Instruccion Nodito1 = Nodo1.Interpretarr();
        Instruccion Nodito2 = Nodo2.Interpretarr();
        OperarRelacional(Nodito1, Nodito2);
        return this;
    }
}
