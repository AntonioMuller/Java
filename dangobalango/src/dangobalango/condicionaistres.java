package dangobalango;

import java.util.Scanner;

public class condicionaistres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("escolha um numero");
		double a = sc.nextDouble();

		System.out.println("escolha outro numero");
		double b = sc.nextDouble();

		if (a > b) {
			System.out.println("esse é o maior " + a);
		}

		if (b > a) {
			System.out.println("esse é o maior " + b);
		}

		sc.close();

	}

}
