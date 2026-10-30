package arreglos;

public class TopCinco {

    public static void main (String[] args){

        String[] top = {"torta de chcolate", "helado", "muffin", "ensalada de frutas", "malteada"};
        // length:               0               1         2                3               4
        mostrarTop(top);

    }

    public static  void mostrarTop (String[] top){
        System.out.println("Mi top " + top.length + "de postres");
        // length -----------------------------------------------

        for (int i = 0; i < top.length; i++){

            System.out.println((i+1) + ".  " + top[i]);
            //                   1. torta de chocolate
            //                   2. helado
        }

    }

}
