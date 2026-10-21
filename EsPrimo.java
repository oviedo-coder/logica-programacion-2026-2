package ciclos;

public class EsPrimo {

    public static void main (String[] args){

        int numero = Entrada.leerEntero("Escribe un número: ");

        if (esPrimo(numero)){
            //3                     3 es primo
            System.out.println(numero + " es primo. ");
        }else {
            //
            System.out.println(numero + " no es primo. ");
        }
    }

    public static boolean esPrimo(int n){

        if (n <2){
            return false;
        }

        boolean primo = true;

        for (int i = 2; i < n; i++){

            if (n % i == 0){
                primo=false;
            }
        }
        return primo;


    }


}