import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // instancia o objeto

		String algo;
		int inteiro;
		double flutuante;

		String s1, s2, s3;
		
		//O nextLine permite que v�rias palavras sejam digitadas antes do enter, o que n�o � poss�vel com o next()
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("Receber string");
		System.out.println("digite algo");
		algo = sc.next();
		System.out.println(algo);

		System.out.println("Receber um int");
		System.out.println("Digite um n�mero");
		inteiro = sc.nextInt();
		System.out.println(inteiro);

		System.out.println("Receber um double e muda�a de locale");
		System.out.println("Digite um n�mero com ponto flutuante");
		flutuante = sc.nextDouble();
		System.out.println(flutuante);

		System.out.println("Ler v�rios dados at� a quebra de linha");

		sc.close();

	}

}
