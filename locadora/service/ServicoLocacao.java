package locadora.service;

import locadora.model.*;

public class ServicoLocacao {
    private LocadoraService service;

    public ServicoLocacao(LocadoraService service) {
        this.service = service;
    }

    public void registrarLocacao(Locacao locacao) {
        service.adicionarLocacao(locacao);
    }
}
