package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametroTeste {

    @Test
    public void deveRetornarNomeEmpresa() {
        Parametro.getInstance().setNomeEmpresa("Empresa 1");
        assertEquals("Empresa 1", Parametro.getInstance().getNomeEmpresa());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Parametro.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", Parametro.getInstance().getUsuarioLogado());
    }

}