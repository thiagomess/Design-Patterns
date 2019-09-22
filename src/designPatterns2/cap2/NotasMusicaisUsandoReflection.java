package designPatterns2.cap2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasMusicaisUsandoReflection {

    private static Map<String, Nota> notas = new HashMap<String, Nota>();

    private static List<Class<? extends Nota>> clazzes;

    //Desse modo só instancia as classes que realmente vai utilizar
    static {
        clazzes = Arrays.asList(
                Do.class, Re.class, Mi.class, Fa.class,
                Sol.class, La.class, Si.class);
    }

    public Nota pega(String nome) {
        try {
            if (!notas.containsKey(nome)) {
                for (Class<? extends Nota> clazz : clazzes) {
                    if (clazz.getSimpleName().toLowerCase().equals(nome)) {
                        notas.put(nome, (Nota) clazz.newInstance());
                        break;
                    }
                }
            }
            return notas.get(nome);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
