
---

# Treinamento para Prova 2

Esta branch contém a implementação de um sistema de gerenciamento de biblioteca, conforme o pedido do professor para a **Prova 2**. A aplicação visa simular a operação de uma biblioteca com funcionalidades como cadastro de livros, empréstimos e devoluções.

## Objetivos da Atividade

O objetivo deste projeto é treinar os seguintes conceitos de programação orientada a objetos:

- **Exceções**: O código lida com diferentes tipos de erros de forma controlada, garantindo que a aplicação seja robusta.
- **Interface**: A utilização de interfaces para definir contratos de comportamento e permitir a implementação flexível de diferentes tipos de operações.
- **Polimorfismo**: Demonstração do polimorfismo através de métodos sobrecarregados e sobrescritos, permitindo flexibilidade nas operações com diferentes tipos de objetos.
- **Agregação**: Implementação de agregação onde objetos podem conter outros objetos como parte de sua estrutura, mas mantendo independência entre eles.
- **Composição**: Demonstração de composição, onde a existência de um objeto depende diretamente de outro, formando uma relação de forte dependência.
- **Associação**: Relações entre classes são modeladas, como por exemplo, livros e usuários que podem ser associados.
- **Padrão Fábrica de Objetos**: Uso do padrão **Factory Method** para criar instâncias de objetos, promovendo a flexibilidade na criação de diferentes tipos de livros ou usuários sem modificar o código cliente.
- **Herança**: Utilização de herança para compartilhar comportamentos comuns entre diferentes tipos de livros e usuários, evitando repetição de código.

## Funcionalidades Implementadas

- **Cadastro de Livros**: É possível cadastrar livros com informações como título, autor, e número de cópias disponíveis.
- **Empréstimo de Livros**: Os usuários podem emprestar livros, desde que haja cópias disponíveis.
- **Devolução de Livros**: Os usuários podem devolver os livros emprestados.


## Estrutura do Código

- **Classes Principais**:
  - **Livro**: Representa os livros cadastrados na biblioteca.
  - **Usuário**: Representa os usuários da biblioteca, que podem realizar empréstimos e devoluções.
  - **Biblioteca**: Responsável por gerenciar o sistema de livros e usuários.
  - **Sistema de Empréstimos**: Realiza o gerenciamento de empréstimos e devoluções.
  
- **Exceções**:
  - **LivroNaoDisponivelException**: Lançada quando um livro não está disponível para empréstimo.
  - **UsuarioNaoEncontradoException**: Lançada quando um usuário não é encontrado no sistema.

- **Interfaces**:
  - **Operacao**: Interface que define o método `executar()`, que é implementado por diferentes operações (como empréstimo e devolução).
  
- **Padrão de Projeto**:
  - **Factory Method**: Implementado na criação de diferentes tipos de objetos, como diferentes tipos de livros.

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/usuario/repositorio.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd nome-do-projeto
   ```

3. Compile e execute a aplicação de acordo com o ambiente de desenvolvimento.

4. Siga as instruções no código-fonte para interagir com o sistema de biblioteca.

## Exemplo de Uso

```java
FactoryItem factory = new FactoryItem();
        Biblioteca municipal = new Biblioteca();
        Usuario user1 = new Usuario("phedro");

        Livro l1 = new Livro();
        l1.setTitulo("O Senhor dos Anéis");
        l1.emprestar();
        l1.getInformacao();
        
        Livro l2 = new Livro();
        l2.setTitulo("O Hobbit");
        l2.emprestar();
        l2.getInformacao();
        l2.devolver();
        l2.getInformacao();
        
     Item i3 = factory.criaItem("dvd");
     if (i3 instanceof DVD){
           ((DVD)i3).reproduzir();
            i3.setTitulo("indiana jones");
            i3.emprestar();
         }

        //Aqui temos uma associação, onde o usuário empresta um livro
        System.out.println("o livro: " + l1.getTitulo() + " foi emprestado para: " + user1.getNome());
        System.out.println("Quantidade de Itens emprestados: " + Biblioteca.getItensEmprestados());
        
        //aqui temos uma relação de Agregação (Relacionamento "tem um")
        Usuario user2 = new Usuario("jose", l2);

        //aqui temos uma relação de Composição (Relacionamento "faz parte de")
        Item item = Biblioteca.adiconarItens("dvd", "moana");
        Emprestimo e1 = new Emprestimo(user1, item);

       ArrayList<Emprestimo> em = new ArrayList<>();
       em.add(e1);
       em.get(0).getUsuario();
       e1.getUsuario();
```

## Conclusão

Este projeto foi desenvolvido para aplicar e consolidar os conceitos de **programação orientada a objetos**, além de ser um ótimo exercício para a preparação da **Prova 2**. Ele aborda uma série de práticas importantes, como o uso de padrões de projeto, manipulação de exceções e a organização de código por meio de herança, composição, agregação e interfaces.

---