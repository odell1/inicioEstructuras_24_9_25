import java.util.Arrays;
import java.util.Random;

public class Ordenacion {
    

    ///Generación aleatoria de un array
    public static int[] generarArrayAleatorio(int tamaño) {
        Random random = new Random();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(100); // Números del 0 al 99
        }
        return array;
    }//generarArrayAleatorio

/*
 *
 *
ALGORITMO Burubuja
ENTRADA: array[0...n-1] de elementos comparables
SALIDA: array ordenado de menor a mayor

INICIO
    n ← longitud del array
    
    PARA i ← 0 HASTA n-2 HACER
        intercambio ← FALSO
        
        PARA j ← 0 HASTA n-2-i HACER
            SI array[j] > array[j+1] ENTONCES
                // Intercambiar elementos
                temp ← array[j]
                array[j] ← array[j+1]
                array[j+1] ← temp
                intercambio ← VERDADERO
            FIN SI
        FIN PARA
        
        // Optimización: si no hubo intercambios, ya está ordenado
        SI intercambio = FALSO ENTONCES
            SALIR
        FIN SI
    FIN PARA
FIN
 */

    public int[] Burubuja(int[] array, boolean mostrarPasos) {
        int n = array.length;
        boolean intercambio;
        int pasada = 0;
        
        if (mostrarPasos) {
            System.out.println("\n Burbjua paso a paso");
            System.out.println("Inicio: " + Arrays.toString(array));
        }
        
        // Realizar n-1 pasadas
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;//Optimización
            pasada++;
            
            if (mostrarPasos) {
                System.out.println("\nPasada " + pasada + ":");
            }
            
            // Comparamos
            for (int j = 0; j < n - 1 - i; j++) {
                if (mostrarPasos) {
                    System.out.println("  Comparando " + array[j] + " y " + array[j + 1]);
                }
                
                //Si están en orden incorrecto, intercambiar
                if (array[j] > array[j + 1]) {
                    // Intercambiar elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    intercambio = true;
                    

                    if (mostrarPasos) {
                        System.out.println("  ¡Intercambiamos! " + Arrays.toString(array));
                    }
                }
            }
            
            if (mostrarPasos) {
                System.out.println("  Final pasada " + pasada + ": " + Arrays.toString(array));
                System.out.println("  Elemento en posición final: " + array[n - 1 - i]);
            }
            
            //Si no hubo intercambios, el array ya está ordenado
            if (!intercambio) {
                if (mostrarPasos) {
                    System.out.println("¡No hay más intercambios! Array ordenado.");
                }
                return array;
                
            }
            
        }//for
        return array;
        
    }//Burubuja




}//Ordenacion
