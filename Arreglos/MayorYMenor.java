package arreglos;

public class MayorYMenor {

    public static  void main (String[] args){
        int [] numeros = {3, 8, 1, 9, 4};

        int mayor = buscarMayor(numeros);
        int menor = buscarMenor(numeros);

        System.out.println("El mayor es: " + mayor) ;
        System.out.println("El menor es: " + menor) ;
    }
    public static int buscarMayor(int[] numeros){
        int mayor = numeros [0];

        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
                // ( 8 > 3 = mayor = 8 ) == numeros[i]
            }

        }
        return mayor;
    }

    public static int buscarMenor(int[] numeros){
        int menor = numeros [0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }

    }
