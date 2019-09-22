package designPatterns2.cap7;

public class ConcluirPedido implements Comando {

    private Pedido p;

    public ConcluirPedido(Pedido p) {
        this.p = p;
    }

    @Override
    public void executa() {
        System.out.println("Concluindo pedido do " +p.getCliente());
        p.finaliza();

    }
}
