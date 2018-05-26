/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perfecto;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Perfecto {

    /**
     * @param args the command line arguments
     */
    static int perfecto=1;
    
    public static void esPerfecto (int numero)    
    {
        int suma=0; 
        int multiplos[]= new int[numero];
        int i;
        int h=0;
        
        for ( i=1;i<numero;i++)
        { if (numero%i==0)
        { multiplos[h]= i;
                h++;}
        }
        
        for ( i=0;i<numero;i++)
        { suma=suma+multiplos[i];           
        }
        
            
            if (suma==numero)
            {   System.out.printf ("\nel numero %d es perfecto.",numero);
                System.out.print ("\n Sus multiplos son: ");
                for ( i=0;i<h;i++)
                { System.out.print (multiplos[i]);
                  System.out.print (",");}
            }
         
            else
                perfecto=0;
            
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int cantidad;
        Scanner leer = new Scanner (System.in);
        
        System.out.println ("Digite el numero:");
        numero=leer.nextInt();  
        
        Perfecto.esPerfecto (numero);
        if(perfecto==0)
            {System.out.printf ("el numero %d no es perfecto.",numero);
            System.out.print ("\n");}
        
        System.out.println ("\n Digite el hasta el cual se van a evaluar los numeros perfectos.");
        cantidad=leer.nextInt();  
        
        for (int m=1; m<cantidad;m++)
            {numero=m;
            Perfecto.esPerfecto (numero);
            
            }
    }
}
