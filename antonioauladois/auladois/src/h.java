import java.util.Scanner;

public class h {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x; 
		int y;
		int z;
	 
		double result1;
		double result2;
		double result3;
	  
	 
	  
		System.out.println("qual o seu salário");
		x = sc.nextInt();
		
		System.out.println("qual o valor da primeira multa?");
		y = sc.nextInt();
		
		System.out.println("qual o valor da segunda multa?");
		z = sc.nextInt();
		
		result1 = y * 1.02;
		result2 = z * 1.02;
		
		result3 = x - result1 - result2;
		
		
		
		System.out.println("sobrara do salario de joão " +result3+ " reais");

		sc.close();
	}

}
