package Questao6;

import Questao3.Empregado;

public class Vendedor extends Empregado{
    private int comissao;
    private int valorVenda;
   
    public Vendedor(String nome, String telefone, String endereco, int imposto,
     double salarioBase, double CodigoSetor, int comissao, int valorProducao){
        super(nome, telefone, endereco, imposto, salarioBase, CodigoSetor);
        setComissao(comissao);
        setValorVenda(valorProducao);
    }
    
    public Vendedor() {
    	
    }

    public int getComissao() {
        return this.comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public int getValorVenda() {
        return this.valorVenda;
    }

    public void setValorVenda(int valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public double calcularSalario(){
        double salario = 0.0;
        salario = getSalarioBase() - ((getImposto()*getSalarioBase())/100) + getComissao() ;
        return salario;
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        " com uma comissão de "+
        getComissao() +
        " valor de Vendas de " +
        getValorVenda();
    }

}
