# Sistema de Locadora de Filmes

Este é um sistema de locadora de filmes simples, desenvolvido em Java, que permite registrar locações de clientes. O projeto implementa 3 padrões de projeto e 1 princípio SOLID conforme os critérios da disciplina.

## Entidades principais

- Cliente: representa o cliente que realiza a locação.
- Filme: representa os filmes disponíveis na locadora.
- Locacao: representa a locação realizada, relacionando Cliente e Filme.

## Padrões de projeto utilizados

- Singleton  
  Classe: LocadoraService  
  Contexto: Garantir que exista apenas uma instância responsável por gerenciar todas as locações.  
  Benefício: Centraliza e controla as locações evitando inconsistências.

- Factory Method  
  Classe: LocadoraFactory  
  Contexto: Criar objetos de Cliente, Filme e Locacao de forma centralizada.  
  Benefício: Desacopla a criação de objetos da lógica da aplicação, facilitando futuras alterações.

- Dependency Injection  
  Classe: ServicoLocacao  
  Contexto: Recebe LocadoraService via construtor, evitando criar instâncias diretamente.  
  Benefício: Reduz acoplamento, permitindo trocar facilmente implementações e facilitar testes.

## Princípio SOLID aplicado

- Single Responsibility Principle (SRP)  
  - LocadoraService só gerencia locações.  
  - ServicoLocacao só gerencia regras de negócio da locação.  
  - Main só gerencia interação com o usuário.  
  Benefício: Cada classe possui uma única responsabilidade, facilitando manutenção e evolução do sistema.

## Como executar

No Visual Studio Code, vá até a opção "Run" e clique em "Start Debugging".
