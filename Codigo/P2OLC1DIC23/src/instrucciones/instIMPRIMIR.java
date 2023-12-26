/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrucciones;
import Abstract.Ast;


/**
 *
 * @author edujr
 */
import Abstract.TablaSimb;
import Abstract.Instruccion;
import static GUI.GUI.textAreaGG2;
/**
 *
 * @author edujr
 */
public class instIMPRIMIR extends Instruccion{
    
    Instruccion Nodo1;

    public instIMPRIMIR(Instruccion Nodo1) {
        this.Nodo1 = Nodo1;
    }
    
    
    private void imprimirr(Instruccion N1){
        String contenido = "";
        System.out.println(N1.valor);
        if (N1.valor instanceof Integer){
            contenido = String.valueOf(N1.valor);
            textAreaGG2.setText(textAreaGG2.getText()+"\n"+String.valueOf(contenido));
            
        }else{
            System.out.println("Errorgg");
            textAreaGG2.setText(textAreaGG2.getText()+"\n"+"errorgg");
        }
    
    }
    @Override
    public Instruccion Interpretarr() {
        Instruccion N1 =  Nodo1.Interpretarr();
        imprimirr(N1);
        System.out.println("xdd");
        return this;
    }
           
}
