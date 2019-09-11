
/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public class TesteDeImposto {

	public static void main(String[] args) {
		Imposto iss = new ISS();

		Imposto icms = new ICMS();
		
		Imposto icpp = new ICPP();
		
		Imposto ikcv = new IKCV();

		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adiciona(new Item("Caneta", 250.0));
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

		calculadorDeImposto.realizaCalculo(orcamento, iss);
		calculadorDeImposto.realizaCalculo(orcamento, icms); 
		calculadorDeImposto.realizaCalculo(orcamento, icpp); 
		calculadorDeImposto.realizaCalculo(orcamento, ikcv); 

	}

}
