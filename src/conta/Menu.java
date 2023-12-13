package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			System.out.println("******************************************");
			System.out.println("                                          ");
			System.out.println("           BANCO DO BRAZIL COM Z          ");
			System.out.println("                                          ");
			System.out.println("******************************************");
			System.out.println("                                          ");
			System.out.println("                                          ");
			System.out.println("     1 - Criar Conta                      ");
			System.out.println("     2 - Listar Todas as contas           ");
			System.out.println("     3 - Buscar Conta por Numero          ");
			System.out.println("     4 - Atualizar Dados da Conta         ");
			System.out.println("     5 - Apagar Conta                     ");
			System.out.println("     6 - Sacar                            ");
			System.out.println("     7 - Depositar                        ");
			System.out.println("     8 - Transferir valores entre contas  ");
			System.out.println("     9 - Sair                             ");
			System.out.println("                                          ");
			System.out.println("******************************************");
			System.out.println("Entre com a opção desejada:               ");
			System.out.println("                                          ");
			
			opcao = scanner.nextInt();
			
			if(opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				sobre();
				scanner.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Criar conta\n\n");
				
				break;
			case 2:
				System.out.println("Listar Todas as contas\n\n");
				
				break;
			case 3:
				System.out.println("Consultar dados da conta - por número\n\n");
				
				break;
			case 4:
				System.out.println("Atualizar Dados da Conta\n\n");
				
				break;
			case 5:
				System.out.println("Apagar Conta \n\n");
				
				break;
			case 6:
				System.out.println("Sacar \n\n");
				
				break;
			case 7:
				System.out.println("Depositar\n\n");
				
				break;
			case 8:
				System.out.println("Transferir entre contas\n\n");
				
				break;
			default:
				System.out.println("Opção inválida\n\n");
				break;
			}
			
			
		}

	}

	private static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Verônica Freitas Santos");
		System.out.println("Verônica Freitas - verofreitt@gmail.com");
		System.out.println("https://github.com/verofreitt/java-projeto-conta-bancaria");
		System.out.println("*********************************************************");
	}

}
