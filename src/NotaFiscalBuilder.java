import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    List<ItemDaNota> todosItents = new ArrayList<>();
    private double impostos;
    private Double valorBruto;
    private String observacoes;
    private LocalDateTime data;

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
    public NotaFiscalBuilder comItem(ItemDaNota item){
        todosItents.add(item);
        valorBruto = todosItents.stream()
                .map(ItemDaNota::getValor)
                .reduce(0.0, Double::sum);
        impostos += item.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuilder comObservarcoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naDataAtual(){
        data = LocalDateTime.now();
        return this;
    }

    public NotaFiscal constroi(){
        return new NotaFiscal(razaoSocial, cnpj, data,  valorBruto,  impostos, todosItents, observacoes);
    }
}
