package designPatterns2.cap3;

import java.util.Calendar;

public class Programa {

    public static void main(String[] args) {

        final Historico historico = new Historico();
        Contrato c1 = new Contrato(Calendar.getInstance(), "Thiago", TipoContrato.NOVO);
        historico.adiciona(c1.salvaEstado());
        System.out.println(c1.getTipo());

        c1.avanca();
        historico.adiciona(c1.salvaEstado());
        System.out.println(c1.getTipo());

        final Estado estadoAnterior = historico.pega(0);
        System.out.println(estadoAnterior.getEstado().getTipo());

        c1.restaura(estadoAnterior);
        c1.avanca();
        System.out.println(c1.getTipo());

    }

}
