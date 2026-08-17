public class Pedido {
    Cliente cliente;

    String producto;
    int cantidad;
    double precio;
    String estado;

    public Pedido(Cliente cliente, String producto, int cantidad, double precio) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = "Pendiente";

    }

    public void ActualizarEstados(String nuevoEstado) {

        estado = nuevoEstado;

    }

    public void mostrarEstado() {
        System.out.println("Cliente: "+cliente.nombre+" "+cliente.apellido);
        System.out.println("Producto: "+producto);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Precio: $"+precio);
        System.out.println("Estado: "+estado);

    }

}
