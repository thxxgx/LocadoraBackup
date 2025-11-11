package locadora.service;

import locadora.model.Cliente;
import locadora.model.Filme;
import locadora.model.Locacao;

public class LocadoraFactory {
    public static Cliente criarCliente(String nome) {
        return new Cliente(nome);
    }

    public static Filme criarFilme(String titulo) {
        return new Filme(titulo);
    }

    public static Locacao criarLocacao(Cliente cliente, Filme filme) {
        return new Locacao(cliente, filme);
    }
}
