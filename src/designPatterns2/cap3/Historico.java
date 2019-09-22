package designPatterns2.cap3;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<Estado> estadoSalvos =  new ArrayList<Estado>();

    public void adiciona(Estado estado) {
        estadoSalvos.add(estado);
    }

    public Estado pega(int index){
        return estadoSalvos.get(index);
    }
}
