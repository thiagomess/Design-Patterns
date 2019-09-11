
/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public class SemDesconto implements Desconto {


	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		//Nao tem proximo	
	}

}
