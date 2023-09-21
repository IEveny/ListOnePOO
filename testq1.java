/*
 * Q-1 Faça uma função que recebe por parâmetro o raio de uma esfera e calcula 
o seu volume(v=4/3*pi*r³), onde r é o raio da esfera e pi é uma constante igual 
a 3,14159265.
 */
package lista1Q1;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Eveny Neves
 */
public class Lista1Eu {

    /**
     * @param args the command line arguments
     */
  
     
    public static double volume (double raio, double v)
     {
       v = (4 / 3) * (Math.pow(raio, 3)) * 3.14159265; 
       
      return v;
     }
    
    public static void main(String[] args) 
    {
       
        
        Scanner r = new Scanner (System.in);
        
        System.out.println("Informe o raio: ");
        double raio = r.nextDouble();
        
        System.out.println();
        
        System.out.println("O raio da esfera é " +  volume);
    }
    
}

     
    
