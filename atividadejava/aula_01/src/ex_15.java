import java.util.Scanner;

public class ex_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		int y;
		int z;

		System.out.println("insira um n�mero");
		x = sc.nextInt();
		System.out.println("insira outro n�mero");
		y = sc.nextInt();

		z = (x + y)/2;
		System.out.println("M�DIA: " + z);

		sc.close();
	}

}
