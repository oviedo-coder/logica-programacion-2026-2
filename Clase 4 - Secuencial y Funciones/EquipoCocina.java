package secuencialyfunciones;

public class EquipoCocina {

    public static void main(String[] args) {
        System.out.println(iniciarCocina("sopa"));
        System.out.println("Mezcle: " + mezclarIngredientes("agua", "sal", "zanahoria"));
        System.out.println(servir(25));
        System.out.println(preparaPostre("flan"));   // línea nueva que ellos agregan
    }

    static String iniciarCocina(String plato) {
        return "Cocinando: " + plato;
    }

    static String mezclarIngredientes(String a, String b, String c) {
        return a + "-" + b + "-" + c;
    }

    static String servir(int tiempo) {
        return "Listo en " + tiempo + " minutos. A comer!";
    }

    // NUEVO — función de postre (la agregan ellos)
    static String preparaPostre(String postre) {
        return "De postre: " + postre + ". Que lo disfruten!";
    }
}
