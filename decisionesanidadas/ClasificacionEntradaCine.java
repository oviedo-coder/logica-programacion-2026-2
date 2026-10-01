package decisionesanidadas;

public class ClasificacionEntradaCine {

    public static void main (String[] args){
        int edad = Entrada.leerEntero("Edad del espectador: ");
        boolean esFuncion3D = Entrada.leerBooleano("¿Es función 3D (True/False");


        double valorEntrada = calcularValorEntrada (edad, esFuncion3D);

        System.out.println("valor de la entrada: " + valorEntrada);

    }

    public static double calcularValorEntrada ( int edad , boolean esFuncion3D) {

        double valor;

        if (edad < 12) { //->118
            //Categoria niños
            if (esFuncion3D) { // True
                valor = 12000;
            } else {
                valor = 8000;
            }

        } else if (edad < 60) {
            //Categoria adultos
        if (esFuncion3D) { // False
            valor = 20000;
        } else {
           valor = 15000;
        }
    }else{

        //Categoria adulto Mayor
        if (esFuncion3D) { // True
            valor = 14000;
        } else {
            valor = 10000;
        }
    }


        return valor;
    }
}
