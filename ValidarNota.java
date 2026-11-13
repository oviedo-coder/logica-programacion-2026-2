package arreglos;

public class ValidarNota {

    public static void main(String[] args) {

        double nota = leerNotaValida("Nota (0.0 a 5.0): ");

        System.out.println("Nota registrada: " + nota);
    }
    public static double leerNotaValida(String mensaje){
        double nota = Entrada.leerDecimal(mensaje);

        while (nota < 0 || nota > 5) {
            System.out.println("Nota inválida. Debe estar entre 0 y 5. ");
            nota = Entrada.leerDecimal(mensaje);

        }

        return nota;

    }


}
