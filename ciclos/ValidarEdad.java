package ciclos;

public class ValidarEdad {

        public static void main (String[] args){

            int edad = leerEdadValidad();

            System.out.println("Edad registrada: " + edad);

        }

        public  static int leerEdadValidad(){

            int edad;


            do { //ENTRA AL CICLO Y HAZ ->

                    edad = Entrada.leerEntero("Escribe tu edad (1-120): ");


                    if (edad <1 || edad > 120){
                        System.out.println("Edad NO ES VÄLIDAAA, intenta de nuevo ");

                    }
            } while (edad <1 || edad > 120);

                return edad;
        }


}
