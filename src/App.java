import javax.swing.SwingUtilities;

import view.ExibirTabela;
import view.TelaRegistro;

public class App {
    public static void main(String[] args) throws Exception {

    	
        	SwingUtilities.invokeLater(TelaRegistro::new);
       
    }
}
