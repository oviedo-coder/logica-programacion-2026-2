package repasoparcial;

public class Cafeteria {

    public static void main (String[] args){

        // abstracción: El gasto promedio por cliente y su clasificación
        //el total vendido en el mes y el # de clientes atendidos.

        //Descomposición: 1. Leer total vendidos, 2. # total de clientes, 3.Calcular promedio, 4. Mostrar resultado

        // Reconocimeiento de patrones: Leer datos, scanner, leer int, double... etc

        double totalVendido = Entrada.leerDecimal("Total vendido en el mes: ");
        int clienteAtendidos = Entrada.leerEntero("Clientes atendidos: ");

        double promedio = totalVendido / clienteAtendidos;



        if (promedio <=15000){
            System.out.println("Gasto promedio bajo: " + promedio);
        }else {
            System.out.println("Gasto promedio alto: " + promedio);
        }


    }
}
