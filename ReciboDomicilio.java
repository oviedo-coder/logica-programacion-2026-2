package secuencialyfunciones;

import java.util.Scanner;

    public class ReciboDomicilio {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            double valorPedido = ingresarReal(teclado, "¿Cuál es el valor del pedido? ");
            double porcentajeDescuento = ingresarReal(teclado, "¿Qué porcentaje de descuento tienes (ej. 10)? ");
            double costoDomicilio = ingresarReal(teclado, "¿Cuánto cuesta el domicilio? ");

            double descuento = calcularDescuento(valorPedido, porcentajeDescuento);
            double subtotal = calcularSubtotal(valorPedido, descuento);
            double total = calcularTotal(subtotal, costoDomicilio);

            String mensaje = generarMensaje(valorPedido, descuento, subtotal, costoDomicilio, total);
            mostrarMensaje(mensaje);
        }

        public static double ingresarReal(Scanner teclado, String pregunta) {
            System.out.print(pregunta);
            return teclado.nextDouble();
        }

        public static double calcularDescuento(double valorPedido, double porcentaje) {
            return valorPedido * (porcentaje / 100);
        }

        public static double calcularSubtotal(double valorPedido, double descuento) {
            return valorPedido - descuento;
        }

        public static double calcularTotal(double subtotal, double costoDomicilio) {
            return subtotal + costoDomicilio;
        }

        public static String generarMensaje(double valorPedido, double descuento, double subtotal,
                                            double costoDomicilio, double total) {
            return "Valor del pedido: $" + valorPedido +
                    ", descuento: $" + descuento +
                    ", subtotal: $" + subtotal +
                    ", domicilio: $" + costoDomicilio +
                    ", total a pagar: $" + total;
        }

        public static void mostrarMensaje(String mensaje) {
            System.out.println(mensaje);
        }
    }


