import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
	    int y;
	    double result;
	    double result2;
	    
		System.out.println("qual o seu salário");
		x = sc.nextInt();
		System.out.println("quanto você ganha com as suas vendas?");
		y = sc.nextInt();
		
	
	
		result = y * 0.04;
		
		result2 = x + result;
		
		System.out.println("seu salário final é " +result2);

		sc.close();
	}

}
