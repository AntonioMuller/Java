import java.util.Scanner;

public class ex_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		int y;
		int z;

		System.out.println("insira quanto vale a base de um tri�ngulo");
		x = sc.nextInt();
		System.out.println("insira quanto vale a altura do tri�ngulo");
		y = sc.nextInt();

		z = (x * y)/2;
		
		System.out.println("a sua �rea � " + z);

		sc.close();
	}

}
