package FvModel;

public class Producto {
    
    private String nombre;
    private String categoria;
    private int cantidad;
    private double precio;
    private String imagen;  // Ruta de la imagen descriptiva

    public Producto(String nombre, String categoria, double precio, int cantidad/*String imagen*/) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
        this.imagen = imagen;
    }

   
    public String getNombre(){ 
        return nombre; 
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() { 
        return categoria; 
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() { 
        return cantidad;
    }
    public void setCantidad(int cantidad) { 
        this.cantidad = cantidad;
    }

    public double getPrecio() { 
        return precio; 
    }
    public void setPrecio(double precio) { 
        this.precio = precio; 
    }

    public String getImagen() { 
        return imagen; 
    }
    public void setImagen(String imagen) { 
        this.imagen = imagen;
    }

    public void disminuirCantidad(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("Cantidad insuficiente en inventario.");
        }
    }
}

