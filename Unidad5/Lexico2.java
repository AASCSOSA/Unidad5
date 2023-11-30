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
public class Lexico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Variables de la función principal
    String cadenas="", mensaje;
    boolean resp;
    int a=0;
    
    // Diccionario de palabras
    String diccionario[]={"hola","mundo","saludos","como","estan","muestro,mi","ejempplo"};
    
    // Obtener la longitud del diccionario
    int tam=diccionario.length;
    
    // Llamar a la función para mostrar los datos del diccionario
    Verdatos(diccionario, tam);
    
    // Llamar a la función para buscar una palabra en el diccionario
    Buscar(diccionario, tam);
}

// Función para mostrar los datos del diccionario
public static void Verdatos(String d[], int t){
    String palabras="";
    
    // Iterar sobre el diccionario y construir la cadena de palabras
    for (int i = 0; i < t; i++) {
        palabras+="["+i+"] "+d[i]+"\n";
        
        // Mostrar la cadena en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, palabras);
    }
}

// Función para buscar una palabra en el diccionario
public static void Buscar(String d[], int t){
    int a=0;
    String cad="";
    String mensaje="NO";
    
    // Solicitar al usuario ingresar una palabra o token
    cad=JOptionPane.showInputDialog("Ingrese palabra o token");
    
    // Iterar sobre el diccionario para buscar la palabra
    for(int i=0; i<t; i++){
        if(cad.equals(d[i])){
            a++;
        }
        
        // Verificar si el token fue encontrado y actualizar el mensaje
        if(a!=0)
            mensaje="token encontrado";
        else
            mensaje="no encontrado";
        
        // Mostrar el mensaje en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

}
