import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "maria";
		int idade = 31;
		double flutuante = 10.442333; 
		double renda = 4000.44;
		System.out.println(flutuante);
		System.out.printf("%.2f\n",flutuante);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f\n", flutuante);
		System.out.println("O resultado é " + flutuante + " metros");
		System.out.printf("Resultado = %.2f metros\n", flutuante);
		
		System.out.printf("%s tem %d anos e ganha %.2f reais por mês", nome, idade, renda);
	}

}
