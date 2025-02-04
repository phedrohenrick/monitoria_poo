package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Empregado;
import model.Fornecedor;
import model.Pessoa;
import view.TelaFornecedor;
import view.ExibirTabela;

public class FornecedorController {

    private TelaFornecedor telaFonecedor;
    private Pessoa pessoa = new Pessoa();
    private ArrayList<Empregado> listaEmpregados = new ArrayList<>();
    private ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();
        
    
    public FornecedorController(TelaFornecedor telaFornecedor, Pessoa pessoa, ArrayList<Empregado> listaEmpregados,  ArrayList<Fornecedor> listaFornecedores){
        this.telaFonecedor = telaFornecedor;
        this.pessoa = pessoa;
        this.listaEmpregados = listaEmpregados;
        this.listaFornecedores = listaFornecedores;
        initController();

    }

    public void initController(){
        telaFonecedor.getBtnSair().addActionListener(e ->System.exit(0));
        telaFonecedor.getBtnSalvar().addActionListener(e -> {
            try {
                handleFornecedor();
            } catch (ExceptionController e1) {
                e1.printStackTrace();
            }
        });
    }

    public ArrayList<Empregado> getListaEmpregados() {
        return listaEmpregados;
    }
    public void setListaEmpregados(ArrayList<Empregado> listaEmpregados) {
        this.listaEmpregados = listaEmpregados;
    }
    public ArrayList<Fornecedor> getListaFornecedores() {
        return listaFornecedores;
    }
    public void setListaFornecedores(ArrayList<Fornecedor> listaFornecedores) {
        this.listaFornecedores = listaFornecedores;
    }
            public Pessoa getPessoa() {
                return pessoa;
            }
        
            public void setPessoa(Pessoa pessoa) {
                this.pessoa = pessoa;
            }
        
        
            public TelaFornecedor getTelaFonecedor() {
                return telaFonecedor;
            }
        
            public void setTelaFonecedor(TelaFornecedor telaFonecedor) {
                this.telaFonecedor = telaFonecedor;
            }
        
           
        
            public void handleFornecedor() throws ExceptionController{
                    
                    String creadito = telaFonecedor.getValorCredito().getText();
                    String divida = telaFonecedor.getValorDivida().getText();
        
                    //ao salvar verifica se os campos sao vazios
                    if (creadito.isEmpty() || divida.isEmpty() ) {
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }else {
                        
                        try {
                            Double valorCredito = Double.parseDouble(creadito);
                            Double valorDivida = Double.parseDouble(divida);
                              
                              Fornecedor funcionario1 = new Fornecedor();
                              funcionario1.setNome(pessoa.getNome());
                              funcionario1.setEndereco(pessoa.getEndereco());
                              funcionario1.setTelefone(pessoa.getTelefone());
                              funcionario1.setValorCredito(valorCredito);
                              funcionario1.setValorDivida(valorDivida);
                              
                              //JOptionPane.showMessageDialog(null, funcionario1.toString());
                                ExibirTabela(listaFornecedores, listaEmpregados);
			    	   //System.exit(0);
	        	}catch (Exception e2) {
					
                    throw new ExceptionController("Caracteres nao aceitos, entre com outros valores e tente novamente");
				}
	        	
	            
	            
	        }

           

        	// limpando os campos - função
            telaFonecedor.getValorCredito().setText("");
            telaFonecedor.getValorDivida().setText("");
              		
    }


 public void ExibirTabela(ArrayList<Fornecedor> listaFornecedores, ArrayList<Empregado> listaEmpregados) {

                //btnSalvar.addActionListener(e -> new ExibirTabela(this.listaEmpregados, this.listaFornecedores));
                ExibirTabela a = new ExibirTabela(listaEmpregados, listaFornecedores);
        
            }

}
