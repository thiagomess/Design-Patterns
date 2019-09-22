package designPatterns1;

/**
 * @Author Thiago G.
 * 11 de set de 2019
 * 
  */
public class DescontoPorMaisDeQuinhentosReais implements Desconto {

	
	private Desconto proximo;

	public double desconta (Orcamento orcamento) {
		if  (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}

}
