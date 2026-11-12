import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Torneo torneo = new Torneo("Torneo de Voleibol");

        int opcion;

        do {
            System.out.println("\n1. Registrar equipo");
            System.out.println("2. Mostrar equipos");
            System.out.println("3. Mostrar partidos");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre del equipo: ");
                    String nombre = entrada.nextLine();

                    Equipo equipo = new Equipo(nombre);
                    torneo.agregarEquipo(equipo);
                    break;

                case 2:
                    torneo.mostrarEquipos();
                    break;

                case 3:
                    torneo.mostrarPartidos();
                    break;

                case 4:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 4);

        entrada.close();
    }
}
