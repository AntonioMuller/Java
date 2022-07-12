import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
	    int y;
	    int result;
	    
		System.out.println("insira um número");
		x = sc.nextInt();
		
		System.out.println("insira outro número");
		y = sc.nextInt();

		result = x - y;
		
		System.out.println("a sua subtração é " +result);

		sc.close();
	}

}
