package FvModel;

import java.util.ArrayList;
import java.util.List;

public class Paquete {
    private String nombre;
    private List<Producto> productos;
    private double descuento;

    public Paquete(String nombre, List<Producto> productos, double descuento) {
        if (productos.size() < 2 || productos.size() > 5) {
            throw new IllegalArgumentException("El paquete debe contener entre 2 y 5 productos.");
        }
        this.nombre = nombre;
        this.productos = new ArrayList<>(productos);
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total * (1 - descuento / 100);
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "nombre='" + nombre + '\'' +
                ", productos=" + productos +
                ", descuento=" + descuento +
                ", precioTotal=" + calcularPrecioTotal() +
                '}';
    }
}