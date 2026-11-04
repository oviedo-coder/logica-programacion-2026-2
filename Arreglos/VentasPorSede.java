package arreglos;

public class VentasPorSede {

    public static void main(String[] args) {
        int[][] ventas = {
                {10, 20, 30, 40},
                {5, 15, 25, 35},
                {8, 12, 16, 20},

        };

        totalPorSede(ventas);
        totalPorSemana(ventas);
    }

    public static void totalPorSede(int[][] ventas) {
        for (int sede = 0; sede < ventas.length; sede++) {
            int total = 0;

            for (int semana = 0; semana < ventas[sede].length; semana++) {
                total += ventas[sede][semana];
            }
            System.out.println("Sede " + (sede + 1) + ": " + total);

        }
    }

    public static void totalPorSemana(int[][] ventas) {
        for (int semana = 0; semana < ventas[0].length; semana++) {
            int total = 0;

            for (int sede = 0; sede < ventas.length; sede++) {
                total += ventas[sede][semana];
            }
            System.out.println("Semana " + (semana + 1) + ": " + total);
        }
    }
}
