import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
	    int y;
	    double result;
	    double result2;
	    
		System.out.println("qual o seu sal�rio");
		x = sc.nextInt();
		System.out.println("quanto voc� ganha com as suas vendas?");
		y = sc.nextInt();
		
	
	
		result = y * 0.04;
		
		result2 = x + result;
		
		System.out.println("seu sal�rio final � " +result2);

		sc.close();
	}

}
