package model;

public class Fornecedor extends Pessoa  {

    private double valorDivida;
    private double valorCredito;

    public Fornecedor(String nome, String telefone, String endereco, double valorCredito, double valorDivida){
            super(nome, telefone, endereco);
            setValorCredito(valorCredito);
            setValorDivida(valorDivida);
    }
    
    	public Fornecedor() {
            
    	}
    	
    	public Fornecedor(String nome, String telefone, String endereco) {
            
    	}

    public void setValorDivida(double valorDivida){
        this.valorDivida = valorDivida;
    }

    public double getValorDivida(){
        return valorDivida;
    }

    public void setValorCredito(double valorCredito){
        this.valorCredito = valorCredito;
    }

    public double getValorCredito(){
        return valorCredito;
    }

    public double obterSaldo(){
    	double saldo =  getValorCredito() - getValorDivida();
        return saldo;
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        ". Tem um credito de "+ 
        getValorCredito()+ " e um saldo de " +
        obterSaldo();
    }
}
