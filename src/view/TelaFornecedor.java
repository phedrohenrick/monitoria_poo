package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Questao1.Pessoa;
import Questao2.Fornecedor;
import Questao3.Empregado;
import Questao5.Operario;
import factory.FactoryFuncionario;

public class TelaFornecedor extends JFrame {
	
	private JPanel form = new JPanel();
	private JTextField valorCredito = new JTextField();
	private JTextField valorDivida = new JTextField();
	
	private JPanel panelBotoes = new JPanel();
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnSair = new JButton("Sair");
	
	
	public TelaFornecedor(Fornecedor pessoa) {
		
		setTitle("Tela Fornecedor");
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);//localização relativa na tela, quando null ela fica no meio]
		
		
		form.setLayout(new GridLayout(6,2,5,5));
		
		form.add(new Label("Valor de Crédito do Fornecedor:"));
		form.add(valorCredito);
		
		form.add(new Label("Qual o valor da dívida do Fornecedor "));
		form.add(valorDivida);
		
        add(form, BorderLayout.CENTER);
        
        // Botões
        
        panelBotoes.add(btnSalvar);
        panelBotoes.add(btnSair);
        form.add(panelBotoes, BorderLayout.SOUTH);
        setVisible(true);

        btnSair.addActionListener(e -> System.exit(0));
        btnSalvar.addActionListener(e ->{ 
	        String creadito = valorCredito.getText();
	        String divida = valorDivida.getText();

        	//ao salvar verifica se os campos sao vazios
        	if (creadito.isEmpty() || divida.isEmpty() ) {
	            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
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
		 	    	  
		 	    	  JOptionPane.showMessageDialog(null, funcionario1.toString());   	  
			    	   System.exit(0);
	        	}catch (Exception e2) {
					JOptionPane.showMessageDialog(this, "Caracteres nao aceitos, entre com outros valores e tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
				}
	        	
	            
	            
	        }

        	// limpando os campos - função
            valorCredito.setText("");
            valorDivida.setText("");
              		
       });
        
		
	}

}
