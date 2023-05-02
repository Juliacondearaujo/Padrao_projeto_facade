package padroesestruturais_exercicios.facade;


public class Estagiario {

    public boolean contratacao() {
        return EstagiarioFacade.verificarPendenciasContratacao(this);
    }
}
