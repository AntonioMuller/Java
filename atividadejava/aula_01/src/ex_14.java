import java.util.Scanner;

public class ex_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
	    int y;
	    
		System.out.println("insira um número");
		x = sc.nextInt();

		y = x/3;
		System.out.println("a terça parte del é " + y);

		sc.close();
	}

}
