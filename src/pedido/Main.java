package pedido;

public class Main {
    public static void main(String[] args) {
        Order pedido = new Order();

        System.out.println("=== Estado inicial: Novo ===");
        pedido.pagar();

        System.out.println("\n=== Tentando enviar ===");
        pedido.enviar();

        System.out.println("\n=== Tentando entregar ===");
        pedido.entregar();

        System.out.println("\n=== Tentando cancelar ===");
        pedido.cancelar();
    }
}
