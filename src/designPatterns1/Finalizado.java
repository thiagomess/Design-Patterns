package designPatterns1;

/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados nao recebem descontos extra");
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� finalizado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� finalizado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� finalizado");
		
	}

}
