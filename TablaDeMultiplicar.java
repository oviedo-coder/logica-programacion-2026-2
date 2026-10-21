package ciclos;

public class TablaDeMultiplicar {

        public static void main (String[] args){

            int numero = Entrada.leerEntero("La tabla de qué # quieres ver??  ");


            imprimirTabla(numero);

        }

        public static void imprimirTabla(int numero){

            for (int i = 1; i <= 10; i++){
                System.out.println(numero + "x" + i + "=" + (numero*i));
            }


        }






}
