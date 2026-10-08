package decisionesanidadas;

public class MiAventura {

    public static void main(String[] args) {
        boolean vaAIzquierda = Entrada.leerBooleano("Estás en un bosque. ¿Vas a la izquierda? (true = izquierda, false = derecha): ");

        if (vaAIzquierda) {
            // Camino izquierdo: te encuentras un río
            boolean buscaPuente = Entrada.leerBooleano("Encuentras un río. ¿Buscas un puente? (true = sí, false = cruzas nadando): ");
            if (buscaPuente) {
                System.out.println("Cruzas seguro por el puente. ¡Sigues tu camino!");
            } else {
                System.out.println("El río tiene corriente fuerte... ¡No lo logras!");
            }
        } else {
            // Camino derecho: te encuentras una cueva
            boolean llevaAntorcha = Entrada.leerBooleano("Encuentras una cueva. ¿Llevas antorcha? (true/false): ");
            if (llevaAntorcha) {
                System.out.println("Con luz encuentras el tesoro. ¡Ganaste!");
            } else {
                System.out.println("Está muy oscuro, te pierdes en la cueva.");
            }
        }
    }
}