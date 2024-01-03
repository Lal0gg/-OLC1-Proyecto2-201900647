package Expresiones.Aritmeticas;

import Abstract.Instruccion;
import clases.Erroor;
import clases.TablaSimbolos;
import clases.TipoOperacion;

import static GUI.GUI.textAreaGG2;
import static func.Funcion.ErrorList;

public class OperacionesAritmeticas extends Instruccion {

    Instruccion Nodo1;
    Instruccion Nodo2;

    TipoOperacion tipoOperacion;

    public OperacionesAritmeticas(Instruccion Nodo1, Instruccion Nodo2, TipoOperacion tipoOperacion) {
        this.Nodo1 = Nodo1;
        this.Nodo2 = Nodo2;
        this.tipoOperacion = tipoOperacion;
    }


    private void Operacion(Instruccion Nodoo1, Instruccion Nodoo2) {
        try {
            if (tipoOperacion == TipoOperacion.SUMA) {
                try {
                    if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Integer) {
                        int suma = (int) Nodoo1.valor + (int) Nodoo2.valor;
                        System.out.println("Resultado de la suma: " + suma);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(suma));
                        this.valor = suma;
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Double) {
                        double suma = (int) Nodoo1.valor + (double) Nodoo2.valor;
                        System.out.println("Resultado de la suma: " + suma);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(suma));
                        this.valor = suma;
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Boolean) {
                        int n1 = (int) Nodoo1.valor;
                        Boolean n2 = (Boolean) Nodoo2.valor;

                        if (n2 == true) {
                            int sumita;
                            sumita = n1 + 1;
                            System.out.println("Resultado de la suma: " + sumita);
                            //   textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumita));
                            this.valor = sumita;


                        } else {
                            int sum;
                            sum = n1;
                            System.out.println("Resultado de la suma: " + sum);
                            //     textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sum));
                            this.valor = sum;
                        }
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Character) {
                        int n1 = (int) Nodoo1.valor;
                        Character n2 = (Character) Nodoo2.valor;
                        System.out.println("char: " + n2);
                        int sumitaChar = n1 + (int) n2;
                        System.out.println("Resultado de la suma: " + sumitaChar);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaChar));
                        this.valor = sumitaChar;
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof String) {
                        int n1 = (int) Nodoo1.valor;
                        String n2 = (String) Nodoo2.valor;
                        String sumitaChar = n1 + n2;
                        System.out.println("Resultado de la suma: " + sumitaChar);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaChar));
                        this.valor = sumitaChar.replace("\"", "");
                        ;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Double) {
                        double sumadouble = (Double) Nodoo1.valor + (double) Nodoo2.valor;
                        System.out.println("Resultado de la suma: " + sumadouble);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumadouble));
                        this.valor = sumadouble;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Integer) {
                        double sumad = (Double) Nodoo1.valor + (int) Nodoo2.valor;
                        System.out.println("Resultado de la suma: " + sumad);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumad));
                        this.valor = sumad;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Boolean) {
                        Double n1 = (Double) Nodoo1.valor;
                        Boolean n2 = (Boolean) Nodoo2.valor;

                        if (n2 == true) {
                            Double sumitad;
                            sumitad = n1 + 1.0;
                            System.out.println("Resultado de la suma: " + sumitad);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitad));
                            this.valor = sumitad;

                        } else {
                            Double sum;
                            sum = n1 + 0;
                            System.out.println("Resultado de la suma: " + sum);
                            //  textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sum));
                            this.valor = sum;
                        }
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Character) {
                        Double n1 = (Double) Nodoo1.valor;
                        Character n2 = (Character) Nodoo2.valor;
                        Double sumitaChar = n1 + (double) n2;
                        System.out.println("Resultado de la suma: " + sumitaChar);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaChar));
                        this.valor = sumitaChar;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof String) {
                        Double n1 = (Double) Nodoo1.valor;
                        String n2 = (String) Nodoo2.valor;
                        String sumitaChar = n1 + (String) n2;
                        System.out.println("Resultado de la suma: " + sumitaChar);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaChar));
                        this.valor = sumitaChar.replace("\"", "");
                        ;
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Integer) {
                        Boolean n1 = (Boolean) Nodoo1.valor;
                        int n2 = (int) Nodoo2.valor;
                        if (n1 == true) {
                            int sumitad;
                            sumitad = n2 + 1;
                            System.out.println("Resultado de la suma: " + sumitad);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitad));
                            this.valor = sumitad;
                        } else {
                            int sumitax;
                            sumitax = n2;
                            System.out.println("Resultado de la suma: " + sumitax);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitax));
                            this.valor = sumitax;
                        }
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Double) {
                        Boolean n1 = (Boolean) Nodoo1.valor;
                        double n2 = (double) Nodoo2.valor;
                        if (n1 == true) {
                            double sumitadd;
                            sumitadd = n2 + 1.0;
                            System.out.println("Resultado de la suma: " + sumitadd);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitadd));
                            this.valor = sumitadd;
                        } else {
                            double sumitaxd;
                            sumitaxd = n2;
                            System.out.println("Resultado de la suma: " + sumitaxd);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaxd));
                            this.valor = sumitaxd;
                        }
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la suma entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la suma entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                        Erroor errorsito = new Erroor("Semantico", "No se puede realizar la suma entre", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(errorsito);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la suma entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la suma entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                        Erroor errorsito = new Erroor("Semantico", "No se puede realizar la suma entre", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(errorsito);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof String) {
                        Boolean n1 = (Boolean) Nodoo1.valor;
                        String n2 = (String) Nodoo2.valor;
                        if (n1 == true) {
                            String sumitad;
                            sumitad = "true" + n2;
                            System.out.println("Resultado de la suma: " + sumitad);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitad));
                            this.valor = sumitad.replace("\"", "");
                            ;
                        } else {
                            String sumitax;
                            sumitax = "false" + n2;
                            System.out.println("Resultado de la suma: " + sumitax);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitax));
                            this.valor = sumitax;
                        }

                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Integer) {
                        Character n1 = (Character) Nodoo1.valor;
                        System.out.println("N1: " + Nodoo1.valor);
                        int n2 = (int) Nodoo2.valor;
                        System.out.println("N2: " + n2);
                        int nuevo1 = (int) n1;
                        int sumitax = nuevo1 + n2;
                        System.out.println("Resultado de la suma: " + sumitax);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitax));
                        this.valor = sumitax;
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Double) {
                        Character n1 = (Character) Nodoo1.valor;
                        Double n2 = (Double) Nodoo2.valor;
                        double nuevo1 = (double) n1;
                        double sumitadd = nuevo1 + n2;
                        System.out.println("Resultado de la suma: " + sumitadd);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitadd));
                        this.valor = sumitadd;

                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la suma entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la suma entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}");
                        Erroor errorsito = new Erroor("Semantico", "No se puede realizar la suma entre", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(errorsito);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Character) {
                        Character n1 = (Character) Nodoo1.valor;
                        Character n2 = (Character) Nodoo2.valor;
                        String sumitax = String.valueOf(n1) + String.valueOf(n2);
                        System.out.println("Resultado de la suma: " + sumitax);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitax));
                        this.valor = sumitax;
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof String) {
                        Character n1 = (Character) Nodoo1.valor;
                        String n2 = (String) Nodoo2.valor;
                        String sumitaxd = n1 + n2;
                        System.out.println("Resultado de la suma: " + sumitaxd);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaxd));
                        this.valor = sumitaxd.replace("\"", "");
                        ;
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Integer) {
                        String n1 = (String) Nodoo1.valor;
                        int n2 = (int) Nodoo2.valor;
                        String sumitax = n1 + n2;
                        System.out.println("Resultado de la suma: " + sumitax);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitax));
                        this.valor = sumitax.replace("\"", "");
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Double) {
                        String n1 = (String) Nodoo1.valor;
                        Double n2 = (Double) Nodoo2.valor;
                        String sumitaxd = n1 + n2;
                        System.out.println("Resultado de la suma: " + sumitaxd);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaxd));
                        this.valor = sumitaxd.replace("\"", "");
                        ;
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Boolean) {
                        String n1 = (String) Nodoo1.valor;
                        Boolean n2 = (Boolean) Nodoo2.valor;
                        if (n2 == true) {
                            String sumitad;
                            sumitad = n1 + "true";
                            System.out.println("Resultado de la suma: " + sumitad);
                            // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitad));
                            this.valor = sumitad.replace("\"", "");
                            ;
                        } else {
                            String sumitax;
                            sumitax = n1 + "false";
                            System.out.println("Resultado de la suma: " + sumitax);
                            //  textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitax));
                            this.valor = sumitax.replace("\"", "");
                            ;
                        }

                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Character) {
                        String n1 = (String) Nodoo1.valor;
                        Character n2 = (Character) Nodoo2.valor;
                        String sumitaxd = n1 + n2;
                        System.out.println("Resultado de la suma: " + sumitaxd);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaxd));
                        this.valor = sumitaxd.replace("\"", "");
                        ;
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof String) {
                        String n1 = (String) Nodoo1.valor;
                        String n2 = (String) Nodoo2.valor;
                        String sumitaxd = n1 + n2;
                        System.out.println("Resultado de la suma: " + sumitaxd);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(sumitaxd));
                        this.valor = sumitaxd.replace("\"", "");
                        ;
                    } else {
                        System.out.println("N1 " + Nodoo1.valor);
                        System.out.println("N2 " + Nodoo2.valor);
                        System.out.println("¡Error! Tipo de dato   incorrecto");
                        textAreaGG2.setText("¡Error! Tipo de dato   incorrecto");
                        Erroor error = new Erroor("Semantico", "¡Error! ", " Tipo de dato   incorrecto", 0, 0);
                        ErrorList.add(error);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    textAreaGG2.setText("No se realizó la suma ¡ERROR!");

                }
            } else if (tipoOperacion == TipoOperacion.RESTA) {
                try {
                    if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Integer) {
                        int resta = (int) Nodoo1.valor - (int) Nodoo2.valor;
                        System.out.println("Resultado de la Resta: " + resta);
                        //textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(resta));
                        this.valor = resta;

                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Double) {
                        double resta = (int) Nodoo1.valor - (double) Nodoo2.valor;
                        System.out.println("Resultado de la resta: " + resta);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(resta));
                        this.valor = resta;
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Boolean) {
                        int n1 = (int) Nodoo1.valor;
                        Boolean n2 = (Boolean) Nodoo2.valor;

                        if (n2 == true) {
                            int restita;
                            restita = n1 - 1;
                            System.out.println("Resultado de la resta: " + restita);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restita));
                            this.valor = restita;


                        } else {
                            int rest;
                            rest = n1;
                            System.out.println("Resultado de la resta: " + rest);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(rest));
                            this.valor = rest;
                        }
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Character) {
                        int n1 = (int) Nodoo1.valor;
                        Character n2 = (Character) Nodoo2.valor;
                        System.out.println("char: " + n2);
                        int restita = n1 - (int) n2;
                        System.out.println("Resultado de la resta: " + restita);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restita));
                        this.valor = restita;
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}", 0, 0);
                        ErrorList.add(error);

                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Double) {
                        double resta = (Double) Nodoo1.valor - (double) Nodoo2.valor;
                        System.out.println("Resultado de la resta: " + resta);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(resta));
                        this.valor = resta;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Integer) {
                        double restax = (Double) Nodoo1.valor - (int) Nodoo2.valor;
                        System.out.println("Resultado de la resta: " + restax);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restax));
                        this.valor = restax;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Boolean) {
                        Double n1 = (Double) Nodoo1.valor;
                        Boolean n2 = (Boolean) Nodoo2.valor;

                        if (n2 == true) {
                            Double restagg;
                            restagg = n1 - 1.0;
                            System.out.println("Resultado de la resta: " + restagg);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restagg));
                            this.valor = restagg;
                        } else {
                            Double resc;
                            resc = n1 - 0;
                            System.out.println("Resultado de la resta: " + resc);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(resc));
                            this.valor = resc;
                        }
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Character) {
                        Double n1 = (Double) Nodoo1.valor;
                        Character n2 = (Character) Nodoo2.valor;
                        Double restitachar = n1 - (double) n2;
                        System.out.println("Resultado de la resta: " + restitachar);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restitachar));
                        this.valor = restitachar;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Integer) {
                        Boolean n1 = (Boolean) Nodoo1.valor;
                        int n2 = (int) Nodoo2.valor;
                        if (n1 == true) {
                            int restita;
                            restita = 1 - n2;
                            System.out.println("Resultado de la resta: " + restita);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restita));
                            this.valor = restita;
                        } else {
                            int restx;
                            restx = 0 - n2;
                            System.out.println("Resultado de la resta: " + restx);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restx));
                            this.valor = restx;
                        }
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la suma entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la suma entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Integer) {
                        Character n1 = (Character) Nodoo1.valor;
                        System.out.println("N1: " + Nodoo1.valor);
                        int n2 = (int) Nodoo2.valor;
                        System.out.println("N2: " + n2);
                        int nuevo1 = (int) n1;
                        int restx = nuevo1 - n2;
                        System.out.println("Resultado de la resta: " + restx);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restx));
                        this.valor = restx;
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Double) {
                        Character n1 = (Character) Nodoo1.valor;
                        Double n2 = (Double) Nodoo2.valor;
                        double nuevo1 = (double) n1;
                        double restxx = nuevo1 - n2;
                        System.out.println("Resultado de la resta: " + restxx);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(restxx));
                        this.valor = restxx;
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {string}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Integer) {
                        System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Double) {
                        System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la resta entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la resta entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}", 0, 0);
                        ErrorList.add(error);
                    } else {
                        System.out.println("¡Error! Tipo de dato   incorrecto");
                        textAreaGG2.setText("¡Error! Tipo de dato   incorrecto");
                        Erroor error = new Erroor("Semantico", "¡Error! ", " Tipo de dato   incorrecto", 0, 0);
                        ErrorList.add(error);

                    }
                } catch (Exception e) {
                    System.out.println(e);
                    textAreaGG2.setText("No se realizó la resta ¡ERROR!");

                }
            } else if (tipoOperacion == TipoOperacion.MULTIPLICACION) {
                try {
                    if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Integer) {
                        int multi = (int) Nodoo1.valor * (int) Nodoo2.valor;
                        System.out.println("Resultado de la Multiplicacion: " + multi);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multi));
                        this.valor = multi;

                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Double) {
                        double multip = (int) Nodoo1.valor * (double) Nodoo2.valor;
                        System.out.println("Resultado de la multi: " + multip);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multip));
                        this.valor = multip;

                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la multi entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la multi entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la multi entre: ", Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Character) {
                        int n1 = (int) Nodoo1.valor;
                        Character n2 = (Character) Nodoo2.valor;
                        System.out.println("char: " + n2);
                        int multip = n1 * (int) n2;
                        System.out.println("Resultado de la multi: " + multip);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multip));
                        this.valor = multip;
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la multi entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la multi entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la multi entre: ", Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Integer) {
                        double mult = (Double) Nodoo1.valor * (int) Nodoo2.valor;
                        System.out.println("Resultado de la mult: " + mult);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(mult));
                        this.valor = mult;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Double) {
                        double mul = (Double) Nodoo1.valor * (double) Nodoo2.valor;
                        System.out.println("Resultado de la mul: " + mul);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(mul));
                        this.valor = mul;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la mul entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mul entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mul entre: ", Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Character) {
                        Double n1 = (Double) Nodoo1.valor;
                        Character n2 = (Character) Nodoo2.valor;
                        Double multchar = n1 * (double) n2;
                        System.out.println("Resultado de la mult: " + multchar);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multchar));
                        this.valor = multchar;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Integer) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Double) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}", 0, 0);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Integer) {
                        Character n1 = (Character) Nodoo1.valor;
                        System.out.println("N1: " + Nodoo1.valor);
                        int n2 = (int) Nodoo2.valor;
                        System.out.println("N2: " + n2);
                        int nuevo1 = (int) n1;
                        int multx = nuevo1 * n2;
                        System.out.println("Resultado de la mult: " + multx);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multx));
                        this.valor = multx;
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Double) {
                        Character n1 = (Character) Nodoo1.valor;
                        System.out.println("N1: " + Nodoo1.valor);
                        Double n2 = (Double) Nodoo2.valor;
                        System.out.println("N2: " + n2);
                        Double nuevo1 = (double) n1;
                        Double multx = nuevo1 * n2;
                        System.out.println("Resultado de la mult: " + multx);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multx));
                        this.valor = multx;
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {string}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Integer) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Double) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}", 0, 0);
                        ErrorList.add(error);
                    } else {
                        System.out.println("¡Error! Tipo de dato   incorrecto");
                        textAreaGG2.setText("¡Error! Tipo de dato   incorrecto");
                        Erroor error = new Erroor("Semantico", "¡Error!  ", "Tipo de dato   incorrecto", 0, 0);
                        ErrorList.add(error);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    textAreaGG2.setText("No se realizó la multiplicacion ¡ERROR!");

                }

            } else if (tipoOperacion == TipoOperacion.DIVISION) {
                try {
                    if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Integer) {

                        if ((int) Nodoo2.valor == 0) {
                            System.out.println("No se puede dividr en 0, porque es indefinido D:");
                            textAreaGG2.setText("No se puede dividr en 0, porque es indefinido D:");
                        } else {
                            double div = (double) (int) Nodoo1.valor / (double) (int) Nodoo2.valor;
                            System.out.println("Resultado de la division: " + div);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(div));
                            this.valor = div;
                        }
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Double) {

                        if ((double) Nodoo2.valor == 0) {
                            System.out.println("No se puede dividr en 0, porque es indefinido D:");
                            textAreaGG2.setText("No se puede dividr en 0, porque es indefinido D:");
                            Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: 0, ", "porque es indefinido D:", 0, 0);
                            ErrorList.add(error);
                        } else {
                            double div = (double) (int) Nodoo1.valor / (double) Nodoo2.valor;
                            System.out.println("Resultado de la division: " + div);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(div));
                            this.valor = div;

                        }
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Character) {
                        double n1 = (int) Nodoo1.valor;
                        Character n2 = (Character) Nodoo2.valor;
                        System.out.println("char: " + n2);
                        double divp = n1 / (double) n2;
                        System.out.println("Resultado de la div: " + divp);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(divp));
                        this.valor = divp;
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {int} y " + Nodoo2.valor + " {string}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Integer) {
                        if ((int) Nodoo2.valor == 0) {
                            System.out.println("No se puede dividr en 0, porque es indefinido D:");
                            textAreaGG2.setText("No se puede dividr en 0, porque es indefinido D:");
                            Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: 0, ", "porque es indefinido D:", 0, 0);
                            ErrorList.add(error);
                        } else {
                            double div = (Double) Nodoo1.valor / (int) Nodoo2.valor;
                            System.out.println("Resultado de la div: " + div);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(div));
                            this.valor = div;
                        }

                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Double) {

                        if ((double) Nodoo2.valor == 0) {
                            System.out.println("No se puede dividr en 0, porque es indefinido D:");
                            textAreaGG2.setText("No se puede dividr en 0, porque es indefinido D:");
                            Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: 0, ", "porque es indefinido D:", 0, 0);
                            ErrorList.add(error);
                        } else {
                            double divv = (double) Nodoo1.valor / (double) Nodoo2.valor;
                            System.out.println("Resultado de la divv: " + divv);
                            //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(divv));
                            this.valor = divv;

                        }
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Character) {
                        Double n1 = (Double) Nodoo1.valor;
                        Character n2 = (Character) Nodoo2.valor;
                        Double divchar = n1 / (double) n2;
                        System.out.println("Resultado de la div: " + divchar);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(divchar));
                        this.valor = divchar;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {double} y " + Nodoo2.valor + " {string}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Integer) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Double) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {string}", 0, 0);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Integer) {
                        Character n1 = (Character) Nodoo1.valor;
                        System.out.println("N1: " + Nodoo1.valor);
                        int n2 = (int) Nodoo2.valor;
                        System.out.println("N2: " + n2);
                        int nuevo1 = (int) n1;
                        Double multx = (double) (nuevo1 / n2);
                        System.out.println("Resultado de la mult: " + multx);
                        // textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(multx));
                        this.valor = multx;
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Double) {
                        Character n1 = (Character) Nodoo1.valor;
                        System.out.println("N1: " + Nodoo1.valor);
                        Double n2 = (Double) Nodoo2.valor;
                        System.out.println("N2: " + n2);
                        Double nuevo1 = (double) n1;
                        Double divx = nuevo1 / n2;
                        System.out.println("Resultado de la div: " + divx);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(divx));
                        this.valor = divx;
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Integer) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {int}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Double) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {double}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la div entre: " + Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la div entre: ", Nodoo1.valor + " {string} y " + Nodoo2.valor + " {string}", 0, 0);
                        ErrorList.add(error);
                    } else {
                        System.out.println("¡Error! Tipo de dato   incorrecto");
                        textAreaGG2.setText("¡Error! Tipo de dato   incorrecto");
                        Erroor error = new Erroor("Semantico", "¡Error!  ", "Tipo de dato   incorrecto", 0, 0);
                        ErrorList.add(error);

                    }
                } catch (Exception e) {
                    System.out.println(e);
                    textAreaGG2.setText("No se realizó la suma ¡ERROR!");
                }

            } else if (tipoOperacion == TipoOperacion.POTENCIA) {
                try {
                    if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Integer) {
                        int resultado = (int) Math.pow((int) Nodoo1.valor, (int) Nodoo2.valor);
                        System.out.println("Resultado de la Potenciación: " + resultado);
                        //textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(resultado));
                        this.valor = resultado;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Double) {
                        double resultado = Math.pow((double) Nodoo1.valor, (double) Nodoo2.valor);
                        System.out.println("Resultado de la Potenciación: " + resultado);
                        //textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(resultado));
                        this.valor = resultado;
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Double) {
                        double resultado = Math.pow((int) Nodoo1.valor, (double) Nodoo2.valor);
                        System.out.println("Resultado de la Potenciación: " + resultado);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(resultado));
                        this.valor = resultado;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Integer) {
                        double resultado = Math.pow((double) Nodoo1.valor, (int) Nodoo2.valor);
                        System.out.println("Resultado de la Potenciación: " + resultado);
                        //textAreaGG2.setText(textAreaGG2.getText() + "\n" + String.valueOf(resultado));
                        this.valor = resultado;
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la Potenciación entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la mult entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la mult entre: ", Nodoo1.valor + " {int} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {String}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {String}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {int} y " + Nodoo2.valor + " {String}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {int} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {int} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {double} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {String}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {String}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {double} y " + Nodoo2.valor + " {String}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {double} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {double} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Integer) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {int}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Double) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {double}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {String}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {String}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {String}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);

                    } else if (Nodoo1.valor instanceof Boolean && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {bool} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Integer) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {String} y " + Nodoo2.valor + " {int}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {String} y " + Nodoo2.valor + " {int}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {String} y " + Nodoo2.valor + " {int}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Double) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {String} y " + Nodoo2.valor + " {double}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {String} y " + Nodoo2.valor + " {double}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {String} y " + Nodoo2.valor + " {double}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {String} y " + Nodoo2.valor + " {String}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {String} y " + Nodoo2.valor + " {String}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {String} y " + Nodoo2.valor + " {String}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {String} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {String} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {String} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof String && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {String} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {String} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {String} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Integer) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {int}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {int}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {int}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Double) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {double}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {double}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {double}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Boolean) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {bool}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof Character) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {char}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {char}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {char}", 0, 0);
                        ErrorList.add(error);
                    } else if (Nodoo1.valor instanceof Character && Nodoo2.valor instanceof String) {
                        System.out.println("No se puede realizar la pot entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {String}");
                        textAreaGG2.setText(textAreaGG2.getText() + "\n" + "No se puede realizar la pot entre: " + Nodoo1.valor + " {char} y " + Nodoo2.valor + " {String}");
                        Erroor error = new Erroor("Semantico", "No se puede realizar la pot entre: ", Nodoo1.valor + " {char} y " + Nodoo2.valor + " {String}", 0, 0);
                        ErrorList.add(error);
                    } else {
                        System.out.println("¡Error! Tipo de dato incorrecto para potenciación");
                        textAreaGG2.setText("¡Error! Tipo de dato incorrecto para potenciación");
                        Erroor error = new Erroor("Semantico", "¡Error! ", "Tipo de dato incorrecto para potenciación", 0, 0);
                        ErrorList.add(error);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    textAreaGG2.setText("No se realizó la potenciación ¡ERROR!");
                }

            } else if (tipoOperacion == TipoOperacion.MODULO) {
                try {
                    if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Integer) {
                        double modulo = (int) Nodoo1.valor % (int) Nodoo2.valor;
                        System.out.println("Resultado del modulo : " + modulo);
                        // textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(modulo));
                        this.valor = modulo;
                    } else if (Nodoo1.valor instanceof Integer && Nodoo2.valor instanceof Double) {
                        double modulo = (int) Nodoo1.valor % (double) Nodoo2.valor;
                        System.out.println("Resultado del modulo : " + modulo);
                        //textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(modulo));
                        this.valor = modulo;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Double) {
                        double modulo = (double) Nodoo1.valor % (double) Nodoo2.valor;
                        System.out.println("Resultado del modulo : " + modulo);
                        // textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(modulo));
                        this.valor = modulo;
                    } else if (Nodoo1.valor instanceof Double && Nodoo2.valor instanceof Integer) {
                        double modulo = (double) Nodoo1.valor % (int) Nodoo2.valor;
                        System.out.println("Resultado del modulo : " + modulo);
                        //textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(modulo));
                        this.valor = modulo;
                    } else {
                        System.out.println("¡Error Semantico! Tipo de dato   incorrecto, no se puede realizar la operacion");
                        textAreaGG2.setText("¡Error Semantico! Tipo de dato   incorrecto, no se puede realizar la operacion");
                        Erroor error = new Erroor("Semantico", "¡Error Semantico! Tipo de dato   incorrecto", "no se puede realizar la operacion", 0, 0);
                        ErrorList.add(error);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    textAreaGG2.setText("No se realizó la suma ¡ERROR!");

                }
            } else {
                System.out.println("N1 " + Nodoo1.valor);
                System.out.println("N2 " + Nodoo2.valor);
                System.out.println("¡Error! Tipo de dato   incorrecto");
                textAreaGG2.setText("¡Error! Tipo de dato   incorrecto");
                Erroor error = new Erroor("Semantico", "¡Error! ", " Tipo de dato   incorrecto", 0, 0);
                ErrorList.add(error);

            }
        } catch (Exception e) {
            System.out.println("Error en la operacion" + e.getMessage());
        }
    }

    @Override
    public Instruccion Interpretarr( ) {
        Instruccion Nodoo1 = Nodo1.Interpretarr();
        Instruccion Nodoo2 = Nodo2.Interpretarr();
        Operacion(Nodoo1, Nodoo2);
        return this;
    }
}
