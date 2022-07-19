package Projeto_I;

public class Aplicar_desconto extends Desconto_A{

	public Aplicar_desconto(double tipo) {
		super(tipo);
		
	}

	@Override
	public void desconto(double numero) {
				int tipoDesconto=0;
				
				switch(tipoDesconto) {
			case 1:
				System.out.println("\nRecebeu 5% de desconto");
				break;
			case 2:
				System.out.println("\nRecebeu 10% de desconto");
				break;
			case 3:
				System.out.println("\nRecebeu 15% de desconto");
				break;
				default:
					System.out.println("\nNão recebeu desconto");
				
			}

		
		
		
	}

}
