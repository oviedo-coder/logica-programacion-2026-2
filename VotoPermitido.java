package funcionesydecisiones;

public class VotoPermitido {
    public static void main(String[] args) {

        int edad = Entrada.leerEntero(" Ingresa tu edad: ");

        if (edad >= 18){
            System.out.println("Puedes votar!!!.");
        }else{
            System.out.println("Todavia no puedes votar :(");
        }


    }
}

