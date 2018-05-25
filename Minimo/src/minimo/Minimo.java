/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minimo;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Minimo {
 static float min;
    /**
     * @param args the command line arguments
     */
    public static float calculo (float a1,float a2,float a3){
       
        min= Math.min(a1, a2);
        
        if (min==a1){
        min= Math.min(a1, a3);}
      
        else{
        min= Math.min(a2, a3);}
        return min;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        float a1,a2,a3;
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println ("Digite el primer numero:");
        a1=leer.nextFloat();        
        System.out.println ("Digite el segundo numero:");
        a2=leer.nextFloat();
        System.out.println ("Digite el tercer numero:");
        a3=leer.nextFloat();

        Minimo.calculo (a1,a2,a3);
        
        System.out.printf ("El numero menor es: %f",min);
         
    }
}
