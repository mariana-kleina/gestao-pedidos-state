package pedido;

public class CanceladoState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("Pedido cancelado. Nao e possivel pagar.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("Pedido cancelado. Nao pode ser enviado.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Pedido cancelado. Nao pode ser entregue.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("O pedido ja esta cancelado.");
    }
}
