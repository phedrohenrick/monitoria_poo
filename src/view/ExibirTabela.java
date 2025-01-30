package view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import model.Empregado;
import model.Fornecedor;
import model.Pessoa;

public class ExibirTabela extends JFrame {

	private DefaultListModel<String> modeloEmpregados;
	private DefaultListModel<String> modeloFornecedores;

		public ExibirTabela(){

		}
	    public ExibirTabela(ArrayList<Empregado> empregados, ArrayList<Fornecedor> fornecedores) {
            //JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");

	        setTitle("Gerenciamento de Pessoas");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        setLocationRelativeTo(null);

	        JTabbedPane abas = new JTabbedPane();

	        // Painel de Empregados
	        modeloEmpregados = new DefaultListModel<>();
	        JList<String> listaEmpregados = new JList<>(modeloEmpregados);
	        preencherLista(empregados, modeloEmpregados);
	        abas.addTab("Empregados", new JScrollPane(listaEmpregados));

	        // Painel de Fornecedores
	        modeloFornecedores = new DefaultListModel<>();
	        JList<String> listaFornecedores = new JList<>(modeloFornecedores);
	        preencherLista(fornecedores, modeloFornecedores);
	        abas.addTab("Fornecedores", new JScrollPane(listaFornecedores));

	        // Botões
	        JPanel panelBotoes = new JPanel();
	        JButton btnSair = new JButton("Sair");
	        panelBotoes.add(btnSair);
	        add(panelBotoes, BorderLayout.SOUTH);
	        
	        add(abas);
	        setVisible(true);
	        
	        //função do botão sair
	        btnSair.addActionListener(e -> dispose());

	    }

	    private <T extends Pessoa> void preencherLista(ArrayList<T> lista, DefaultListModel<String> modelo) {
	        for (T pessoa : lista) {
	            modelo.addElement(pessoa.getNome());
	        }
	    }
	public void setModeloEmpregados(DefaultListModel<String> modeloEmpregados) {
		this.modeloEmpregados = modeloEmpregados;
	}

	public void setModeloFornecedores(DefaultListModel<String> modeloFornecedores) {
		this.modeloFornecedores = modeloFornecedores;
	}

	public DefaultListModel<String> getModeloEmpregados() {
		return modeloEmpregados;
	}

	public DefaultListModel<String> getModeloFornecedores() {
		return modeloFornecedores;
	}

}
