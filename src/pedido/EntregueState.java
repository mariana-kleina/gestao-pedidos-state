package pedido;

public class EntregueState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("O pedido ja foi entregue e pago.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("O pedido ja foi entregue.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("O pedido ja foi entregue anteriormente.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Nao e possivel cancelar. O pedido ja foi entregue.");
    }
}
