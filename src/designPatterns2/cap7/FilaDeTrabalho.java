package designPatterns2.cap7;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {

    private List<Comando> comandos;

    public FilaDeTrabalho() {
        this.comandos = new ArrayList<>();
    }

    public void adiciona(Comando comando){
        this.comandos.add(comando);
    }

    public void processa(){
        comandos.stream().forEach(e -> e.executa());
    }


}
