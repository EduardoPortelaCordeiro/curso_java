import java.util.Scanner;

public class ExerciciosCondicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o exercício:\n1)acumulador;\n2)switch-case;\n3)Exercício com ternário;");
		int selector = sc.nextInt();
		if (selector == 1) {
			System.out.println("Exercício de condicional e acumulador simples.\n"
					+ "Digite o número de minutos usados no seu telefone.\n"
					+ "caso passe de 100, será acrescentado R$2,00 para cada minuto excedente.");
			int minutos = sc.nextInt();
			double conta = 50.0;

			if (minutos > 100) {
				if (minutos >= 50) {
					conta += ((minutos - 100) * 2);
				}
			}
			System.out.println(conta);
		} else if (selector == 2) {
			System.out.println("Exercício Switch-Case\n"
					+ "Selectione um número de 1 a 7 para que seja informado o dia da semana equivalente.");
			int dia = sc.nextInt();
			String dayName;

			switch (dia) {
			case 1:
				dayName = "Domingo";
				break;
			case 2:
				dayName = "Segunda";
				break;
			case 3:
				dayName = "Terça";
				break;
			case 4:
				dayName = "Quarta";
				break;
			case 5:
				dayName = "Quinta";
				break;
			case 6:
				dayName = "Sexta";
				break;
			case 7:
				dayName = "Sábado";
				break;
			default:
				dayName = "Digite um valor entre de 1 a 7!";
				break;
			}
			System.out.println(dayName);
		} else if (selector == 3) {
			System.out.println("Exercício ternário.\n"
					+ "O valor do desconto varia de acordo com o preço.\n"
					+ "Caso o preço seja maior ou igual a 50, o desconto é de 10 por cento. Caso contrário o desconto é de 15 por cento");
			double preco;
			double desconto = 0;
			
			System.out.println("Digite o preço do produto");
			
			preco = sc.nextDouble();
			desconto = (preco >= 50) ? preco*0.1 : preco*0.15;
			
			System.out.printf("O valor do desconto é: ", desconto);
		}
		sc.close();
	}

}
