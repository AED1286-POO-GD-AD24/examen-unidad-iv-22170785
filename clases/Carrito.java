package clases;

// Clase Carrito
public class Carrito<T extends Producto> {
    private T[] productos;
    private int indice;

    @SuppressWarnings("unchecked")
    public Carrito(int capacidad) {
        productos = (T[]) new Producto[capacidad];
        indice = 0;
    }

    public void agregarProducto(T producto) {
        if (indice < productos.length) {
            productos[indice++] = producto;
        } else {
            System.out.println("Carrito lleno, no se puede agregar más productos.");
        }
    }

    public double calcularTotal() {
        return productos[0].getPrecio() + productos[1].getPrecio();
    }

    public void mostrarProductos() {
        System.out.println("Productos: "+productos[0].getNombre()+", "+productos[1].getNombre());
    }
}
