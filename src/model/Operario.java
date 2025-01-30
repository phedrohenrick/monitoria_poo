package model;

public class Operario extends Empregado {
    private int comissao;
    private int valorProducao;

    public Operario(String nome, String telefone, String endereco, int imposto,
     double salarioBase, double CodigoSetor, int comissao, int valorProducao){

        super(nome, telefone, endereco, imposto, salarioBase, CodigoSetor);
        setComissao(comissao);
        setValorProducao(valorProducao);
        
    }
    
    public  Operario() {
		
	}

    public int getComissao() {
        return this.comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public int getValorProducao() {
        return this.valorProducao;
    }

    public void setValorProducao(int valorProducao) {
        this.valorProducao = valorProducao;
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
        " valor de produção de " +
        getValorProducao();
    }
}
