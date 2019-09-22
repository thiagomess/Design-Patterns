package designPatterns2.cap6;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps implements Mapa {
    @Override
    public String devolveMapa(String rua) {
        String googleMaps = "https://maps.google.com/maps?q=rua+vergueiro";

        URL url = null;
        try {
            url = new URL(googleMaps);
            InputStream openStream = url.openStream();
            //.....
            return "mapa";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
