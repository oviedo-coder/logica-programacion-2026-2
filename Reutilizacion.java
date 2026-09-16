package funcionesydecisiones;

import java.util.Scanner;

public class Reutilizacion {

    //Función para ingresar un número entero
    public static int ingresarEntero(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        int numero= sc.nextInt();
        return numero;
    }

    //Función para ingresar un número decimal
    public static double ingresarDecimal(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        double numero= sc.nextDouble();
        return numero;
    }

    //Función para ingresar una cadena de texto
    public static String ingresarTexto(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        String texto= sc.nextLine();
        return texto;
    }

    //Función para ingresar un booleano
    public static boolean ingresarBooleano(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        boolean texto= sc.nextBoolean();
        return texto;
    }

    //Función para imprimir
    public static void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }
}