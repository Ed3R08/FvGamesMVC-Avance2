package FvModel;

public class Administrador {
    private final String nombre;
    private final String cedula;
    private final String contrasena;

    public Administrador(String nombre, String cedula, String contrasena) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getContrasena() {
        return contrasena;
    }
}