package designPatterns2.cap4;

public class Numero implements Expressao {


    private int numero;

    public Numero(int i) {
        numero = i;
    }

    @Override
    public int avalia() {
        return numero;
    }

    @Override
    public void aceita(Visitor impressora) {
        impressora.visitaNumero(this);
    }

    public int getNumero() {
        return numero;
    }
}
