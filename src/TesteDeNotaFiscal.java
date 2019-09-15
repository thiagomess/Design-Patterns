public class TesteDeNotaFiscal {

    public static void main(String[] args) {


        NotaFiscalBuilder builder = new NotaFiscalBuilder();
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
