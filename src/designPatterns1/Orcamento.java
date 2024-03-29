package designPatterns1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Orcamento {

	protected double valor;
	private final List<Item> itens;
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<>();
		estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens) ;
	}
	
	public void adiciona(Item item) {
		itens.add(item);
	}

	/**
	 * 
	 */
	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
	
}
