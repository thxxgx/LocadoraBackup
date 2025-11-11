package locadora.view;

import java.util.Scanner;
import locadora.model.*;
import locadora.service.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocadoraService service = LocadoraService.getInstancia();
        ServicoLocacao servico = new ServicoLocacao(service);

        System.out.println("\n   Bem vindo(a) a locadora!");
        System.out.println("____________________________________");
        System.out.println("\nFilmes disponíveis:");
        System.out.println("1 - Ilha do Medo");
        System.out.println("2 - Clube da Luta");
        System.out.println("3 - Cisne Negro");
        System.out.print("\nDigite o número do filme que deseja alugar: ");

        int opcao = sc.nextInt();
        sc.nextLine(); 

        String nomeFilme = switch (opcao) {
            case 1 -> "Ilha do Medo";
            case 2 -> "Clube da Luta";
            case 3 -> "Cisne Negro";
            default -> null;
        };

        if (nomeFilme == null) {
            System.out.println("Opção inválida. Volte outro dia...");
            sc.close();
            return;
        }

        System.out.print("\nDigite seu nome para confirmar a locação: ");
        String nomeCliente = sc.nextLine();

        Cliente cliente = LocadoraFactory.criarCliente(nomeCliente);
        Filme filme = LocadoraFactory.criarFilme(nomeFilme);
        Locacao locacao = LocadoraFactory.criarLocacao(cliente, filme);

        servico.registrarLocacao(locacao);

        System.out.println("\n_____________________________________");
        System.out.println("Locação concluída com sucesso ^^");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Você tem 7 dias para a devolução do filme!");
        System.out.println("_____________________________________");

        sc.close();
    }
}
