import java.util.Scanner;

public class ex_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		int y;
		int z;

		System.out.println("insira quanto vale a base de um ret�ngulo");
		x = sc.nextInt();
		System.out.println("insira quanto vale a altura do ret�ngulo");
		y = sc.nextInt();

		z = x * y;
		System.out.println("a sua �rea � " + z);

		sc.close();
	}

}
