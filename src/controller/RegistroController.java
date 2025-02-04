package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import factory.FactoryFuncionario;
import model.Empregado;
import model.Fornecedor;
import view.TelaEmpregado;
import view.TelaFornecedor;
import view.TelaRegistro;

public class RegistroController {

    private TelaRegistro telaRegistro; //servirá para injeção de dependências

    private ArrayList<Empregado> listaEmpregados ;
    private ArrayList<Fornecedor> listaFornecedores;

    public RegistroController(TelaRegistro telaRegistro) {

        this.telaRegistro = telaRegistro;
        this.listaEmpregados = new ArrayList<>();
        this.listaFornecedores = new ArrayList<>();
        initController();

    }

    public void initController() {
        telaRegistro.getBtnSair().addActionListener(e -> System.exit(0));
        telaRegistro.getBtnSalvar().addActionListener(e -> {
            try {
                handleSalvar();
            } catch (ExceptionController e1) {
                // TODO Auto-generated catch block
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
	  
		 public void abrirTelaEmpregado(Empregado pessoa) {
				  TelaEmpregado registrarEmpregado = new TelaEmpregado(pessoa, this.listaFornecedores, this.listaEmpregados);
                  
		 }
		 public void abrirTelaFornecedor(Fornecedor pessoa) {
			TelaFornecedor registrarFornecedor = new TelaFornecedor(pessoa, this.listaFornecedores, this.listaEmpregados);

		 }

         public void handleSalvar() throws ExceptionController {
             
		        String nome = telaRegistro.getCampoNome().getText();
		        String telefone = telaRegistro.getCampoTelefone().getText();
		        String endereco = telaRegistro.getCampoEndereco().getText();

	        	//ao salvar verifica se os campos sao vazios
	        	if (nome.isEmpty() || telefone.isEmpty() || endereco.isEmpty()) {
                    throw new ExceptionController("Preencha todos os campos!");
		        }else {

		            // verifica qual dos dois objetos serão instanciados - função
		           if(telaRegistro.getEmpregado().isSelected()) {
                  
                    criaEmpregado(nome, telefone, endereco );
		        	   
		           }else if(telaRegistro.getFornecedor().isSelected()) {
		        	   
                    criaFornecedor(nome, telefone, endereco );
		        	   
		           }
		           
		        }

	        	// limpando os campos - função
	            telaRegistro.getCampoNome().setText("");
	            telaRegistro.getCampoTelefone().setText("");
	            telaRegistro.getCampoEndereco().setText("");
	              		
	       
         }

         public void criaFornecedor(String nome, String telefone, String endereco){
            Fornecedor pessoa = (Fornecedor) FactoryFuncionario.criarFuncinario("Fornecedor");
            pessoa.setNome(nome);
            pessoa.setTelefone(telefone);
            pessoa.setEndereco(endereco);
            listaFornecedores.add((Fornecedor) pessoa);
            
            abrirTelaFornecedor(pessoa);

         }

         public void criaEmpregado(String nome, String telefone, String endereco){
            Empregado pessoa = (Empregado) FactoryFuncionario.criarFuncinario("Empregado");
            pessoa.setNome(nome);
            pessoa.setTelefone(telefone);
            pessoa.setEndereco(endereco);
            listaEmpregados.add((Empregado) pessoa); //sertve meio que uma lista auxiliar para enviar para o model

            abrirTelaEmpregado(pessoa);
         
         }
         
}
