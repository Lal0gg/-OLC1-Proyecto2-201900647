/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author edujr
 */
public class Ast {
    
    public Nodo root;
    
    public Ast(Nodo root){
        this.root = root;
    }
    
    public void GrficarAst(){
        String grafo = "digraph ast{\n\n" + GenerarNodos(this.root, "0") + "\n\n}";  
        GeneranDot(grafo);
        
    }
    
    
    public String GenerarNodos(Nodo nodito, String equis){
        int uwu =0;
        String  contenido = "";
        
        if (nodito== null){
            return "";
        }
        
        String Nodox = nodito.token;
        Nodox = Nodox.replace("\"", "");
        contenido = "node"+equis+"[label = \"" + Nodox + "\"];\n";
        
        for (int xd= 0; xd<=nodito.hijoss.size()-1;++xd){
            contenido = contenido + "node" + equis + " -> node" + equis + uwu + "\n";
            contenido= contenido + GenerarNodos(nodito.hijoss.get(xd), ""+equis+uwu);
            uwu++;
        
        }
        
        if( !(nodito.lexema.equals("")) ){
            String nodoT= nodito.lexema; 
            
            nodoT = nodoT.replace("\"", "");
            contenido += "node" + equis + "c[label = \"" + nodoT + "\"];\n";
            contenido += "node" + equis + " -> node" + equis + "c\n";
        }
        
        return contenido;
        
    }
    
    public void GeneranDot(String  contenido){
         FileWriter fichero = null;
        PrintWriter escritor = null;
        try{
            fichero = new FileWriter("ast.dot");
            escritor = new PrintWriter(fichero);
            escritor.println(contenido);
            escritor.close();
            fichero.close();
            GenerandoReporte();
            
        } catch (Exception e) {
            System.out.println("error en generar dot");
            e.printStackTrace();
        }
    }
    
   
    public void GenerandoReporte() throws IOException{
    String fileInputPath = "ast.dot";
    String fileOutputPath = "ast.pdf";
    String dotPath = "dot";  // Ruta al ejecutable dot de Graphviz

    try {
        ProcessBuilder processBuilder = new ProcessBuilder(dotPath, "-Tpdf", "-o", fileOutputPath, fileInputPath);
        processBuilder.redirectErrorStream(true);
        Process process = processBuilder.start();

        // Esperar a que finalice el proceso
        int exitCode;
        try {
            exitCode = process.waitFor();
        } catch (InterruptedException e) {
            throw new IOException("Error al esperar a que finalice el proceso", e);
        }

        if (exitCode != 0) {
            // Hubo un error en la generación del PDF
            throw new IOException("Error al generar el PDF. Código de salida: " + exitCode);
        }

        System.out.println("Reporte PDF generado con exito.");

    } catch (IOException e) {
        throw new IOException("Error en la generación del informe PDF", e);
    }
    
    }
    
    
}
