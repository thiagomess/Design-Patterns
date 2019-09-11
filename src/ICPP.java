
/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public class ICPP  extends TemplateDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		 return orcamento.getValor() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

}
