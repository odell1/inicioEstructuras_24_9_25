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

    }//main
}//App
