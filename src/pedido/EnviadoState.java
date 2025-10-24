package pedido;

public class EnviadoState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("O pedido ja foi pago e enviado.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("O pedido ja foi enviado.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Pedido entregue ao cliente.");
        order.setEstadoAtual(new EntregueState());
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Nao e possivel cancelar. O pedido ja foi enviado.");
    }
}
