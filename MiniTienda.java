package ciclos;

public class MiniTienda {

    // PC: Abstracción,Descomposicion reconocimiento de patrones
    //A: se solicita un menú que se repita y lleve la cuenta del total, es relevante la opción elegida y el total acumulado.
    //D: Iniciar toal, mostrar el menú, leer opcion, Según la op: sumar café, pan, mostrar el total, o salir. Repetir hasta que la opcion sea 4 o sea invalida
    //RP: Switch, do While, , acumulador, Entrada para lectura (repo)

    public static  void main (String[] args){
        ejecutarMenu();

    }

    public static void ejecutarMenu(){
        double total = 0;
        int opcion;

        do {

            System.out.println("1. Café($3.000), 2. Pan ($2.000),  3. Ver total,  4. Salir del menú ");
            opcion = Entrada.leerEntero("Elige una opción:  ");

            switch (opcion){
                case 1:
                    total += 3000;
                    System.out.println("Café agregado. ");
                    break;
                case 2:
                    total += 2000;
                    System.out.println("Pan agregado");
                    break;
                case 3:
                    System.out.println("Total actual $ " + total);
                    break;
                case 4:
                    System.out.println("Gracias, Total final $: " + total);
                    break;
                default:
                    System.out.println("Opción no válida. ");
                    break;

            }
        }while (opcion != 4);



    }

}
