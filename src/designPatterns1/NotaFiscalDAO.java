package designPatterns1;

public class NotaFiscalDAO implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Salvei no banco");
    }
}
