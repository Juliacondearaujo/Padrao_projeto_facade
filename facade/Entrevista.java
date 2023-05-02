package padroesestruturais_exercicios.facade;


public class Entrevista extends Requisito{
    private static Entrevista entrevista = new Entrevista();

    private Entrevista() {};

    public static Entrevista getInstancia() {
        return entrevista;
    }
}
