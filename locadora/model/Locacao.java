package locadora.model;

public class Locacao {
    private Cliente cliente;
    private Filme filme;

    public Locacao(Cliente cliente, Filme filme) {
        this.cliente = cliente;
        this.filme = filme;
    }

    @Override
    public String toString() {
        return cliente.getNome() + " locou " + filme.getTitulo();
    }
}
