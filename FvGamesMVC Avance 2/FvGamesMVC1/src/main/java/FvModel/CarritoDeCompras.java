package FvModel;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<ElementoCarrito> elementos;

    public CarritoDeCompras() {
        this.elementos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        elementos.add(new ElementoCarrito(producto, cantidad));
    }

    public double calcularTotal() {
        double total = 0;
        for (ElementoCarrito e : elementos) {
            total += e.getTotal();
        }
        return total;
    }

    public double calcularTotalConImpuesto() {
        double total = calcularTotal();
        double impuesto = total * 0.13;
        return total + impuesto;
    }

    public void mostrarCarrito() {
        for (ElementoCarrito e : elementos) {
            System.out.println(e);
        }
    }

    public void generarFactura() {
        Factura factura = new Factura(this);
        factura.mostrarFactura();
    }

    public List<ElementoCarrito> getElementos() {
        return elementos;
    }
}
