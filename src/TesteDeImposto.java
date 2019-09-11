
/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public class TesteDeImposto {

	public static void main(String[] args) {
		Imposto iss = new ISS();

		Imposto icms = new ICMS();

		Orcamento orcamento = new Orcamento(500.0);
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

		calculadorDeImposto.realizaCalculo(orcamento, iss);
		calculadorDeImposto.realizaCalculo(orcamento, icms); 

	}

}
