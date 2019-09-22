package designPatterns1;

public class CalculadorDeImposto {

	public void realizaCalculo (Orcamento orcamento, Imposto imposto) {

		double total = imposto.calcula(orcamento);
		System.out.println(total);
	}


}
