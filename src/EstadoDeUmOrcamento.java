
/**
 * @Author Thiago G.
 * 11 de set de 2019
 */
public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);
}
