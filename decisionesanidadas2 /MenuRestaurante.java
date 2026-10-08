package decisionesanidadas;

public class MenuRestaurante {

    public static void main(String[] args) {

        int opcion = Entrada.leerEntero("Elige una opción del menú (1-4)");

        String pedido = obtenerPedido(opcion);


        System.out.println("Pediste:  " + pedido);

    }

    public static String obtenerPedido(int opcion) {

        String pedido;

        switch (opcion) {
            case 1:
                pedido = "hamburguesa - $18000  ";
                break;

            case 2:
                pedido = "salchipapa - $27000";
                break;

            case 3:
                pedido = "churrasco - $60000";
                break;

            case 4:
                pedido = "sancocho de espinazo - $30000";
                break;

            default:
                pedido = "Opción no válida";
                break;

        }
        return pedido;

    }

}
