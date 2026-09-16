package funcionesydecisiones;

public class DescuentoCine {
    public static void main (String[] args){

        int edad = Entrada.leerEntero("Ingresa tu edad: ");
        boolean esEstudiante = Entrada.leerBooleano("¿Eres estudiante? (True/False): ");


        if(edad <=12 || edad >= 60 || esEstudiante){
            System.out.println("Tienes descuento en la boleta de cine :).");
        }else {
            System.out.println("Pagas completo, sorry :(");
        }

    }



}
