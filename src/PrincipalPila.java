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



        //pila.imprimirElementos();
        String expresion="((3+4)*5)+7+2)"; 
        boolean pasamos=false;
        for (int i = 0; i < expresion.length(); i++) {
            char mi=expresion.charAt(i);
            if(mi=='(') pila.push(mi);

            if(mi==')') {
                if (pila.esVacia()) pasamos=true; 
                    else
                     pila.pop();
            }


        }//for

        if (pila.esVacia() && !pasamos) System.out.println("Es correcta la expresión");
        else  System.out.println("La cagaste BurlanCaster.");


    }//main
    
}//PrincipalPila
