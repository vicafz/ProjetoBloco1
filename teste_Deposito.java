package Projeto_I;

public class teste_Deposito {
	
	public static void main(String[] args){
		
		//Teste do Objeto depósito
		Deposito pedido = new Deposito("Rum", "Montilla", "Pernod Ricard", 50, 35122928, 25);
		pedido.imprimirInfo();
		pedido.taGelada();
		
		Deposito pedido2 = new Deposito("Vodca", "Natasha", "nãofaçoideia", 10, 351229536, 4);
		pedido2.imprimirInfo(); //Teste do métododo imprimirInfo
		pedido2.taGelada(); //Teste do método taGelada
		
		//Teste classe Cerveja
		Cerveja itemCerva = new Cerveja ("Cerveja", "Skol", "Carlsberg", 6, 14523254,3, null, "pilsen", null, null, null);
		itemCerva.imprimirInfo();
		
		String nome;
		nome=itemCerva.setPilsen("pilsen");
		System.out.println("Tipo do produto: "+nome);
		itemCerva.taGelada();
		
		//Teste classe Vinho
		
		Vinho itemVinho = new Vinho ("Vinho", "Quinta do Morgado", "naosei", 25, 26484123, 25, null, null, null, null);
		itemVinho.imprimirInfo();
		
		String nome1;
		nome1=itemVinho.setTinto("tinto");
		System.out.println("Tipo do produto: "+nome1);
		itemVinho.taGelada();
		//Teste classe Agua
		
		
		//Teste classe Refrigerante
		Refrigerante itemRefri = new Refrigerante ("Refrigerante", "Frevo", "Frevo", 4, 2645679, 3, null, "Guarana", null, null, null);
		itemRefri.imprimirInfo();
		
		String nome2;
		nome2=itemRefri.setGuarana("Guarana");
		System.out.println("Tipo do produto: "+nome2);
		itemRefri.taGelada();

		
		
	}

}
