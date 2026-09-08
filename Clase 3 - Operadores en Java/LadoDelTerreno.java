package clase3;

import java.util.Scanner;

public class LadoDelTerreno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Área del terreno cuadrado (m2): ");
        double area = teclado.nextDouble();

        double lado = Math.sqrt(area);

        System.out.println("Cada lado del terreno mide: " + lado + " metros");
    }
}
