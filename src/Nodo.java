/// Clase Nodo para representar cada elemento de la cola
public class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente; // Enlace al siguiente nodo

    //Constructor
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null; // Inicialmente, el siguiente es null !ojo! se ha de poner siempre así
    }//Constructor

    //Getters y Setters
    public T getDato() {
        return dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }   
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    //Ojo se coge el siguiente
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }


}//Nodo
