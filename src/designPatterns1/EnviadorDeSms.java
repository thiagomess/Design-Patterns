package designPatterns1;

public class EnviadorDeSms implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Enviei por SMS");
    }
}
