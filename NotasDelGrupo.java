package arreglos;

public class NotasDelGrupo {

    public static  void main (String[] args){

        double[] notas = new double[5];

        leerNotas(notas);
        mostrarResumen(notas);
    }

    public static void leerNotas(double[] notas){
        for (int i = 0; i < notas.length; i++){

            notas[i] = Entrada.leerDecimal("Nota del estudiante " + (i + 1) + ": ");
            //                                       Nota del estudiante 1:
            //
        }

    }

    public static void mostrarResumen (double[] notas ){

        double suma = 0;
        int aprobados = 0;


        for (int i = 0; i < notas.length; i++){
            suma += notas[i];

            if (notas[i] >= 3.0){

                aprobados ++;
            }
        }

        double promedio = suma / notas.length;

        System.out.println("Promedio del grupo: " + promedio);
        System.out.println("Aprobados: " +aprobados + " de " + notas.length);


    }

}