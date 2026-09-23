package repasoparcial;

public class InscripcionCursoVacacional {
  /*  Abstración: si la persona puede inscrbirse y si puede, cuanto dedbe pagar

    la edad, si tiene autorizacion de un adulto, valor inscripcion, fecha de pago

    Descomposición: Leer edad, LeerAutorizacion, Evaluar si es adolescente autorizado, puede inscribirse, leer si el pago es tardio, calcular con el valor de recargo, mostrar resultado. +.5

    Reconocimeinto:No reutilice codigo, pero podria reutilizar,  Scanner, Leer Entero , Leer decimal , leerbooleano.

   */

    public static double calcularValorInscripcion(boolean pagoTardio){
        double valorBase = 150000;
        if (pagoTardio){
            return valorBase * 1.08;
        } else {
            return valorBase;
        }
    }

    public static void main(String[] args){

        int edad = Entrada.leerEntero("Edad del estudiante: ");
        boolean tieneAutorizacion = Entrada.leerBooleano(" tiene autorizacion de un adulto?  (True/False): ");
        boolean pagoTardio = Entrada.leerBooleano("El  pago se hizo despues del día 10? (True/Flase: ");


        boolean esNino = edad>= 6 && edad <=12;
        boolean esAdolescenteAutorizado = edad >=13 && edad <= 17 && tieneAutorizacion;
        boolean puedeInscribirse = esNino || esAdolescenteAutorizado;

        System.out.println("Puede inscribirse? " + puedeInscribirse);

        if(puedeInscribirse){
            double valorFinal = calcularValorInscripcion(pagoTardio);
            System.out.println("Valor a pagar : " + valorFinal);
        }



    }


}