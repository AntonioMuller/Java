import java.util.Scanner;

public class ex_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
	    int y;
	    
		System.out.println("insira um n�mero");
		x = sc.nextInt();

		y = x/3;
		System.out.println("a ter�a parte del � " + y);

		sc.close();
	}

}
