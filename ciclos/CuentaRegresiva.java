package ciclos;

public class CuentaRegresiva {

        //While

    public static void main (String[] args){

        int inicio = Entrada.leerEntero("Desde que # empieza la cuenta regresiva: ");

        cuentaRegresiva(inicio);

    }

    public static void cuentaRegresiva (int inicio){

        int contandor = inicio;

        while ( contandor >= 1){
            System.out.println(contandor);
            contandor--;
        }

        System.out.println("¡Despegueeee!");
    }



}
