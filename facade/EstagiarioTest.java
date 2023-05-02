package padroesestruturais_exercicios.facade;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstagiarioTest {

    @Test
    void deveRetornarPendenciaProvaContratacao() {
        Estagiario estagiario = new Estagiario();
        Prova.getInstancia().addEstagiarioPendente(estagiario);

        assertEquals(false, estagiario.contratacao());
    }

    @Test
    void deveRetornarPendenciaEntrevistaContratacao() {
        Estagiario estagiario = new Estagiario();
        Prova.getInstancia().addEstagiarioPendente(estagiario);

        assertEquals(false, estagiario.contratacao());
    }

    @Test
    void deveRetornarPendenciaDocumentacaoContratacao() {
        Estagiario estagiario = new Estagiario();
        Prova.getInstancia().addEstagiarioPendente(estagiario);

        assertEquals(false, estagiario.contratacao());
    }



    @Test
    void deveRetornarEstagiarioSemPendenciaContratacao() {
        Estagiario estagiario = new Estagiario();

        assertEquals(true, estagiario.contratacao());
    }

}
