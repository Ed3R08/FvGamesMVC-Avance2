package FvModel;

public class ElementoCarrito {
    
    private Producto producto;
    private int cantidad;

    public ElementoCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + producto.getNombre() + ", Cantidad: " + cantidad + ", Precio total: " + getTotal();
    }
}
