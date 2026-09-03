package clase2;

import java.util.Scanner;

public class CarneDigital {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = teclado.nextInt();
        teclado.nextLine(); // limpia el salto de línea que deja nextInt()

        System.out.print("¿Cuál es tu color favorito? ");
        String colorFavorito = teclado.nextLine();

        System.out.println();
        System.out.println("***********************************");
        System.out.println("*                                 *");
        System.out.println("*          CARNÉ DIGITAL          *");
        System.out.println("*                                 *");
        System.out.println("***********************************");
        System.out.println("  Nombre : " + nombre);
        System.out.println("  Edad   : " + edad);
        System.out.println("  Color  : " + colorFavorito);
        System.out.println("***********************************");
    }
}
