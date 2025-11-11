package locadora.service;

import java.util.ArrayList;
import java.util.List;
import locadora.model.Locacao;

public class LocadoraService {
    private static LocadoraService instancia;
    private List<Locacao> locacoes;

    private LocadoraService() {
        locacoes = new ArrayList<>();
    }

    public static LocadoraService getInstancia() {
        if (instancia == null) {
            instancia = new LocadoraService();
        }
        return instancia;
    }

    public void adicionarLocacao(Locacao locacao) {
        locacoes.add(locacao);
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }
}
