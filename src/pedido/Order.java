package pedido;

public class Order {
    private OrderState estadoAtual;

    public Order() {
        this.estadoAtual = new NovoState();
    }

    public void setEstadoAtual(OrderState estado) {
        this.estadoAtual = estado;
    }

    public OrderState getEstadoAtual() {
        return estadoAtual;
    }

    public void pagar() {
        estadoAtual.pagar(this);
    }

    public void enviar() {
        estadoAtual.enviar(this);
    }

    public void entregar() {
        estadoAtual.entregar(this);
    }

    public void cancelar() {
        estadoAtual.cancelar(this);
    }
}
