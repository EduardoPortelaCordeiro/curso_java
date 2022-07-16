import java.util.Scanner;

public class estrutura_de_repeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecione o tipo de estrutura de repetição:\n"
				+ "1)While;\n"
				+ "2)For;\n");
		int opcao = sc.nextInt();
		if(opcao == 1) {
			System.out.printf("Voce selecionou a opção %d", opcao);
			int x = sc.nextInt();
			int acumulador = 0;
			
			while(x != 0) {
				acumulador += x;
				x = sc.nextInt();
			}	
			System.out.printf("o somatório dos números digitados é %d", acumulador);
		} else if (opcao == 2) {
			System.out.printf("Voce selecionou a opção %d", opcao);
			int n = sc.nextInt();
			int soma = 0;
			
			for(int i = 0; i < n; i++) {
				int x = sc.nextInt();
				soma += x;
				System.out.println(soma);
			}
			System.out.println(soma);
		}
		sc.close();
	}
}
