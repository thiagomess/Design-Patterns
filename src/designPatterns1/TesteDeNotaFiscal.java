package designPatterns1;

import java.util.Arrays;
import java.util.List;

public class TesteDeNotaFiscal {

    public static void main(String[] args) {


        List<AcaoAposGerarNota> lista = Arrays.asList(new EnviadorDeEmail(), new EnviadorDeSms(),
                new NotaFiscalDAO(), new Impressora());
        final NotaFiscalBuilder builder = new NotaFiscalBuilder(lista);
        builder.paraEmpresa("Caelum Ensino")
        .comCnpj("12.345.678/0001-12")
        .comItem(new ItemDaNota("item 1", 100.0))
        .comItem(new ItemDaNota("item 2", 200.0))
        .comItem(new ItemDaNota("item 3", 300.0))
        .comItem(new ItemDaNota("item 4", 400.0))
        .comObservarcoes("Teste")
        .naDataAtual();
        final NotaFiscal constroi = builder.constroi();

        System.out.println(constroi.toString());



    }
}
