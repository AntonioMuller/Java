import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
	    int y;
	    int z;
	    int result;
	    
		System.out.println("insira um número");
		x = sc.nextInt();
		
		System.out.println("insira outro número");
		y = sc.nextInt();
		
		System.out.println("insira outro número");
		z = sc.nextInt();

		
		result = x * y * z;
		
		System.out.println("a sua multiplicação é " +result);

		sc.close();
	}

}
