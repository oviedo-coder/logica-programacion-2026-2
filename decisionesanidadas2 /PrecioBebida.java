package decisionesanidadas;

public class PrecioBebida {

    public static void main(String[] args) {

        int bedida = Entrada.leerEntero("Bebida ( 1= Café, 2=Chocolate, 3=Carajillo");
        boolean esGrande = Entrada.leerBooleano("¿Tamaño grande? ( True/False): ");


        double precio = calcularPrecio (bedida, esGrande);

        System.out.println("Precio: $ " + precio);

    }

    public static double calcularPrecio (int bedida, boolean esGrande){

        double precio;

        switch (bedida) { //RAMA 1
            case 1:
                if (esGrande){
                    precio = 6000;
                }else {
                    precio= 4000;
                }
                break;
            case 2:
                if (esGrande){
                    precio = 7000;
                } else {
                    precio = 5000;
                }
                break;
            case 3:
                if (esGrande){
                    precio = 8000;
                }else {
                    precio = 6000;
                }
                break;
            default:
                precio = 0;
                break;
        }

        return precio;



    }


}
