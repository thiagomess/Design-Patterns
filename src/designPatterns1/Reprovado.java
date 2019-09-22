package designPatterns1;

/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public class Reprovado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Somente orcamento em aprova��o ou aprovados recebem descontos extra");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento reprovados nao podem ser aprovados");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento aj� est� reprovado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
}
