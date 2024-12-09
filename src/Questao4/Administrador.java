package Questao4;

import Questao3.Empregado;

public class Administrador extends Empregado{

    private double ajudaDeCusto;

    public Administrador(String nome, int idade, int cpf, int imposto, double salarioBase, double CodigoSetor, double ajudaDeCusto){
        super(nome, idade, cpf, imposto, salarioBase, CodigoSetor);
        setAjudaDeCusto(ajudaDeCusto);
    }

    public double getAjudaDeCusto() {
        return this.ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario(){
        double salario = 0.0;
        salario = getSalarioBase() - ((getImposto()*getSalarioBase())/100) + getAjudaDeCusto() ;
        return salario;
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        " com uma ajuda de custo de "+
        getAjudaDeCusto();
    }
}
