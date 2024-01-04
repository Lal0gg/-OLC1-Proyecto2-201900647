package Reportes;

import clases.Simbolito;
import clases.TablaSimbolos;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class ReporteTablaSimbolos {
    StringBuilder contentHtml = new StringBuilder();

    public void ReporteTS(TablaSimbolos tablaSimbolos){
        HeaderHTML();
        BodyHTML(tablaSimbolos);
        CrearHTML();
        AbrirHTML();
    }


    public void HeaderHTML() {
        contentHtml.append("<!DOCTYPE html>\n"
                + "<html lang=\"es\">\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "<title>Reporte Tokens</title>\n"
                + "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto+Mono&display=swap \">\n"
                + "<style>\n"
                + "header {   \n"
                + "   background-color: #333;\n "
                + "  color: #fff;\n "
                + "padding: 20px; \n"
                + "  text-align: center; \n"
                + " border-radius: 10px;\n"
                + "}\n"
                + "h1 {\n"
                + "   font-size: 36px; \n"
                + "   font-family: 'Roboto Mono', monospace; \n"
                + "}\n"
                + "p {\n"
                + "   font-size: 18px; \n"
                + "   font-family: 'Roboto Mono', monospace;\n"
                + "}\n"
                + "body { \n"
                + "   font-family: 'Arial', sans-serif; \n"
                + "    background-color: #f0f0f0; \n"
                + "    margin: 0; \n"
                + "   padding: 0; \n"
                + "    display: flex;\n"
                + "   flex-direction: column;\n"
                + "  align-items: center;\n"
                + "  justify-content: center;\n"
                + "   min-height: 100vh; \n"
                + "}\n"
                + " main { \n"
                + "  background-color: #ffc0cb; \n"
                + " padding: 20px;\n"
                + " border-radius: 10px;\n"
                + " margin-top: 20px;\n"
                + " }\n"
                + "table {\n"
                + "   width: 100%;\n"
                + "  border-collapse: collapse; \n"
                + " margin-top: 20px;\n"
                + "}\n"
                + " th, td {\n"
                + "  padding: 10px;\n"
                + "  text-align: center;\n"
                + "  border: 1px solid #ddd;\n"
                + "}\n"
                + " th {\n"
                + "   background-color: #80cfc5; \n"
                + "   color: #fff; \n"
                + " }\n"
                + " tr:nth-child(even) { \n"
                + "   background-color: #f2f2f2; \n"
                + "}\n"
                + "</style> \n"
                + "</head> \n"
                + "<body>\n"
                + "<header>\n"
                + "<h1>Reporte TablaSimbolos</h1>\n"
                + "<p>Proyecto 1 de Organizacion de Lenguajes y Compiladores</p>\n"
                + "</header>\n"
        );

    }

    public void BodyHTML( TablaSimbolos tablaSimbolos){
        contentHtml.append("<main>\n");
        contentHtml.append("<table>\n");
        contentHtml.append("<tr>\n");
        contentHtml.append("<th>ID</th>\n");
        contentHtml.append("<th>Tipo</th>\n");
        contentHtml.append("<th>Valor</th>\n");
        contentHtml.append("</tr>\n");

        TablaSimbolos entorno = tablaSimbolos;

        while (entorno != null) {
            HashMap<String, Simbolito> actual = entorno.getActual();

            for (String id : actual.keySet()) {
                Simbolito simbolo = actual.get(id);
                contentHtml.append("<tr>\n");
                contentHtml.append("<td>").append(id).append("</td>\n");
                contentHtml.append("<td>").append(simbolo.getTipo()).append("</td>\n");
                contentHtml.append("<td>").append(simbolo.getValor()).append("</td>\n");
                contentHtml.append("</tr>\n");
            }

            entorno = entorno.getAnterior();
        }

        contentHtml.append("</table>\n");
        contentHtml.append("</main>\n");


    }

    public void CrearHTML() {
        File reporte1 = new File("ReporteTablaSimbolo.html");
        try {
            FileWriter escribir = new FileWriter(reporte1);
            escribir.write(contentHtml.toString());
            escribir.close();
            JOptionPane.showMessageDialog(null, "Reporte generado con éxito :D");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void AbrirHTML() {
        try {
            File file = new File("ReporteTablaSimbolo.html");
            if (!Desktop.isDesktopSupported()) {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) {
                desktop.open(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
