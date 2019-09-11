
/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		else {
			return minimaTaxacao(orcamento);
		}
	}

	/**
	 * @param orcamento
	 * @return
	 */
	public abstract double minimaTaxacao(Orcamento orcamento);

	/**
	 * @param orcamento
	 * @return
	 */
	public abstract double maximaTaxacao(Orcamento orcamento);

	/**
	 * @param orcamento
	 * @return
	 */
	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
