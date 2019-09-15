
/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public class Aprovado implements EstadoDeUmOrcamento {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -=orcamento.valor  * 0.02;
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� esta aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento aprovados nao podem ser reprovados");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
