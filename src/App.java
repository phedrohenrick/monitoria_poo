import Questao1.Pessoa;
import Questao2.Fornecedor;
import Questao3.Empregado;
import Questao4.Administrador;
import Questao5.Operario;

public class App {
    public static void main(String[] args) throws Exception {
        

        Pessoa boy = new Pessoa("phedro", 22, 711560919);
        System.out.println(boy);

        Fornecedor rioV = new Fornecedor("henrick", 19, 711567919, 100, 90);
         System.out.println(rioV);

        Pessoa empregado1 = new Empregado("joao", 20, 711260919, 2, 2000.90, 12.0);
        System.out.println(empregado1);

        Administrador admin1 = new Administrador("leal", 30, 564123987, 3, 5000, 11, 200);
        System.out.println(admin1);

        Pessoa op1 = new Operario("silva", 40, 564123987, 7, 2500, 1, 1000, 100000);
        System.out.println(op1);
    }
}
