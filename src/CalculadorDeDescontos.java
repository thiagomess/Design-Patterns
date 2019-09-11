
/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		return d1.desconta(orcamento);
		
	}

}
