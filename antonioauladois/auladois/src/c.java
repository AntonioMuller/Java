import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
	    int y;
	    int result;
	    
		System.out.println("insira um n�mero diferente de 0");
		x = sc.nextInt();
		
		System.out.println("insira outro n�mero");
		y = sc.nextInt();
		
	
		
		result = x/y;
		
		System.out.println("a sua divis�o � " +result);

		sc.close();
	}

}
