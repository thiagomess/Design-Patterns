package designPatterns2.cap2;

import org.jfugue.player.Player;

import java.util.List;
import java.util.stream.Collectors;

public class Piano {

    public void toca(List<Nota> musica){
        Player player = new Player();

        final String musicaEmNotas = musica.stream()
                .map(e -> String.valueOf(e.simbolo())) //Tranforma a lista em String
                .collect(Collectors.joining(" "));// concaterna os dados em uma string

        System.out.println(musicaEmNotas);

        player.play(musicaEmNotas);
    }
}
