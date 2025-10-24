package pedido;

public class PagoState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("O pedido ja foi pago.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("Pedido enviado para o cliente.");
        order.setEstadoAtual(new EnviadoState());
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Nao e possivel entregar. O pedido ainda nao foi enviado.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Pedido cancelado antes do envio.");
        order.setEstadoAtual(new CanceladoState());
    }
}
