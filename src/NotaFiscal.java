import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private LocalDateTime dataDeEmssao;
    private double valorBruto;
    public List<ItemDaNota> itens;
    public String observacoes;

    public NotaFiscal() {

    }


    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public LocalDateTime getDataDeEmssao() {
        return dataDeEmssao;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public double getImpostos() {
        return impostos;
    }

    public List<ItemDaNota> getItens() {
        return itens;
    }

    public String getObservacoes() {
        return observacoes;
    }

    private double impostos;

    public NotaFiscal(String razao_social, String cnpj, LocalDateTime data, Double valorTotal, double impostos, List<ItemDaNota> itens, String obs) {
        this.itens = itens;
        this.razaoSocial = razao_social;
        this.cnpj = cnpj;
        this.dataDeEmssao = data;
        this.valorBruto = valorTotal;
        this.impostos = impostos;
        this.observacoes = obs;
    }


    @Override
    public String toString() {
        return "NotaFiscal{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dataDeEmssao=" + dataDeEmssao +
                ", valorBruto=" + valorBruto +
                ", itens=" + itens +
                ", observacoes='" + observacoes + '\'' +
                ", impostos=" + impostos +
                '}';
    }
}
