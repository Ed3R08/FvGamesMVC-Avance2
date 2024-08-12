package FvModel;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;
    

    public Inventario() {
        this.productos = new ArrayList<>();
        
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void editarProducto(String nombre, String categoria, int cantidad, double precio, String imagen) {
        for (Producto p : productos) {
            if (p.getNombre().equals(nombre)) {
                p.setCategoria(categoria);
                p.setCantidad(cantidad);
                p.setPrecio(precio);
                p.setImagen(imagen);
                break;
            }
        }
    }

    public String mostrarInventario() {
        String inv = "";
        for (Producto p : productos) {
            inv = inv.concat("Nombre: " + p.getNombre() +
                    ", Categoría: " + p.getCategoria() +
                    ", Cantidad: " + p.getCantidad() +
                    ", Precio: " + p.getPrecio() +
                    ", Imagen: " + p.getImagen());
        }
        return inv;
    }

    public void realizarCompra(String nombre, int cantidad) {
        for (Producto p : productos) {
            if (p.getNombre().equals(nombre)) {
                p.disminuirCantidad(cantidad);
                break;
            }
        }
    }

    public double calcularIngresos() {
        double ingresos = 0;
        for (Producto p : productos) {
            ingresos += p.getPrecio() * (p.getCantidad());
        }
        return ingresos;
    }
    

    
    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
}