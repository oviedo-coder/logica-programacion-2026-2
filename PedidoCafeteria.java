package decisionesanidadas;

public class PedidoCafeteria {

    public static void main(String[] args) {
        int categoria = Entrada.leerEntero("Cateogria (1= Bebida, 2=Comida): ");
        int producto = Entrada.leerEntero("Producto (1, 2 o 3): ");

        String pedido = obtenerPedido(categoria, producto);

        System.out.println(" Pedido: " + pedido);
    }

    public static String obtenerPedido(int categoria, int producto) {

        String pedido;

        switch (categoria) {
            case 1:

                switch (producto) {
                    case 1:
                        pedido = "Café - $4000";
                        break;

                    case 2:
                        pedido = "Chocolate - $5000";
                        break;

                    case 3:
                        pedido = "Juguito de mora - - $6000";
                        break;

                    default:
                        pedido = "Bebida no válida";
                        break;

                }
                break;

            case 2:

                switch (producto) {
                    case 1:
                        pedido = "sandwich - $9000";
                        break;
                    case 2:
                        pedido = "empanada - $3500";
                        break;
                    case 3:
                        pedido = "torta - $5000";
                        break;
                    default:
                        pedido = "comida no válida";

                }
                break;

            default:
                pedido = "Categoria no válida";
                break;
        }

        return pedido;

    }
}