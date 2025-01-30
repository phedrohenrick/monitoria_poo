package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TelaOperario extends JFrame{

    private JTextField producao = new JTextField();
    private JFrame form = new JFrame();
    private Button btnSalvar = new Button();
    private JPanel panelBotoes = new JPanel();
    
    public TelaOperario(){
        JTextField comissao = new JTextField();
        setTitle("Criar Operario");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        form.setLayout(new GridLayout(8,6,5,5));

        form.add(new JLabel("comissão:"));
        form.add(comissao);
        form.add(new JLabel("valor de produção:"));
        form.add(producao);
        add(form, BorderLayout.CENTER);

         form.add(btnSalvar);
        form.add(panelBotoes, BorderLayout.SOUTH);
     
        setVisible(true);
      
         }
   
}
