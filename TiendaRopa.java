package decisionesanidadas;

public class TiendaRopa {

    public static void main (String[] args){

        boolean esFrecuente = Entrada.leerBooleano("Es cliente frecuente: (True/False): ");
        double compra = Entrada.leerDecimal("¿Cual fue el valor de su compra:  ");

        double descuento = calcularDescuento (esFrecuente, compra);

        System.out.println("Su descuento es: " + descuento);

    }
    public static double calcularDescuento (boolean esFrecuente, double compra){

        double porcentaje;

        if (esFrecuente){
            if (compra >= 200000){
                porcentaje = 0.15;
            }else{
                porcentaje = 0.10;
            }
        }else{
            if(compra >= 200000){
                porcentaje = 0.05;
            }else {
                porcentaje = 0.0;
            }
        }

    return compra * porcentaje;

    }



}
