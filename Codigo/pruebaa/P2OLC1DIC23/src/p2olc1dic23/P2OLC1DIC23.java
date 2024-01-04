/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p2olc1dic23;

import Abstract.Ast;
import Abstract.Nodo;
import GUI.GUI;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import static func.Funcion.TokenList;
import java.io.StringReader;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author edujr
 */
public class P2OLC1DIC23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //\\JercharJ =\'[a-zA-ZñÑ0-9]\'
        try {
             UIManager.setLookAndFeel(new McWinLookAndFeel());
         } catch (UnsupportedLookAndFeelException e) {
             System.err.println("No se pudo aplicar el Look and Feel deseado: " + e.getMessage());
             e.printStackTrace();
         }
         

        GUI nuevaGUI = new GUI();
        nuevaGUI.setVisible(true);

        analizadorJavaN("src/analizadores/", "Lexer.jflex", "Parser.cup");


        /*Nodo raiz = new Nodo("raiz", "d", 0, 0);
        Nodo hijo1 = new Nodo("hijo1", "d", 0, 0);
        Nodo hijo2 = new Nodo("hijo2", "ff", 0, 0);
        Nodo hijo3 = new Nodo("hijo3", "ff", 0, 0);
        Nodo hijo4 = new Nodo("hijo4", "ffff", 0, 0);
        Nodo hijo5 = new Nodo("hijo5", "f", 0, 0);
        raiz.AgregarHijo(hijo1);
        raiz.AgregarHijo(hijo2);
        raiz.AgregarHijo(hijo3);
        raiz.AgregarHijo(hijo4);
        raiz.AgregarHijo(hijo5);


        Ast ast = new Ast(raiz);
        ast.GrficarAst();*/


    }

   public static void analizadorJavaN(String ruta, String jflexFile, String cupFile) {

        try {

            String opcionesJflex[] = {ruta + jflexFile, "-d", ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] = {"-destdir", ruta, "-parser", "Parser", ruta + cupFile};
            java_cup.Main.main(opcionesCup);

        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }

    }

    

   public static void analizarJAVAN(String entrada) {
        try {
            TokenList.clear();
            analizadores.Lexer lexer = new analizadores.Lexer(new StringReader(entrada));
            analizadores.Parser parser = new analizadores.Parser(lexer);
            parser.parse();
            System.out.println("Se analizó correctamente el archivo .javañ :D");
            JOptionPane.showMessageDialog(null, "Analisis javañ generado con éxito :D");

        } 
        catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        }
    }
    
}
