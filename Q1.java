/*
 * Q-1 Faça uma função que recebe por parâmetro o raio de uma esfera e calcula 
o seu volume(v=4/3*pi*r³), onde r é o raio da esfera e pi é uma constante igual 
a 3,14159265.
 */
package lista1Q1;
import javax.swing.JOptionPane;
import java.lang.Math;
/**
 *
 * @author Eveny Neves
 */
public class Lista1Eu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String raio = JOptionPane.showInputDialog(null, "Informe o raio da esfera:                                                                        ");

        double v = Double.parseDouble(raio);

        double volume = (4 / 3) * (Math.pow(v, 3)) * 3.14159265;

        JOptionPane.showMessageDialog(null, "O volume é: " + volume);
        
    }
    
}
