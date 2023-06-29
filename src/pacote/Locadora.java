package pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locadora {
	private int alugados = 0;
	private double carteira = 0.0;
	private List<Filme> catalogo = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public Locadora(int alugados, double carteira) {
		this.alugados = alugados;
		this.carteira = carteira;
	}

	
	
	public void adicionarFilme() {
		System.out.print("Digite o titulo do filme: ");
		String titulo = scanner.nextLine();
		System.out.print("Digite o diretor do filme: ");
		String diretor = scanner.nextLine();
		System.out.print("Digite o ano de lançamento do filme: ");
		int anoLancamento = scanner.nextInt();
		scanner.nextLine();
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
				System.out.println("Digite o ano de lançamento do filme: ");
				int novoAnoLancamento = scanner.nextInt();
				scanner.nextLine();
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
		System.out.println("**** Catálogo de Filmes ****");
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
				System.out.println("***********************");
				
			}
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
