import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x;
		double result;
	
		System.out.println("escreva o valor do produto");
		x = sc.nextInt();
		
		result = x * 0.9;
		

		
		System.out.println("o seu novo preço é " +result);

		sc.close();
	}

}
