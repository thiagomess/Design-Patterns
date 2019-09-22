package designPatterns2.cap6;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Calendar;

public class Programa {

    public static void main(String[] args) throws Exception {

        Mapa mapa = new GoogleMaps();
        mapa.devolveMapa("Rua vergueiro");

        final Relogio relogio = new RelogioDoSistema();
        final Calendar dataHoje = relogio.hoje();
        System.out.println(dataHoje.getTime());

    }
}
