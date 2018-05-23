/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package invertir;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Invertir {

    /**
     * @param args the command line arguments
     */
    public static void inversor(int numero)
    {
        
        String x;
        x = Integer.toString(numero);
        int c= x.length();

        System.out.print("\nLa cadena invertida es: ");
        for ( int i=c-1;i>= 0; i--)
        System.out.print(x.charAt(i));
        }

    
        public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner leer= new Scanner(System.in);
        System.out.println("Digite el numero a invertir");
        numero = leer.nextInt();
        Invertir.inversor (numero);
        
    }
}
