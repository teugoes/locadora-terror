package pacote;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class LocadoraGUI extends JFrame{
	
	Locadora locadora = new Locadora(0, 0);
	private JButton buttonAdicionar;
    private JButton buttonRemover;
    private JButton buttonAtualizar;
    private JButton buttonPesquisar;
    private JButton buttonExibirCatalogo;
	
    public LocadoraGUI() {
        super("Locadora de Filmes de Terror");
        
       
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setResizable(false);
        setLocationRelativeTo(null);
        
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

        Font font = new Font("Arial", Font.PLAIN, 18);
        
        buttonAdicionar = createButton("Adicionar Filme", font);
        buttonRemover = createButton("Remover Filme", font);
        buttonAtualizar = createButton("Atualizar Filme", font);
        buttonPesquisar = createButton("Pesquisar Filme", font);
        buttonExibirCatalogo = createButton("Exibir Catálogo", font);

        container.add(buttonAdicionar);
        container.add(buttonRemover);
        container.add(buttonAtualizar);
        container.add(buttonPesquisar);
        container.add(buttonExibirCatalogo);

        setVisible(true);
    }
    
    private JButton createButton(String text, Font font) {
        JButton button = new JButton(text);
        button.setFont(font);
        button.setFocusable(false);
        button.addActionListener(e -> handleButtonClick(text));
        return button;
    }
    
    private void handleButtonClick(String buttonName) {
        switch (buttonName) {
            case "Adicionar Filme":
            	locadora.adicionarFilme();
                break;
            case "Remover Filme":
            	locadora.removerFilme();
                break;
            case "Atualizar Filme":
            	locadora.atualizarFilme();
                break;
            case "Pesquisar Filme":
            	System.out.println(locadora.buscarFilme());
				System.out.println();
                break;
            case "Exibir Catálogo":
            	locadora.exibirCatalogo();
                break;    
                
            default:
                break;
        }
    }
    
   
    
	public static void main(String[] args) {
		new LocadoraGUI();

	}

}
