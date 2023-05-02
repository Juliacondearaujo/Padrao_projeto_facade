package padroesestruturais_exercicios.facade;


public class Prova extends Requisito{

    private static Prova prova = new Prova();

    private Prova() {};

    public static Prova getInstancia() {
        return prova;
    }


}
