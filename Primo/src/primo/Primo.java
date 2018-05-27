/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primo;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Primo {
    static int primo;
    /**
     * @param args the command line arguments
     */
    public static void numPrimo (int numero)
    {
        primo=1;
        for (int i=2;i<numero;i++)
        {
            if (numero%i==0)
                primo=0;
        }
        if (numero==1){primo=0;}
        if (primo==1)
            System.out.printf("\n %d Si es primo",numero);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int numero,cantidad;
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Escriba un numero para saber si es primo:");
        numero=leer.nextInt();
        
        Primo.numPrimo (numero);
        
        if (primo==0)
        {System.out.printf("\n %d No es primo:",numero);}
        
        System.out.println ("\n Digite el hasta el cual se van a evaluar los numeros primos:");
        cantidad=leer.nextInt();  
        
        for (int m=1; m<=cantidad;m++)
            {numero=m;
            Primo.numPrimo(numero);
            }
        
        
    }
}
