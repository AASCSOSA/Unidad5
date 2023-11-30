/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad5;

import javax.swing.JOptionPane;

/**
 *
 * @author alanh
 */
public class pruebaSepacioin {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) { // Inicio de ejecución
    String palabras = "", palabras2 = "", palabrasSolas = ""; // Declaración de variables tipo cadena
    String cadena = "hola saludos;como estan,muestro ejemplo)"; // Cadena de entrada para la separación
    String vector1[] = cadena.split(" "); // Separación de la cadena mediante un espacio y asignación a un vector llamado vector1

    int tam = vector1.length;
    for (int i = 0; i < tam; i++) {
        palabras += "[" + i + "] " + vector1[i] + "\n";
        // Se construye una cadena con índice y valor del vector1
    }
    JOptionPane.showMessageDialog(null, palabras); // Mostrar la cadena construida en un cuadro de diálogo

    String vector2[] = palabras.split(";");
    int tam2 = vector2.length;
    for (int j = 0; j < tam2; j++) {
        palabras2 += "[" + j + "] " + vector2[j] + "\n";
        // Se construye una nueva cadena con índice y valor del vector2
    }
    JOptionPane.showMessageDialog(null, palabras2); // Mostrar la nueva cadena en un cuadro de diálogo
}


}
