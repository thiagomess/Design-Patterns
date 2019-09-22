package designPatterns1;

/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public class TesteDeDescontoExtra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Orcamento reforma = new Orcamento(500.0);
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		reforma.aplicaDescontoExtra();

		System.out.println(reforma.getValor());
		reforma.finaliza();
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
	}

}
