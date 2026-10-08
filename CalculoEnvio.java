package decisionesanidadas;

public class CalculoEnvio {
    // Quiero que este programa me calcule el envio si en naciona p internacional

    public static void main (String[] args){
        boolean esInternacional = Entrada.leerBooleano("¿El envio es internacional ??:  (True/False))");
        double peso = Entrada.leerDecimal("peso del paquete es en Kg:  ");


        double costo = calcularCostoEnvio (esInternacional, peso);

        System.out.println("Costo del envío es: " + costo);

    }

    public static double calcularCostoEnvio (boolean esInternacional, double peso){

        double costo;

        if (esInternacional){
            //Internacional
            if(peso<= 2){
                costo=80000;
            }else{
                costo = 80000 + (peso - 2) *25000;
            }
        } else {
            // Envío Nacional
            if(peso<=2){
                costo = 15000;
            }else{
                costo= 15000 + (peso - 2 ) *5000;
            }
        }

        return costo;
    }

}