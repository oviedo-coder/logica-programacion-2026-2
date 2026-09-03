package clase2;

public class EjemplosClase {
    public static void main(String[] args) {

        // ===== 1. Comentarios =====

        // Esto es un comentario de una sola línea, Java lo ignora al ejecutar

        /* Esto es un comentario de bloque o multilínea,
           puede escribirse en varias líneas */

        /** Este es un comentario de documentación (Javadoc),
         * se usa para documentar clases y métodos */


  //   /*
        // ===== 2. Creación de variables =====

        String nombre = "Valentina";
        int edad = 20;
        double estatura =1.78;
        char inicial = 'V';
        boolean esProfesor = true ;

        System.out.println("===== Variables =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Es Profesor?: " + esProfesor);



    //   */

     /*

        // ===== 3. Secuencias de escape =====
        System.out.println("\n===== Secuencias de escape =====");

        // \n -> salto de línea
        System.out.println("Primera línea\nSegunda línea");

        // \t -> tabulación
        System.out.println("Nombre:\tValentina");
        System.out.println("Edad:\t60");

        // \" -> comillas dobles dentro de un String
        System.out.println("Ella dijo: \"Hola Mundo\"");

        // dentro de un String, la comilla simple NO necesita escaparse
        System.out.println("La letra 'a' es una vocal");

        // \' sí es necesaria dentro de un char, porque un char va entre comillas simples
        char comillaSimple = '\'';
        System.out.println("Este es un char de comilla simple: " + comillaSimple);

        // \\ -> barra invertida
        System.out.println("La ruta del archivo es: C:\\Usuarios\\Valentina");

        // \b -> retrocede el cursor un espacio (el efecto se ve distinto según la consola)
        System.out.println("Ejemplo de \\b: Hola\bMundo");


      */
    }
}
