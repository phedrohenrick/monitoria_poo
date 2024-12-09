import Questao1.Pessoa;
import Questao2.Fornecedor;
import Questao3.Empregado;

public class App {
    public static void main(String[] args) throws Exception {
        

        // Pessoa boy = new Pessoa("phedro", 20, 711560919);
        // System.out.println(boy);

        //  Fornecedor rioV = new Fornecedor("phedro", 20, 20, 100, 90);
        //  System.out.println(rioV);

        Pessoa empregado1 = new Empregado("joao", 20, 10000, 2, 2000.90, 12.0);
        System.out.println(empregado1);
    }
}
