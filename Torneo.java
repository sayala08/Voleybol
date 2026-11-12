
import java.util.ArrayList;

public class Torneo {

    private String nombre;
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;

    public Torneo(String nombre) {
        this.nombre = nombre;
        equipos = new ArrayList<Equipo>();
        partidos = new ArrayList<Partido>();
    }

    public void agregarEquipo(Equipo equipo) {

        for (Equipo e : equipos) {
            if (e.getNombre().equals(equipo.getNombre())) {
                System.out.println("Ese equipo ya esta registrado.");
                return;
            }
        }

        equipos.add(equipo);
        System.out.println("Equipo agregado al torneo.");
    }

    public void programarPartido(Equipo equipo1, Equipo equipo2) {

        if (equipo1 == equipo2) {
            System.out.println("Un equipo no puede jugar contra si mismo.");
            return;
        }

        if (!equipos.contains(equipo1) || !equipos.contains(equipo2)) {
            System.out.println("Ambos equipos deben estar registrados.");
            return;
        }

        Partido partido = new Partido(equipo1, equipo2);
        partidos.add(partido);

        System.out.println("Partido programado.");
    }

    public void mostrarEquipos() {

        System.out.println("TORNEO: " + nombre);

        for (Equipo equipo : equipos) {
            equipo.mostrarEquipo();
        }
    }

    public void mostrarPartidos() {

        for (Partido partido : partidos) {
            partido.mostrarPartido();
            System.out.println("----------------");
        }
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
}

