import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x; 
		double result;
	  
	 
	  
		System.out.println("qual o seu sal�rio");
		x = sc.nextInt();
		
		result = x/1200;
		
		
		
	
		
		System.out.println("o sue salario � equivalente a " +result+ " sal�rios minimos");

		sc.close();
	}

}
