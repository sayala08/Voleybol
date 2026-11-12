public class Persona {

    private String documento;
    private String nombre;
    private int edad;

    public Persona(String documento, String nombre, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

