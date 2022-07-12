import java.util.Scanner;

public class ex_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		int y;
		int z;

		System.out.println("insira um número");
		x = sc.nextInt();
		System.out.println("insira outro número");
		y = sc.nextInt();

		z = x + y;
		System.out.println(" SOMA: " + z);

		sc.close();
	}

}
