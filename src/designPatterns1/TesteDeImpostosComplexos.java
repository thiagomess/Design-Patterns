package designPatterns1;

/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		
		Imposto iss = new ISS(new ICMS(new ICPP()));
		
		Orcamento orcamento = new Orcamento(500.0);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
		
		
		
		
	}
}
