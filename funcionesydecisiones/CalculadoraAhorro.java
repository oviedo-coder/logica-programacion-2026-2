package funcionesydecisiones;

public class CalculadoraAhorro {

    // Función 1 : recibir ingreso y gasto, devuleve cuanto se ahorra al mes
    public static double calcularAhorroMensual(double ingreso, double gasto) {
        return ingreso - gasto;
    }

    // Funcion 2 : recibir el ahorro mensual , devuleve el ahorro proyecto a un año
    public static double calcularAhorroAnual(double ahorroMensual) {

        return ahorroMensual * 12;
    }

        public static void main (String[] args) {

        double ingreso = Entrada.leerDecimal("Ingreso mensual: ");
        double gasto = Entrada.leerDecimal("Gasto mensual: ");

        // Aquí está el cierre del tema: 1 Funcion usa el resultado de la otra función
            double ahorroMes = calcularAhorroMensual(ingreso,gasto );
            double ahorroAnio = calcularAhorroAnual(ahorroMes);


            System.out.println("--- Calculadora de ahorro -------");
            System.out.println("Ahorro mensual: " +  ahorroMes);
            System.out.println("Ahorro proyecto en un año: " + ahorroAnio);


        }


}
