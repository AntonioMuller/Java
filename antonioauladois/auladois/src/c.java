import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
	    int y;
	    int result;
	    
		System.out.println("insira um número diferente de 0");
		x = sc.nextInt();
		
		System.out.println("insira outro número");
		y = sc.nextInt();
		
	
		
		result = x/y;
		
		System.out.println("a sua divisão é " +result);

		sc.close();
	}

}
