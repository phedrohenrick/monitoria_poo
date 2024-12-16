package Questao4;

import java.awt.Component;

import Questao3.Empregado;

public class Administrador extends Empregado{

    private double ajudaDeCusto;

    public Administrador(String nome, String telefone, String endereco, int imposto, double salarioBase, double CodigoSetor, double ajudaDeCusto){
        super(nome, telefone, endereco, imposto, salarioBase, CodigoSetor);
        setAjudaDeCusto(ajudaDeCusto);
        
    }
    
    public Administrador() {
    	
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
        salario = (getSalarioBase() - ((getImposto()*getSalarioBase())/100))+ getAjudaDeCusto() ;
        return salario;
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        " com uma ajuda de custo de "+
        getAjudaDeCusto();
    }
}
