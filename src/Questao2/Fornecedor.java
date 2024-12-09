package Questao2;

import Questao1.Pessoa;

public class Fornecedor extends Pessoa  {

    private int valorDivida;
    private int valorCredito;

    public Fornecedor(String nome, int idade, int cpf, int valorCredito, int valorDivida){
            super(nome, idade, cpf);
            setValorCredito(valorCredito);
            setValorDivida(valorDivida);
    }

    public void setValorDivida(int valorDivida){
        this.valorDivida = valorDivida;
    }

    public int getValorDivida(){
        return valorDivida;
    }

    public void setValorCredito(int valorCredito){
        this.valorCredito = valorCredito;
    }

    public int getValorCredito(){
        return valorCredito;
    }

    public int valorSaldo(){
        int saldo =  getValorCredito() - getValorDivida();
        return saldo;
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        ". Tem um credito de "+ 
        getValorCredito()+ " e um saldo de " +
        valorSaldo();
    }
}
