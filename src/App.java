import Questao1.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        

        Pessoa boy = new Pessoa("phedro", 20, 711560919);
        System.err.println(
        "o nome do garoto é "+ 
        boy.getNome() + 
        " ele tem "+ 
        boy.getIdade() +
        " anos. Seu cpf é "+ 
        boy.getCpf()
        );
    }
}
