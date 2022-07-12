import java.util.Scanner;

public class ex_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x;
		double z;
		double pi = 3.14;

		System.out.println("insira quanto vale o raio do circulo");
		x = sc.nextInt();
	
		z =  2 * pi * x;
		
		System.out.println("a sua área é " + z);

		sc.close();
	}

}
