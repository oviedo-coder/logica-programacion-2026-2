package ciclos;

public class BuscarReprobado {

    public static void main (String[] args){
        int total = Entrada.leerEntero("¿Cuántos Ss hay? ");

        boolean hayReprobado = revisarNotas(total);



        if (hayReprobado) {
            System.out.println("Hay al menos un estudiante reprobado en la clase :( ");
        }else {
            System.out.println("Todos aprobaron :) ");;
        }
    }

    public static boolean revisarNotas(int total){

        boolean hayReprobado = false;

        for(int i = 1; i <= total; i++){
            double nota = Entrada.leerDecimal("Nota del estudiante" + i + ": ");

            if ( nota < 3 ){
                hayReprobado = true;
            }
        }

        return hayReprobado;

    }


}
