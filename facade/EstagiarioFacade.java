package padroesestruturais_exercicios.facade;



public class EstagiarioFacade {

    public static boolean verificarPendenciasContratacao(Estagiario estagiario) {
        if (Entrevista.getInstancia().verificarEstagiarioComPendencia(estagiario)) {
            return false;
        }
        if (Prova.getInstancia().verificarEstagiarioComPendencia(estagiario)) {
            return false;
        }
        if (Documentacao.getInstancia().verificarEstagiarioComPendencia(estagiario)) {
            return false;
        }
        return true;
    }
}
