package designPatterns2.cap2;

import java.util.Arrays;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        final NotasMusicais notas = new NotasMusicais();
        List<Nota> musica = Arrays.asList(notas.pega("do"),
                notas.pega("re"),
                notas.pega("mi"),
                notas.pega("fa"),
                notas.pega("fa"),
                notas.pega("fa"),

                notas.pega("do"),
                notas.pega("re"),
                notas.pega("do"),
                notas.pega("re"),
                notas.pega("re"),
                notas.pega("re"),

                notas.pega("do"),
                notas.pega("sol"),
                notas.pega("fa"),
                notas.pega("mi"),
                notas.pega("mi"),
                notas.pega("mi"),

                notas.pega("do"),
                notas.pega("re"),
                notas.pega("mi"),
                notas.pega("fa"),
                notas.pega("fa"),
                notas.pega("fa"));
        System.out.println(musica);
        final Piano piano = new Piano();
        piano.toca(musica);



    }
}
