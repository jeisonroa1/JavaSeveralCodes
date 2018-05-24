/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mcm;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Mcm {

    /**
     * @param args the command line arguments
     */
    public static int maximo (int a, int b)
    {
        int mcd=0 ;
        
        
        for (int h= Math.max(a,b);h>0;h--)
        {
            if ((a%h==0)&(b%h==0))
            {
                mcd=h;
                h=0;
            }
        }
        
        return mcd;    
    
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner leer= new Scanner(System.in);
        System.out.println ("Digite el primer numero para hayar el Maximo comun divisor:");
        a= leer.nextInt();
        System.out.println ("Digite el segundo numero:");
        b= leer.nextInt();
        
        System.out.printf ("El MCD de %d y %d es %d",a,b,Mcm.maximo (a,b));
    }
}
