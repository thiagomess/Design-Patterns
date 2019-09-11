
/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
