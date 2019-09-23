package designPatterns2.cap8;

public class Programa {

    public static void main(String[] args) {


        EmpresaFacade fachada = new EmpresaFacadeSingleton().getInstancia();
        fachada.geraCobranca();



    }
}
