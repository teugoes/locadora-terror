package pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Interface
public class Locadora implements Titulo {
	private int alugados = 0;
	private double carteira = 0.0;
	private List<Filme> catalogo = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public Locadora(int alugados, double carteira) {
		this.alugados = alugados;
		this.carteira = carteira;
	}
	//Polimorfismo
	public void mostrarTituloDaLocadora() {
		System.out.println("╭─────────────────────────╯•╰─────────────────────────╮");
		System.out.println(" ───── LOCADORA SUSTOS E PIPOCA ─────");
		System.out.println("╰─────────────────────────╮•╭─────────────────────────╯\n\n");
	}
	
	public void adicionarFilme() {
		System.out.print("Digite o titulo do filme: ");
		String titulo = scanner.nextLine();
		System.out.print("Digite o diretor do filme: ");
		String diretor = scanner.nextLine();
		//Tratamento de exceção
		boolean teste = true;
		int anoLancamento = 0;
		while(teste) {
			System.out.print("Digite o ano de lançamento do filme: ");
			String input = scanner.nextLine();
			try {
	            anoLancamento = Integer.parseInt(input);
	            teste = false;
	        } catch (NumberFormatException e) {
	            System.out.println("Erro: o valor digitado não é um número inteiro válido.");
	        }
			
		}
		
		
		System.out.print("Digite a sinopse do filme: ");
		String sinopse = scanner.nextLine();
		catalogo.add(new FilmeTerror(titulo, diretor, anoLancamento, sinopse, true));
		System.out.println("Filme adicionado com sucesso! \n");
	}
	
	public void removerFilme() {
		System.out.println("Digite o título do filme que deseja remover: ");
		String titulo = scanner.nextLine();
		
		boolean removido = false;
		
		for (Filme filme : catalogo) {
			if (filme.getTitulo().equalsIgnoreCase(titulo)) {
				catalogo.remove(filme);
				removido = true;
				System.out.println("Filme removido com sucesso!\n");
				break;
			}
		}
		if (!removido) {
			System.out.println("Filme não encontrado.\n");
		}
	}
	
	public Filme buscarFilme() {
		System.out.print("Digite o título do filme que deseja buscar: ");
		String titulo = scanner.nextLine();
		for (Filme filme : catalogo) {
			if (filme.getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println();
				return filme;
			} 
		}
		return null;
	}
	
	public void atualizarFilme() {
		System.out.println("Digite o título do filme que deseja atualizar: ");
		String titulo = scanner.nextLine();
		
		for(int i = 0; i < catalogo.size() ; i++) {
			Filme filme = catalogo.get(i);
			if(filme.getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println("Digite o titulo do filme: ");
				String novoTitulo = scanner.nextLine();
				System.out.println("Digite o diretor do filme: ");
				String novoDiretor = scanner.nextLine();
				//Tratamento de exceção
				boolean teste = true;
				int novoAnoLancamento = 0;
				while(teste) {
					System.out.print("Digite o ano de lançamento do filme: ");
					String input = scanner.nextLine();
					try {
			            novoAnoLancamento = Integer.parseInt(input);
			            teste = false;
			        } catch (NumberFormatException e) {
			            System.out.println("Erro: o valor digitado não é um número, tente novamente\n");
			        }
					
				}
				
				System.out.println("Digite a sinopse do filme: ");
				String novaSinopse = scanner.nextLine();
				
				FilmeTerror novoFilme = new FilmeTerror(novoTitulo, novoDiretor, novoAnoLancamento, novaSinopse, true);
				
				catalogo.set(i, novoFilme);
				System.out.println("Filme atualizado com sucesso!");
				break;
			}
		}
	}
	
	public void exibirCatalogo() {
		System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━ ☪ ━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("           Catalogo de Filmes");
		if (catalogo.isEmpty()){
			System.out.println("O catálogo de filmes está vazio!");
		} else {
			for (Filme filme : catalogo) {
				System.out.println("Título: " + filme.getTitulo());
				System.out.println("Diretor: " + filme.getDiretor());
				System.out.println("Ano de Lançamento: " + filme.getAnoLancamento());
				System.out.println("Sinopse: " + filme.getSinopse());
				System.out.println("Disponível? " + filme.isDisponivel());
				System.out.println("Tipo: " + filme.getTipo());
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");	
			}
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━ ☪ ━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
		}
	}
	
	public void alugarFilme() {
		System.out.println("Digite o título do filme que deseja pegar emprestado: ");
		String titulo = scanner.nextLine();
		
		boolean filmeEncontrado = false;
		
		for(Filme filme : catalogo) {
			if (filme.getTitulo().equalsIgnoreCase(titulo)) {
				if(filme.isDisponivel()) {
					filme.setDisponivel(false);
					System.out.println("Filme emprestado com sucesso.");
					carteira = carteira + 5.99;
					alugados = alugados + 1;
				} else {
					System.out.println("Filme indisponível pra alugar! ");
				}
				filmeEncontrado = true;
				break;
			}
		}
		
		if (!filmeEncontrado) {
			System.out.println("Filme não encontrado.");
		}
		
		System.out.println("Valor a pagar: " + carteira);
		
		System.out.println("Filmes alugados: " + alugados);
	}
}
