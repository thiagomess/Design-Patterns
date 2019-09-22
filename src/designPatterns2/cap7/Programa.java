package designPatterns2.cap7;

public class Programa {

    public static void main(String[] args) {


        final Pedido pedido1 = new Pedido("Thiago", 110.0);
        final Pedido pedido2 = new Pedido("Mauricio", 250.0);


        final FilaDeTrabalho filaDeTrabalho = new FilaDeTrabalho();
        filaDeTrabalho.adiciona(new PagaPedido(pedido1));
        filaDeTrabalho.adiciona(new PagaPedido(pedido2));
        filaDeTrabalho.adiciona(new ConcluirPedido(pedido1));
        filaDeTrabalho.adiciona(new ConcluirPedido(pedido2));

        filaDeTrabalho.processa();


    }
}
