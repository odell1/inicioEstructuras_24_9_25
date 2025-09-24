public class ColaDinamica<T> {
    
    //propiedades iniciales 
    private Nodo<T> frente; // Apunta al primer nodo de la cola
    private Nodo<T> fin;   // Apunta al último nodo de la cola
    private int tamanio;    // Tamaño actual de la cola

    //Constructor
    public ColaDinamica() { 
        this.frente = null; // Inicialmente, la cola está vacía
        this.fin = null;    // Inicialmente, la cola está vacía
        this.tamanio = 0;   // Tamaño inicial es 0
    }//Constructor

    //getter tamanio
    public int getTamanio(){
        return tamanio;
    }

    //Método de si está vacía
    public boolean esVacia(){
        if (frente==null) // tamanio=0
            return true;
        else 
            return false;
        
    }//esVacia

    //método para encolar
    public void encolar(T elemento){
        Nodo<T> nuevoNodo=new Nodo<>(elemento);
        if(esVacia()){ //Es el primer nodo que metemos
            frente=nuevoNodo;
            fin=nuevoNodo;
        } else{
            fin.setSiguiente(nuevoNodo); //El siguiente del fin es el nuevo nodo
            fin=nuevoNodo; //El fin ahora es el nuevo nodo
        }//else

        tamanio++; //Aumentamos el tamaño de la cola
        System.out.println(" Añadimos el el elemento: "+elemento.toString() + " a la cola.");

    }//encolar

    //Desencolar
    public T desencolar(){
        
        //Si está vacía
        if( esVacia()) return null;
         
        T elemento= frente.getDato(); //Guardamos el dato del frente
         frente=frente.getSiguiente(); //El frente ahora es el siguiente del frente

        if(frente==null) //Si el frente es null, la cola está vacía
            fin=null; //El fin también es null  

        tamanio--; //Disminuimos el tamaño de la cola
        System.out.println(" Sacamos el elemento: "+elemento.toString() + " de la cola.");
        return elemento; //Devolvemos el elemento desencolado
    }//desencolar


}//ColaDinamica
