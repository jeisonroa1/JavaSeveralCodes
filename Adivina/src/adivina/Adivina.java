/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Adivina {

    /**
     * @param args the command line arguments
     */
    public void juego ()
    {
        int numero=0;
        int opcion=0;
        int ciclo=1;
        
        Random generar = new Random ();
        Scanner leer = new Scanner (System.in);
        
        numero= generar.nextInt(1001);

        System.out.println ("Adivine el numero entre 0 y 1000");
       
        
        while (ciclo==1)
        {
            System.out.println ("\n Digite un numero:");
            opcion= leer.nextInt();
            
        if (numero==opcion)
        {
            System.out.println ("Felicidades, Adivino el numero!");
            ciclo=0;
        }
        if (opcion<numero)
        {
            System.out.println ("Muy bajo");
            
        }
        if (opcion>numero)
        {
            System.out.println ("Muy alto");
            
        }
            
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int j=0;
        Scanner leer1 = new Scanner (System.in);
        System.out.println ("Bienvenido a adivine el numero");
        Adivina jugar = new Adivina ();
        do
        {
          jugar.juego ();
          System.out.println ("Si desea volver jugar pulse 1 de lo contrario 0:");
          j= leer1.nextInt();
        }while (j==1);
        
        System.out.println ("FIN");
        
        
    }
}
