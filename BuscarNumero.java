package arreglos;

public class BuscarNumero {

    public static void main (String[] args){

        int [] numeros = {12, 7, 25, 3, 18};
        //                 0. 1.  2. 3.  4

        int buscado = Entrada.leerEntero(" ¿Qué número quieres buscar ? "); // 25

        int posicion = buscar (numeros, buscado);

        if (posicion == -1){
            System.out.println("El " + buscado + " no está en el arreglo. ");
        } else {
            System.out.println("El " + buscado + " está en la posición " + posicion + ".");
        }
    }

    public static  int buscar ( int[] numeros, int buscado){
        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] == buscado){
                return i;
            }
        }

        return -1;
    }


}
