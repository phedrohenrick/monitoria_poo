package prova2;

import java.security.InvalidAlgorithmParameterException;

public class FactoryItem {
    public Item criaItem(String tipo) throws Exceptiont, InvalidAlgorithmParameterException{
        Item item;
        if(tipo.equalsIgnoreCase("livro")){
            return item = new Livro();
        }else if(tipo.equalsIgnoreCase("dvd")){
            return item = new DVD();
        }else if(tipo.equalsIgnoreCase("revista")){
            return item = new Revista();
        }
            throw new Exceptiont ("tipo de item inválido");
    }
}
