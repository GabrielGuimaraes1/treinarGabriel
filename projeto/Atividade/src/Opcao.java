
public class Opcao {

	public static void main(String[] args) {
		int opcao = 5;

		if (opcao == 1) {
			System.out.println("Um");
		} else if (opcao == 2) {
			System.out.println("Dois");
		} else if (opcao == 3) {
			System.out.println("Três");
		} else if (opcao == 4) {
			System.out.println("Quatro");
		} else if (opcao == 5) {
			System.out.println("Cinco");
		} else { 
			System.out.println("Número não encontrado");
		}
		
		switch (opcao) {
		case 1:
			System.out.println("um");
			break;
		case 2:
			System.out.println("dois");
			break;
		case 3:
			System.out.println("três");
			break;
		case 4:
			System.out.println("quatro");
			break;
		case 5:
			System.out.println("cincooooo");
			break;

		default:
			break;
		}
	
	}

}


