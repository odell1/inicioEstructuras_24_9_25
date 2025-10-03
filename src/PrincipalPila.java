public class PrincipalPila {

    public static void main(String[] args) {
        
        MiPilila<Character> pila=new MiPilila<>();

        pila.push('X');
        pila.push('F');
        pila.push('O');

        pila.imprimirElementos();

        pila.pop();
        pila.pop();
        pila.pop();

        //Debe dar error
        pila.pop();

    }//main
    
}//PrincipalPila
