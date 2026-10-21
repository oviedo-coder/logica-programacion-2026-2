package ciclos;

public class ContarAprobados {

    public static void main (String[] args){

        int total = Entrada.leerEntero("¿ Cuántos SS hay?  "); //204 //35 //17

        int aprobados = contarAprobados(total);

        //  int aprobados = contarAprobados(total);

        //Aprobaron 4 de 5 estudiantes
        System.out.println(" Aprobaron  " + aprobados + " de " + total + " estudiantes. ");
    }

    public static int contarAprobados( int total){

        int aprobados = 0;

        for (int i= 1; i<= total; i++ ){

            double nota = Entrada.leerDecimal("Nota del estudiante" +i+ ": ");

            if (nota >= 3.0){
                aprobados++;
            }

        }
        return aprobados;
    }

}
