package parcial2;

public class Parqueadero {

    public static void main(String[] args) {
        ejecutarMenu();
    }

    public static void ejecutarMenu() {
        double recaudo = 0;
        int carros = 0;
        int motos = 0;
        int opcion;

        do {
            System.out.println("1. Entra carro ($5.000)  2. Entra moto ($2.000)  3. Ver resumen  4. Salir");
            opcion = Entrada.leerEntero("Elige una opción: ");

            switch (opcion) {
                case 1:
                    recaudo += 5000;
                    carros++;
                    System.out.println("Carro registrado.");
                    break;
                case 2:
                    recaudo += 2000;
                    motos++;
                    System.out.println("Moto registrada.");
                    break;
                case 3:
                    System.out.println("Recaudo: $" + recaudo + " | Carros: " + carros + " | Motos: " + motos);
                    break;
                case 4:
                    System.out.println("Cierre del día. Recaudo final: $" + recaudo + " | Carros: " + carros + " | Motos: " + motos);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
    }
}
