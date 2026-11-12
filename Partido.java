
public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;
    private int puntosEquipo1;
    private int puntosEquipo2;
    private boolean terminado;

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.puntosEquipo1 = 0;
        this.puntosEquipo2 = 0;
        this.terminado = false;
    }

    public void registrarResultado(int puntos1, int puntos2) {

        if (terminado) {
            System.out.println("El partido ya termino.");
            return;
        }

        if (puntos1 == puntos2) {
            System.out.println("No puede haber empate.");
            return;
        }

        puntosEquipo1 = puntos1;
        puntosEquipo2 = puntos2;
        terminado = true;

        System.out.println("Resultado registrado.");
    }

    public void mostrarPartido() {

        System.out.println("Partido:");
        System.out.println(equipo1.getNombre() + " vs "
                + equipo2.getNombre());

        if (terminado) {
            System.out.println("Resultado: "
                    + puntosEquipo1 + " - " + puntosEquipo2);

            if (puntosEquipo1 > puntosEquipo2) {
                System.out.println("Ganador: " + equipo1.getNombre());
            } else {
                System.out.println("Ganador: " + equipo2.getNombre());
            }
        } else {
            System.out.println("Partido pendiente.");
        }
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }
}

