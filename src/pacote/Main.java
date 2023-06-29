package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locadora locadora = new Locadora(0, 0);
		Scanner scanner = new Scanner(System.in);


		boolean executarSistema = true;

		while(executarSistema) {
			mostrarTituloDaLocadora();
			System.out.println();
			System.out.println("Menu Principal");
			System.out.println("1. ADM");
			System.out.println("2. Usuário");
			System.out.println("3. Sair do sistema completamente! ");
			System.out.println();
			System.out.print("Digite a opção desejada: ");


			int perfil = scanner.nextInt();
			scanner.nextLine();

			switch (perfil) {
			case 1:
				boolean executarAdm = true;

				while(executarAdm) {
					mostrarTituloDaLocadora();
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
					System.out.println();
					
					switch(opcao) {
					case 1:
						locadora.adicionarFilme();
						break;

					case 2:
						locadora.removerFilme();
						break;

					case 3:
						System.out.println(locadora.buscarFilme());
						System.out.println();
						break;

					case 4:
						locadora.atualizarFilme();
						break;

					case 5:
						locadora.exibirCatalogo();
						break;

					case 6:	
						executarAdm = false;
						System.out.println("Saindo da área de ADM");
						break;

					default:	
						System.out.println("Opção inválida, tente novamente!");
						break;
					}
				}
				break;

			case 2:
				boolean executarUsuario = true;

				while(executarUsuario) {
					mostrarTituloDaLocadora();
					System.out.println();
					System.out.println("1. Alugar um filme");
					System.out.println("2. Sair");
					System.out.print("Escolha uma opção: ");

					int opcao = scanner.nextInt();
					scanner.nextLine();

					System.out.println();

					switch(opcao) {
					case 1:
						locadora.alugarFilme();
						break;

					case 2:
						executarUsuario = false;
						System.out.println("Saindo da área de Usuario");
						break;

					default:	
						System.out.println("Opção inválida, tente novamente!");
						break;
					}


				}
			case 3:
				executarSistema = false;
				System.out.println("Encerrando o sistema...");
				break;

			default: 
				System.out.println("Opção inválida, tente novamente");
			}
		}
		scanner.close();
	}

	public static void mostrarTituloDaLocadora() {
		System.out.println("****************************************");
		System.out.println("***** LOCADORA DE FILMES DE TERROR *****");
		System.out.println("****************************************");
	}
}
	
