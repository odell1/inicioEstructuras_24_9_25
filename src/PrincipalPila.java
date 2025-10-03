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

       
      
        String expresion="((3+4)*5)+7+2)"; 
        compruebaParentesis(expresion,pila);
        String palindromio="Judas";
        compruebaPalindromo(palindromio,pila);


    }//main

////////////////////////////
/// 
    public static void compruebaPalindromo(String texto, MiPilila<Character> pila) {
   
        //Insertamos todos los caracteres en la pila
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }//for

        // Comparamos los caracteres en orden inverso
        for (int i = 0; i < texto.length(); i++) {
            char desdePila = pila.pop();
            if (texto.charAt(i) != desdePila) {
                System.out.println("No es palíndromo");
            }//if
        }//for

        System.out.println("Es palíndromo");
 }//compruebaPalindromo




////////////////////////////
/// 
    private static void compruebaParentesis(String expresion, MiPilila<Character> pila) {
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


    }//compruebaParentesis
    





}//PrincipalPila
