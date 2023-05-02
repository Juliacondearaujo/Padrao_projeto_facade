package padroesestruturais_exercicios.facade;


import java.util.ArrayList;
import java.util.List;

public abstract class Requisito {

    private List<Estagiario> estagiarioComPendencia = new ArrayList<Estagiario>();

    public void addEstagiarioPendente(Estagiario estagiario) {
        this.estagiarioComPendencia.add(estagiario);
    }

    public boolean verificarEstagiarioComPendencia(Estagiario estagiario) {
        return this.estagiarioComPendencia.contains(estagiario);
    }
}
