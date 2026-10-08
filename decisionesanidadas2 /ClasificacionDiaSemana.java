package decisionesanidadas;

public class ClasificacionDiaSemana {

    public static void main (String[] args){
        int dia = Entrada.leerEntero ("escribe el # del día ( 1= Lunes, 2= martes, ..... 7= domingo): ");

        String tipoDia= clasificarDia(dia);

        System.out.println("Este mes tiene: " + tipoDia);

    }

    public static String clasificarDia (int dia){

        String tipoDia;


        switch (dia){
            //dia laboral : lunes, martes, mierc, jueves, y viernes
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                tipoDia = "Día laboral";
                break;

            case 6:
            case 7:
                tipoDia = "Fin de semana";
                break;

            default:
                tipoDia = "No valido";
                break;


        }
        return  tipoDia;


    }
}


