package prova2;

import java.security.InvalidAlgorithmParameterException;

public class Biblioteca implements InformacaoItem{
   private  static int itensEmprestados = 0;

    public static int getItensEmprestados() {
        return itensEmprestados;
    }
    public Biblioteca() {
       
    }
    public void emprestarItem(){
        itensEmprestados++;
    }
    public void devolverItem(){
        itensEmprestados--;
    }
    @Override
    public void getInformacao() {
        System.out.println("Quantidade de Itens emprestados: " + itensEmprestados);
    }

     public static Item adiconarItens(String tipo, String titulo) throws InvalidAlgorithmParameterException{
        Item item;
        if(tipo.equalsIgnoreCase("livro")){
            return item = new Livro(titulo);
        }else if(tipo.equalsIgnoreCase("dvd")){
            return item = new DVD(titulo);
        }else if(tipo.equalsIgnoreCase("revista")){
            return item = new Revista(titulo);
        }
            throw new InvalidAlgorithmParameterException("tipo de item inválido");
     }

}
