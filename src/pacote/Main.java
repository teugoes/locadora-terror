package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locadora locadora = new Locadora();
		Scanner scanner = new Scanner(System.in);
		
		boolean executar = true;
		
		while(executar) {
			System.out.println("*****LOCADORA DE FILMES DE TERROR*****");
			System.out.println();
			System.out.println("1. Adicionar um filme");
			System.out.println("2. Remover um filme");
			System.out.println("3. Buscar um filme");
			System.out.println("4. Atualizar um filme");
			System.out.println("5. Exibir catálogo completo de filmes");
			System.out.println("6. Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcao) {
				case 1:
					locadora.adicionarFilme();
					break;
					
				case 2:
					locadora.removerFilme();
					break;
					
				case 3:
					locadora.buscarFilme();
					break;
					
				case 4:
					locadora.atualizarFilme();
					break;
					
				case 5:
					locadora.exibirCatalogo();
					break;
					
				case 6:	
					executar = false;
					System.out.println("Saindo do sistema da locadora...");
					break;
					
				default:	
					System.out.println("Opção inválida, tente novamente!");
					break;
			}
			
			System.out.println();
					
			
		}

		scanner.close();
	}

}
