package clase3;

public class EjemplosFuncionesMath {
    public static void main(String[] args) {
        System.out.println("===== Funciones de la clase Math =====");

        double numero1 = 25;
        double raiz = Math.sqrt(numero1);
        System.out.println("Raíz cuadrada de " + (int) numero1 + " -> " + raiz);

        double numero2 = 27;
        double raizCubica = Math.cbrt(numero2);
        System.out.println("Raíz cúbica de " + (int) numero2 + " -> " + raizCubica);

        double base = 2;
        double exponente = 3;
        double potencia = Math.pow(base, exponente);
        System.out.println((int) base + " elevado a " + (int) exponente + " -> " + potencia);

        int numeroNegativo = -15;
        int absoluto = Math.abs(numeroNegativo);
        System.out.println("Valor absoluto de " + numeroNegativo + " -> " + absoluto);

        int dado = (int) (Math.random() * 6) + 1;
        System.out.println("Número aleatorio entre 1 y 6 -> " + dado);
    }
}
