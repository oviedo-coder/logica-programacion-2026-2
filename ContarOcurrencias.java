package arreglos;

public class ContarOcurrencias {

    public static void main (String[] args){

        int[] edades = {18, 20, 18, 25, 18, 30};
        //.             0.  1.   2.  3.  4.
        //contador ==18 1.  1.   2.  2.  3.  3 = 3
        //contador ==5. 0.   0.  0.  0.  0.  0 = 0

        int valor = Entrada.leerEntero("¿ Qué edad quieres contar? "); // 18

        int veces = contarVeces (edades, valor);

        System.out.println("La edad " + valor + " aparece " + veces + " veces. ");
    }

    public static int contarVeces(int[] datos, int valor){
        int contador = 0;

        for (int i = 0; i < datos.length; i++){
            if (datos[i] == valor){
                contador++;
            }
        }

        return contador;
    }


}