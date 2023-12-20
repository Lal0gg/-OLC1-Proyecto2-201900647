package P2_OLC1;

import GUI.*;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import java.io.StringReader;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.html.HTMLEditorKit.Parser;
import func.*;
import clases.Erroor;
import clases.Token;
import clases.Simbolito;
import static func.Funcion.TokenList;
import java.util.LinkedList;


import javax.swing.JOptionPane;

/**
 *
 * @author edujr
 */
public class Proyecto2 {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new McWinLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            System.err.println("No se pudo aplicar el Look and Feel deseado: " + e.getMessage());
            e.printStackTrace();
        }
         

        GUI nuevaGUI = new GUI();
        nuevaGUI.setVisible(true);
        
  analizadorJavaN("src/analizadores/", "Lexer.jflex", "Parser.cup");

  

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
