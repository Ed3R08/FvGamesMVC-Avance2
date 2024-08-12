package FvController;

import FvModel.Administrador;
import FvModel.Cliente;
import FvModel.ClienteRegistrado;
import FvModel.Inventario;
import java.util.HashMap;
import java.util.Map;

public class GestionClientes {
    private Map<String, ClienteRegistrado> clientesRegistrados;
    private Map<String, Administrador> administradores;

    public GestionClientes() {
        clientesRegistrados = new HashMap<>();
        administradores = new HashMap<>();
    }

    public void registrarCliente(String nombre, String apellidos, String cedula, String direccion, String email, double dineroEnCuenta, String metodoPagoPreferido) {
        ClienteRegistrado cliente = new ClienteRegistrado(nombre, apellidos, cedula, direccion, email, dineroEnCuenta, metodoPagoPreferido);
        clientesRegistrados.put(cedula, cliente);
        System.out.println("Cliente registrado con éxito.");
    }

    public void registrarAdministrador(String nombre, String cedula, String contrasena) {
        Administrador administrador = new Administrador(nombre, cedula, contrasena);
        administradores.put(cedula, administrador);
        System.out.println("Administrador registrado con éxito.");
    }

    public ClienteRegistrado iniciarSesionCliente(String cedula) {
        return clientesRegistrados.get(cedula);
    }

    public Administrador iniciarSesionAdministrador(String cedula, String contrasena) {
        Administrador administrador = administradores.get(cedula);
        if (administrador != null && administrador.getContrasena().equals(contrasena)) {
            System.out.println("Inicio de sesión exitoso.");
            return administrador;
        } else {
            System.out.println("Cédula o contraseña incorrecta.");
            return null;
        }
    }

    public void visualizarProductos(Cliente cliente, Inventario inventario) {
        cliente.visualizarProductos(inventario);
    }
}