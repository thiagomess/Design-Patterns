package designPatterns1;

/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public class TesteDeDescontos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(400.0);
		orcamento.adiciona(new Item("Caneta", 250.0));
		orcamento.adiciona(new Item("Lapis", 250.0));
		
		double calcula = descontos.calcula(orcamento);
		
		System.out.println(calcula);
	}

}
