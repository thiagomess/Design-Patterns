package designPatterns2.cap4;

public class Programa {

    public static void main(String[] args) {

        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));

        Expressao direta = new Soma(new Numero(2), new Numero(10));

        Expressao soma = new Soma(esquerda, direta);

        final int resultado = soma.avalia();

        System.out.println(resultado);

    }
}
