public class Validador {

    public static boolean textoValido(String texto) {
        if (texto == null || texto.equals("")) {
            return false;
        }

        return true;
    }

    public static boolean edadValida(int edad, int minimo, int maximo) {
        if (edad < minimo || edad > maximo) {
            return false;
        }

        return true;
    }
}
