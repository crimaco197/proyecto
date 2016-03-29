/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.de.operaciones.basicas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class ProgramaDeOperacionesBasicas {

    static void ProgramaOperaciones() {
        int menu;
        char volver = 0;
        menu = Integer.parseInt(JOptionPane.showInputDialog("Menu \n 0 = Suma \n 1 = resta \n 2 = Producto \n 3 = División \n 4 = Modulo \n\n Enter option."));
        switch (menu) {
            case 0:
                JOptionPane.showMessageDialog(null, "Va a hacer una suma entre dos numeros");
                double n1,
                 n2;
                double resultado;
                Scanner sc = new Scanner(System.in);
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número (separe decimales con punto):"));
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número (separe decimales con punto): "));
                resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "El resultado de " + n1 + " + " + n2 + " es : " + resultado);
                JOptionPane.showMessageDialog(null, "Gracias por todo");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Va a hacer una diferencia entre dos números");
                double n3,
                 n4;
                Scanner e = new Scanner(System.in);
                n3 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número (separe decimales con punto): "));
                n4 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número (separe decimales con punto): "));
                resultado = n3 - n4;
                JOptionPane.showMessageDialog(null, "El resultado de " + n3 + " - " + n4 + " es : " + resultado);
                JOptionPane.showMessageDialog(null, "Gracias por todo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Va a hacer una multiplicación entre dos números");
                double n5,
                 n6;
                Scanner a = new Scanner(System.in);
                n5 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número (separe decimales con punto): "));
                n6 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número (separe decimales con punto): "));
                resultado = n5 * n6;
                JOptionPane.showMessageDialog(null, "El resultado de " + n5 + " x " + n6 + " es : " + resultado);
                JOptionPane.showMessageDialog(null, "Gracias por todo");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Va a hacer una división entre dos números");
                double n7,
                 n8;
                Scanner d = new Scanner(System.in);
                n7 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número (separe decimales con punto): "));
                n8 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número (separe decimales con punto): "));
                resultado = n7 / n8;
                JOptionPane.showMessageDialog(null, "El resultado de " + n7 + " / " + n8 + " es : " + resultado);
                JOptionPane.showMessageDialog(null, "Gracias por todo");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Va a hacer el modulo entre dos números");
                double n9,
                 n0;
                Scanner c = new Scanner(System.in);
                n9 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número (separe decimales con punto): "));
                n0 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número (separe decimales con punto): "));
                resultado = n9 % n0;
                JOptionPane.showMessageDialog(null, "El resultado de " + n9 + " % " + n0 + " es : " + resultado);
                JOptionPane.showMessageDialog(null, "Gracias por todo");
                break;

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String playAgain = "y";
        
        while (playAgain.equals("y")) {
            ProgramaOperaciones();
            playAgain = JOptionPane.showInputDialog("¿Desea hacer otra operacion? \n (y). Vuelva a iniciar el programa \n (n). No, gracias. \n\n Enter option.");
        }
        JOptionPane.showMessageDialog(null, "Att: Cristian Martinez");

    }
}
