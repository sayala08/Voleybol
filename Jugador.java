public class Jugador extends Persona {

    private int numeroCamiseta;
    private Posicion posicion;
    private EstadoSalud estado;

    public Jugador(String documento, String nombre, int edad,
                   int numeroCamiseta, Posicion posicion) {

        super(documento, nombre, edad);

        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
        this.estado = EstadoSalud.disponible;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public EstadoSalud getEstado() {
        return estado;
    }

    public void cambiarEstado(EstadoSalud estado) {
        this.estado = estado;
    }

  @Override
  public void mostrarInformacion() {
    super.mostrarInformacion();

    System.out.println("Camiseta: " + numeroCamiseta);
    System.out.println("Posición: " + posicion);
    System.out.println("Estado: " + estado);
}
}

