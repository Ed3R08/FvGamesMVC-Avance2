package FvModel;

import java.util.List;


public class ClienteRegistrado extends Cliente {
    private String direccion;
    private String email;
    private double dineroEnCuenta;
    private String metodoPagoPreferido;
    private CarritoDeCompras carrito;

    public ClienteRegistrado(String nombre, String apellidos, String cedula, String direccion, String email, double dineroEnCuenta, String metodoPagoPreferido) {
        super(nombre, apellidos, cedula);
        this.direccion = direccion;
        this.email = email;
        this.dineroEnCuenta = dineroEnCuenta;
        this.metodoPagoPreferido = metodoPagoPreferido;
        this.carrito = new CarritoDeCompras();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDineroEnCuenta() {
        return dineroEnCuenta;
    }

    public void setDineroEnCuenta(double dineroEnCuenta) {
        this.dineroEnCuenta = dineroEnCuenta;
    }

    public String getMetodoPagoPreferido() {
        return metodoPagoPreferido;
    }

    public void setMetodoPagoPreferido(String metodoPagoPreferido) {
        this.metodoPagoPreferido = metodoPagoPreferido;
    }

    @Override
    public void visualizarProductos(Inventario inventario) {
        inventario.mostrarInventario();
    }

    public void agregarProductoAlCarrito(Inventario inventario, String nombreProducto, int cantidad) {
        Producto producto = inventario.buscarProducto(nombreProducto);
        if (producto != null) {
            if (producto.getCantidad() >= cantidad) {
                carrito.agregarProducto(producto, cantidad);
                System.out.println("Producto agregado al carrito.");
            } else {
                System.out.println("Cantidad no disponible. Disponible: " + producto.getCantidad());
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void visualizarCarrito() {
        carrito.mostrarCarrito();
    }

    public void finalizarCompra(Inventario inventario) {
        double total = carrito.calcularTotalConImpuesto();
        if (total <= dineroEnCuenta) {
            dineroEnCuenta -= total;
            List<ElementoCarrito> elementos = carrito.getElementos();
            for (ElementoCarrito elemento : elementos) {
                Producto producto = elemento.getProducto();
                int cantidadComprada = elemento.getCantidad();
                producto.disminuirCantidad(cantidadComprada);
            }
            System.out.println("Compra realizada con éxito.");
            carrito.generarFactura();
            carrito = new CarritoDeCompras(); // Reiniciar el carrito después de la compra
        } else {
            System.out.println("Fondos insuficientes. Recargue su cuenta.");
        }
    }

    public void recargarCuenta(double monto) {
        dineroEnCuenta += monto;
        System.out.println("Cuenta recargada con éxito.");
    }
}