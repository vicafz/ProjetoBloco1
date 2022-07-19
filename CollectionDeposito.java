package Projeto_I;

import java.util.HashMap;
import java.util.Scanner;

public class CollectionDeposito {

	/* A colletion foi desenvolvida para gerenciamento do Aramazém do Depósito.
	 Foram incluídas as opções de adicionar, remover e atualizar os produtos, além de mostrar uma lista com os itens disponíveis e encerrar o sistema.
	 
	 Como queremos mostrar a quantidade de itens de cada produto, usamos a classe HashMap, que é a implementação da interface Map.
	 Ao usar o conceito de key-value pairs, conseguimos colocar as informações de nome e quantidade dos produtos, uma ao lado da outra.	  */

public static void main (String args[]) {
		
		HashMap<String, Integer> nomeParamarca = new HashMap<>();

		int op;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\nESCOLHA UMA OPÇÃO:");
			System.out.println();
			System.out.println("**************************************");
			System.out.println("1 - Adicionar vinho no Armazém.");
			System.out.println("2 - Adicionar cerveja no Armazém.");
			System.out.println("3 - Adicionar água no Armazém.");
			System.out.println("4 - Adicionar refrigerante no Armazém.");
			System.out.println("5 - Remover um produto.");
			System.out.println("6 - Atualizar a quantidade de um produto.");
			System.out.println("7 - Mostrar os produtos no Armazém.");
			System.out.println("0 - Encerrar sistema.");
			System.out.println("**************************************");
			
			op = ler.nextInt();
			
		switch(op) {
		case 1:
			ler.nextLine();
			System.out.println("Qual o nome do vinho que deseja adicionar ao estoque?");
			String nomeVinho = ler.nextLine();
			if (nomeParamarca.containsKey(nomeVinho)) {
				System.out.println("Erro! O produto já existe no sistema do Armazém. "
						+ "Selecione a opção 6 - Atualizar a quantidade de um produto.");
			}
			else {
				System.out.println("Qual a quantidade do produto?");
				Integer quantVinho = ler.nextInt();
				nomeParamarca.put(nomeVinho, quantVinho);
			}			
		break;
		
		case 2:
			ler.nextLine();
			System.out.println("Qual o nome da cerveja que deseja adicionar ao estoque?");
			String nomeCerveja = ler.nextLine();
			if (nomeParamarca.containsKey(nomeCerveja)) {
				System.out.println("Erro! O produto já existe no sistema do Armazém. "
						+ "Selecione a opção 6 - Atualizar a quantidade de um produto.");
			}
			else {
				System.out.println("Qual a quantidade do produto?");
				Integer quantCerveja = ler.nextInt();
				nomeParamarca.put(nomeCerveja, quantCerveja);
			}
		break;
		
		case 3:
			ler.nextLine();
			System.out.println("Qual o nome da água que deseja adicionar ao estoque?");
			String nomeAgua = ler.nextLine();
			if (nomeParamarca.containsKey(nomeAgua)) {
				System.out.println("Erro! O produto já existe no sistema do Armazém. "
						+ "Selecione a opção 6 - Atualizar a quantidade de um produto.");
			}
			else {
				System.out.println("Qual a quantidade do produto?");
				Integer quantAgua = ler.nextInt();
				nomeParamarca.put(nomeAgua, quantAgua);
			}		
		break;
		
		case 4:
			ler.nextLine();
			System.out.println("Qual o nome da refrigerante que deseja adicionar ao estoque?");
			String nomeRefri = ler.nextLine();
			if (nomeParamarca.containsKey(nomeRefri)) {
				System.out.println("Erro! O produto já existe no sistema do Armazém. "
						+ "Selecione a opção 6 - Atualizar a quantidade de um produto.");
			}
			else {
				System.out.println("Qual a quantidade do produto?");
				Integer quantRefri = ler.nextInt();
				nomeParamarca.put(nomeRefri, quantRefri);
			}
		break;
		
		case 5:
			ler.nextLine();
			System.out.println("Qual o nome do produto deseja remover completamente?");
			String produtoRemover = ler.nextLine();	
			if (nomeParamarca.containsKey(produtoRemover)) {
				nomeParamarca.remove(produtoRemover);
			}
			else {
				System.out.println("Erro! O produto não existe no Armazém.");
			}
			System.out.println("Os produtos no Armazém são: "+nomeParamarca);
			break;

		case 6:
			ler.nextLine();
			System.out.println("Qual o nome produto quer atualizar?");
			String nomeProduto = ler.nextLine();
			if (nomeParamarca.containsKey(nomeProduto)) {
				System.out.println("Qual a nova quantidade deste produto?");
				Integer quantNova = ler.nextInt();
					nomeParamarca.remove(nomeProduto);
					nomeParamarca.get(quantNova);
					nomeParamarca.put(nomeProduto, quantNova);
			}
			else {
				System.out.println("Erro! O produto não existe no Armazém.");
			}
			System.out.println("Os produtos no Armazém são: "+nomeParamarca);
		break;
		
		case 7:
			System.out.println("Os produtos no Armazém são: "+nomeParamarca);
		break;
		
		case 0:
			System.out.println("Sistema encerrado.");
		break;
		
		default:
			System.out.println("Opção inválida. Digite uma opção válida ou encerre o sistema apertando 0");
		}
		}
		while(op!=0);
		
	
	}
}

