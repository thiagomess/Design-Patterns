import java.util.Arrays;
import java.util.List;

public class TesteAcoes {

    public static void main(String[] args) {

        List<AcaoAposGerarNota> lista = Arrays.asList(new EnviadorDeEmail(), new EnviadorDeSms(),
                new NotaFiscalDAO(), new Impressora());

        final NotaFiscalBuilder builder = new NotaFiscalBuilder(lista);

        final NotaFiscal nf = builder.paraEmpresa("Caelum")
                .comCnpj("123456789")
                .comItem(new ItemDaNota("nome", 100))
                .comObservarcoes("obs")
                .naDataAtual()
                .constroi();

        System.out.println(nf.toString());


    }
}
