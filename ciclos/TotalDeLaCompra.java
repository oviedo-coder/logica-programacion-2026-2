package ciclos;

public class TotalDeLaCompra {

    public static void main (String[] args){
        int cantidad =Entrada.leerEntero(" ¿ Cuántos productos vas a comprar?  ");

        double total = calcularTotal(cantidad);

        if (total >= 100000){
            total = total * 0.9;
            System.out.println(" Se aplico un descuento del 10%");

        }

        System.out.println(" Total a pagar: $ " + total);
    }

    public static double calcularTotal(int cantidad){
        double total = 0;

        for (int i=1; i <= cantidad; i ++){
            double precio = Entrada.leerDecimal("PRecio del producto " + i + ": ");

            total += precio;


        }
        return total;

    }

}
