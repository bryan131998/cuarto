package pkg5.practicatda.arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PracticaTDAArrayList {

    
    public static void main(String[] args) {
        //P1 hacer un objeto o instancia de arralyts
        ArrayList <String> cadenas;
        cadenas = new ArrayList<String>();
        
        //P2 definir 2 variables mas
        String frase, respuesta;
        
        //P3 llenar el arraylist dinamicamente
        
        do {
            //primero vamos a capturar la frae 
            frase = JOptionPane.showInputDialog(null,"ingrese la frase");
            
            //segundo agrega la frase al arrays list (cadenas)
            cadenas.add(frase);
            
            //tercero, preguntar si decea agreggar mas frases 
            respuesta = JOptionPane.showInputDialog(null,"¿desea ingresar otra frase (si/no)?");
            respuesta = respuesta.toUpperCase();
        }while(respuesta.equals("SI"));
        
        //P4 mostrar el contenido del arrayas list(cadenas)
        //utilizaremos el metedo size y el metodo get de los arrayaslist
        System.out.println("las frase originas son:");
        int i;
        for (i=0; i<cadenas.size(); i++){
            System.out.println("<"+cadenas.get(i)+">");
             }
             //P5 utilizar el metodo set de arrayslist (cadenas)
             System.out.println("las frases modificada son:");
             cadenas.set(1, "elemento modificado");
             for(i=0; i<cadenas.size(); i++){
                System.out.println("<"+cadenas.get(i)+">");
                }
             //P6 utilizar el metodo remove del arrayslist (cadenas)
             System.out.println("\n las frases que nos quedan son:");
             cadenas.remove(0);
             for (i=0; i<cadenas.size(); i++){
                 System.out.println("<"+cadenas.get(i)+">");
             }
          }
    
}
