import java.util.ArrayList;

import prova2.Biblioteca;
import prova2.DVD;
import prova2.Emprestimo;
import prova2.FactoryItem;
import prova2.Item;
import prova2.Livro;
import prova2.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

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

    }
}
