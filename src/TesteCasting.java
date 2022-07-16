
public class TesteCasting {

	public static void main(String[] args) {
		int x;
		double y;
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("-----------------------");
		
		System.out.println("Altura de um trapézeo.");
		
		int h = 5;
		int b = 6;
		int B = 8;
		
		double area;
		double areaCast;
		
		area = ((b + B)/2) * h;
		areaCast = (double) ((b + B)/2) * h;
		
		System.out.println("Resultado sem o cast");
		System.out.printf("O trapézeo de altura %d, base menor %d e base maior %d, tem área equivalente a %.2f\n", h, b, B, area);
		System.out.println("Resultado com o cast");
		System.out.printf("O trapézeo de altura %d, base menor %d e base maior %d, tem área equivalente a %.2f\n", h, b, B, areaCast);
		
		int a = 2;
		int d = 3;
		
		double resultado = (double) a/d;
		
		System.out.println(resultado);
		
	}

}
