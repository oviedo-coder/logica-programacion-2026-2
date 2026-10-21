package ciclos;

public class AdivinaElNumero {

    public static void main (String[] args){

        int secreto = 7;

        jugar(secreto);

    }

    //el usuario puede tener max 5 intentos (1-10) es bajito, esta alto // 7 ---- 1 es bajito, 10 --- muy alto
    // termina: acierte o se

    public static void jugar (int secreto){

        boolean acerto = false;
        int intentos = 0;

        while (!acerto && intentos <5){

            int numero = Entrada.leerEntero("Intento " + (intentos + 1) + " - adivina el número (1-10): ");
            intentos ++;

            if (numero == secreto){
                acerto = true;
            } else if (numero < secreto) {
                System.out.println("Muy bajo");
            }else {
                System.out.println("Muy alto");
            }
        }

        if (acerto){
            System.out.println("¡Ganasteee en " + intentos + " intentos!!!");
        }else {
            System.out.println("Perdiste, el número secreto era " + secreto);
        }


    }



}
