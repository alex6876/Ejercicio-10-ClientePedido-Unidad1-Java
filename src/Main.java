
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Alex","Olivares", 49233127);

        Pedido pedido1 = new Pedido(cliente1, "Galleta Diversión", 210, 250000);
        Pedido pedido2 = new Pedido(cliente1,"Salsa Molto", 150, 200000);


        pedido1.ActualizarEstados("Entregado");
        pedido2.ActualizarEstados("Preparando");


        System.out.println("========= Pedido 1 =========");
        pedido1.mostrarEstado();

        System.out.println("========= Pedido 2 =========");
        pedido2.mostrarEstado();


    }
}