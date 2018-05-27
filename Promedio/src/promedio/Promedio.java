/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static int puntosCalidad (int prom)
    {
        int puntos=0;
        if (prom <= 100)
        {
            puntos=4;
            if (prom<=89)
            {
                puntos=3;
                if (prom<=79)
                {
                    puntos=2;
                    if (prom<=69)
                    {
                        puntos=1;
                        if (prom<=60)
                        {
                            puntos=0;
                        }
                    }
                }
            }
            
        }
        
        return puntos;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int prom;
        
        Scanner leer = new Scanner (System.in);
        System.out.println ("Digite el promedio del estudiante:");
        prom = leer.nextInt() ;
        System.out.printf ("El puntaje de calidad del estudiante es: %d", Promedio.puntosCalidad(prom));
        
        
    }
}
