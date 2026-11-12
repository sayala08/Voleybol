public class Lesion {

    private String tipo;
    private String fecha;
    private boolean activa;

    public Lesion(String tipo, String fecha) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.activa = true;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isActiva() {
        return activa;
    }

    public void darDeAlta() {
        activa = false;
    }

    public void mostrarLesion() {
        System.out.println("Tipo de lesión: " + tipo);
        System.out.println("Fecha: " + fecha);

        if (activa) {
            System.out.println("Estado: Activa");
        } else {
            System.out.println("Estado: Recuperado");
        }
    }
}

