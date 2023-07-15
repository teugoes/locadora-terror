package pacote;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LocadoraGUI extends JFrame{

	private JButton buttonAdicionar;
    private JButton buttonRemover;
    private JButton buttonAtualizar;
    private JButton buttonPesquisar;
    private JButton buttonExibirCatalogo;
	
    public LocadoraGUI() {
        super("Locadora de Filmes de Terror");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

        Font font = new Font("Arial", Font.PLAIN, 16);

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
                // Lógica para adicionar um filme
                break;
            case "Remover Filme":
                // Lógica para remover um filme
                break;
            case "Atualizar Filme":
                // Lógica para atualizar um filme
                break;
            case "Pesquisar Filme":
                // Lógica para pesquisar um filme
                break;
            case "Exibir Catálogo":
                // Lógica para exibir um catálogo
                break;    
                
            default:
                break;
        }
    }
    
	public static void main(String[] args) {
		new LocadoraGUI();

	}

}
