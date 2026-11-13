package arreglos;

//  Pedir una frase con espacios y mostrar cuantas letras tiene en total, cuántas palabras tiene y cuál es la primera palabra
//se asume que las palabras están separadas por un solo espacio, sin espacios al inicio ni al final
// me gusta comer un sandiwch por la mañana
// letras =
//palabras=
// primera palabra =

public class AnalizadorDeFrases {

    public static void main(String[] args) {

        String frase = Entrada.leerLinea("Escribe una frase sin espacio al final: ");

        System.out.println("Letras (con espacios): " + frase.length()); // I like = 6
        System.out.println("Palabras: " + contarPalabras(frase));
        System.out.println("Primera palabra: " + primeraPalabra(frase));

    }
    public static int contarPalabras(String frase){
        int espacios = 0;

        for ( int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == ' '){ // pregunta si es un espacio
                espacios++;
            }
        }
    return espacios + 1;

    }
    public static String primeraPalabra( String frase){
        int posicion = frase.indexOf(' '); // guarda en que casillero está el primer espacio o -1

        if(posicion == -1){
            return frase; //.  COMERGUSTAR
        } //.  me gusta comer. // me

        return frase.substring(0, posicion);
    }
}