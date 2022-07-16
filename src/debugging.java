import java.util.Locale;
import java.util.Scanner;

public class Debugging {
	
	//para debbugar=> run - toggle breakpoint
	//botão direito na classe - debbug as Java Application
	// F6 ou step over para ir passando

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area: %.2f", area);
		System.out.printf("Preco: %.2f", preco);
		
		sc.close();
	}

}
