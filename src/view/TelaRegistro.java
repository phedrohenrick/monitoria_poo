package view;

import javax.swing.*;
import Questao1.Pessoa;
import Questao2.Fornecedor;
import Questao3.Empregado;
import factory.FactoryFuncionario;

import java.awt.*;
import java.util.ArrayList;

public class TelaRegistro extends JFrame{
	
	
    private ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();
    private ArrayList<Empregado> listaEmpregados = new ArrayList<>();

	private JPanel form = new JPanel();

	private JTextField campoNome = new JTextField();
	private JTextField campoTelefone = new JTextField();
	private JTextField campoEndereco = new JTextField();
	
	private JPanel contratoPanel = new JPanel();
	private JRadioButton empregado = new JRadioButton("Empregado");
	private JRadioButton fornecedor = new JRadioButton("Fornecedor");
	private ButtonGroup contratoGroup = new ButtonGroup();
	
	private JPanel panelBotoes = new JPanel();
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnSair = new JButton("Sair");

	  public TelaRegistro() {
	        setTitle("Tela de Registro");
	        setSize(700, 500);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);


	        // Painel
	       form.setLayout(new GridLayout(6,2,5,5));
	       
	       //campos
	        form.add(new JLabel("Nome: "));
	        form.add(campoNome);

	        
	        form.add(new JLabel("Telefone: "));
	        form.add(campoTelefone);
	        
	        form.add(new JLabel("endereço: "));
			form.add(campoEndereco);
			
			form.add(new JLabel("Contrato:"));
	        contratoGroup.add(empregado);
	        contratoGroup.add(fornecedor);
	        contratoPanel.add(empregado);
	        contratoPanel.add(fornecedor);
	        form.add(contratoPanel);
	        
	        add(form, BorderLayout.CENTER);

	        
	        // Botões
	        
	        panelBotoes.add(btnSalvar);
	        panelBotoes.add(btnSair);
	        form.add(panelBotoes, BorderLayout.SOUTH);
	       

	        // Ação para abrior outras telas - Função
	       // Empregado.addActionListener(e -> abrirTelaEmpregado());
	       // Fornecedor.addActionListener(e -> abrirTelaFonecedor());
	        btnSair.addActionListener(e -> System.exit(0));
	        btnSalvar.addActionListener(e ->{ 
		        String nome = campoNome.getText();
		        String telefone = campoTelefone.getText();
		        String endereco = campoEndereco.getText();

	        	//ao salvar verifica se os campos sao vazios
	        	if (nome.isEmpty() || telefone.isEmpty() || endereco.isEmpty()) {
		            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
		        }else {
		            
		            
		            // verifica qual dos dois objetos serão instanciados - função
		           if(empregado.isSelected()) {
		        	   
		        	   Empregado pessoa = (Empregado) FactoryFuncionario.criarFuncinario("Empregado");
		        	   pessoa.setNome(nome);
		        	   pessoa.setTelefone(telefone);
		        	   pessoa.setEndereco(endereco);
		        	   listaEmpregados.add((Empregado) pessoa);					 
		        	   abrirTelaEmpregado(pessoa);
					
		        	   
		           }else if(fornecedor.isSelected()) {
		        	   
		        	   Fornecedor pessoa = (Fornecedor) FactoryFuncionario.criarFuncinario("Fornecedor");
		        	   pessoa.setNome(nome);
		        	   pessoa.setTelefone(telefone);
		        	   pessoa.setEndereco(endereco);
		        	   listaFornecedores.add((Fornecedor) pessoa);
					   abrirTelaFornecedor(pessoa);

		        	   
		           }
		           
		        }

	        	// limpando os campos - função
	            campoNome.setText("");
	            campoTelefone.setText("");
	            campoEndereco.setText("");
	              		
	       });
	        
	        setVisible(true);
	    }
	  	
	        
	        
		 public void ExibirTabela() {

			//btnSalvar.addActionListener(e -> new ExibirTabela(this.listaEmpregados, this.listaFornecedores));
			ExibirTabela a = new ExibirTabela(this.listaEmpregados, this.listaFornecedores);

		 }
	  
		 public void abrirTelaEmpregado(Empregado pessoa) {
				  TelaEmpregado registrarEmpregado = new TelaEmpregado(pessoa);
		 }
		 public void abrirTelaFornecedor(Fornecedor pessoa) {
			TelaFornecedor registrarFornecedor = new TelaFornecedor(pessoa);

		 }
}
