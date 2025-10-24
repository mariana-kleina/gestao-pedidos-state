package pedido;

public class NovoState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("Pagamento confirmado. Pedido agora esta PAGO.");
        order.setEstadoAtual(new PagoState());
    }

    @Override
    public void enviar(Order order) {
        System.out.println("Nao e possivel enviar o pedido. O pagamento ainda nao foi feito.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Nao e possivel entregar. O pedido ainda nao foi pago.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Pedido cancelado com sucesso.");
        order.setEstadoAtual(new CanceladoState());
    }
}
