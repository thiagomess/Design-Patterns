package designPatterns2.cap4;

public class Subtracao implements Expressao {


    private Expressao esquerda;
    private Expressao direita;

    public Subtracao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int valorDaEsquerda = esquerda.avalia();
        int valorDaDireita = direita.avalia();

        return valorDaEsquerda - valorDaDireita;
    }

    @Override
    public void aceita(Visitor impressora) {
        impressora.visitaSubtracao(this);
    }

    public Expressao getDireita() {
        return direita;
    }

    public Expressao getEsquerda() {
        return esquerda;
    }
}
