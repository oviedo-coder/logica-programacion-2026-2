package arreglos;

public class ArregloAlReves {

    public static void main (String[] args){
        int[] numeros = {10, 20, 30, 40, 50};

        // 50, 40, 30, 20, 10
        //1: 50
        //2:40
        //3: 30
        //....

        mostrarAlReves(numeros);
    }

    public static void mostrarAlReves(int[] numeros){

        for (int i = numeros.length-1; i >=0; i--){
            System.out.println("posición " + i +  " : " + numeros[i] );
        }
    }
}
