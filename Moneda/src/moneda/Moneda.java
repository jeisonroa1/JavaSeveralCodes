/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moneda;
import java.util.Scanner; 
import java.util.Random;
 
/**
 *
 * @author Administrador
 */
public class Moneda {

    /**
     * @param args the command line arguments
     */
    public void lanzar ()
    {
        int des=0,ccara=0,csello=0,num=0;
        
        
        Scanner leer = new Scanner (System.in);
        Random numeron = new Random ();
        
        System.out.println("Digite 1 si desea lanzar la moneda:");
        des=leer.nextInt();  
        
        while (des==1)
        {
            num = numeron.nextInt(2);
            
            if ( 0==num )
            {   
                ccara++;
                System.out.println("Cayo cara");
            }    
            else
            {    
                csello++;
                System.out.println("Cayo sello");
            }    
            
            System.out.printf("Cayo cara: %d veces.\n", ccara);
            System.out.printf("Cayo sello: %d veces.\n", csello);
            System.out.println("Digite 1 si desea lanzar la moneda de nuevo o 0 para salir:");
            des=leer.nextInt(); 
        }
            
       
        
      
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("---Lanzamiento de moneda---");
    Moneda objeto = new Moneda ();
    objeto.lanzar();
    System.out.println("FIN");
    
    }
}
