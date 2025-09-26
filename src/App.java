import java.util.Random;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Ejemplo con enteros
        System.out.println("--- Ejemplo con enteros ---");
        ColaDinamica<Integer> colaEnteros=new ColaDinamica<>();

        //Encolamos
        colaEnteros.encolar(10);
        colaEnteros.encolar(20);
        colaEnteros.encolar(30);
        colaEnteros.encolar(40);
        colaEnteros.encolar(50);
        colaEnteros.encolar(60);                        

        //Desencolamos
        colaEnteros.desencolar();
        colaEnteros.desencolar();
        colaEnteros.desencolar();
        colaEnteros.desencolar();
        colaEnteros.desencolar();
        
        System.out.println("nos quedan elementos... " + colaEnteros.getTamanio());
        //Vaciamos la cola
        colaEnteros.vaciar();

        //Para strings

        //Para la cola personas

        //Buscar un elemento

////////////////////////////////////////////////////////////
/// Ordenación
////////////////////////////////////////////////////////////
        // Método burbuja
        //Array aleatorio
        int[] array = Ordenacion.generarArrayAleatorio(10);
        //Pasamos a la ordenación  
        Ordenacion ordenacion = new Ordenacion();
        ordenacion.Burubuja(array, true);

        //Con colas
        //Vacío la cola
        colaEnteros.vaciar();
        //Encolamos númmeros aleatorios
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
             colaEnteros.encolar(random.nextInt(100));// 0  al 99
          
        }//for

        colaEnteros.imprimirCola();
        colaEnteros.ordenarBurbuja();
        colaEnteros.imprimirCola();

        
////////////////////////
/// Pilas
/// ///////////////////
        System.out.println("Pilas-*-*-*-*-*-");
        Stack<Integer> pilaEnteros = new Stack<>();
        //Apilamos
        pilaEnteros.push(10);
        pilaEnteros.push(20);
        pilaEnteros.push(30);

        System.out.println(pilaEnteros);

        //Desapilamos elementos
        
        System.out.println("Desapilando que es gerundio... " + pilaEnteros.pop());

        System.out.println("Volvemos a imprimir la pila");  
        System.out.println(pilaEnteros);


           for (int i = 0; i < 100; i++) {
             pilaEnteros.push(random.nextInt(100));// 0  al 99
          
        }//for

        //comprobamos si la pila está vacía
        System.out.println("Está vacía??? "+pilaEnteros.isEmpty()+ "con tantos elementos "+ pilaEnteros.size() + " capacidad "+ pilaEnteros.capacity());

        System.out.println(pilaEnteros);
    }//main
}//App
