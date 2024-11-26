package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Cofrinho cofrinho = new Cofrinho();
		
		while (true) {
			System.out.println("---MENU---");
			System.out.println("1- Adicionar");
			System.out.println("2- Remover");
			System.out.println("3- Listar");
			System.out.println("4- Total no cofrinho");
			System.out.println("0- Sair");
			opcao = teclado.nextInt();
			
			if (opcao == 0) {
				System.out.println("Finalizando programa...");
				break;
			}
			int tipoMoeda;
			double valorMoeda;
			Moeda moeda = null;
			
			switch(opcao) {
				case 1://adicionar moedas
					tipoMoeda = 0;
					while (tipoMoeda <=0 || tipoMoeda >3) {
						System.out.println();
						System.out.println("Qual tipo de moeda que deseja guardar?");
						System.out.println("1- Dolar");
						System.out.println("2- Euro");
						System.out.println("3- Real");
						tipoMoeda = teclado.nextInt();
						if (tipoMoeda <= 0 || tipoMoeda > 3) { 
							System.out.println("Moeda inexistente! Escolha as opções do menu."); 
							}
					}
					System.out.println();
					System.out.println("Qual o valor da moeda??");
					valorMoeda = teclado.nextDouble();
						
					if (tipoMoeda == 1) {
						moeda = new Dolar (valorMoeda);
					}	
					else if (tipoMoeda == 2) {
						moeda = new Euro(valorMoeda);
					}	
					else {
						moeda = new Real(valorMoeda);
					}
					cofrinho.adicionar(moeda);
					break;
					
				case 2://remover moedas
					tipoMoeda = 0;
					while (tipoMoeda <=0 || tipoMoeda >3) {
						System.out.println();
						System.out.println("Qual tipo de moeda que deseja remover?");
						System.out.println("1- Dolar");
						System.out.println("2- Euro");
						System.out.println("3- Real");
						tipoMoeda = teclado.nextInt();
						if (tipoMoeda <= 0 || tipoMoeda > 3) { 
							System.out.println("Moeda inexistente! Escolha as opções do menu."); 
							}
					}
				    System.out.println();
					System.out.println("Qual o valor da moeda??");
					valorMoeda = teclado.nextDouble();
						
					if (tipoMoeda == 1) {
						moeda = new Dolar(valorMoeda);
					}
					else if (tipoMoeda == 2) {
						moeda = new Euro( valorMoeda);
					}
					else if (tipoMoeda == 3) {
						moeda = new Real(valorMoeda);
					}
					cofrinho.remover(moeda);
					break;
						
				case 3://listar
					cofrinho.listar();
					System.out.println();
					break;
				
				case 4://total convertido em reais
					double total = cofrinho.totalConvertido();
					System.out.println("Total do seu cofrinho em reais é: " + total);
					System.out.println();
					break;
					
				default:
					System.out.println("Opção inválida! escolha as opçõs oferecidas no Menu.");
				}
			}
			teclado.close();
	}

}
