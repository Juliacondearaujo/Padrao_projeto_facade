package padroesestruturais_exercicios.facade;


public class Documentacao extends Requisito{

    private static Documentacao documentacao = new Documentacao();

    private Documentacao() {};

    public static Documentacao getInstancia() {
        return documentacao;
    }
}
