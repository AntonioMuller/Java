import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x; 
		double result;
	  
	 
	  
		System.out.println("qual o seu salário");
		x = sc.nextInt();
		
		result = x/1200;
		
		
		
	
		
		System.out.println("o sue salario é equivalente a " +result+ " salários minimos");

		sc.close();
	}

}
