import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<Jugador>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void agregarJugador(Jugador jugador) {

        if (jugadores.size() >= 14) {
            System.out.println("El equipo ya tiene 14 jugadores.");
            return;
        }

        if (jugador.getPosicion() == Posicion.libero) {
            for (Jugador j : jugadores) {
                if (j.getPosicion() == Posicion.libero) {
                    System.out.println("El equipo ya tiene un libero.");
                    return;
                }
            }
        }

        for (Jugador j : jugadores) {
            if (j.getNumeroCamiseta() == jugador.getNumeroCamiseta()) {
                System.out.println("Ese numero de camiseta ya existe.");
                return;
            }
        }

        jugadores.add(jugador);
        System.out.println("Jugador agregado correctamente.");
    }

    public void mostrarEquipo() {

        System.out.println("Equipo: " + nombre);

        for (Jugador jugador : jugadores) {
            jugador.mostrarInformacion();
            System.out.println("----------------");
        }
    }
}
