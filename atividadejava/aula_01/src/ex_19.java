import java.util.Scanner;

public class ex_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int media1;
		int media2;
		int soma;
		int mediafinal;


	   media1 = (8 + 9 + 7)/3;
	   media2 = (4 + 5 + 6)/3;
	   soma = media1 + media2;
	   mediafinal = soma/2;
		
		System.out.println("a primeira m�dia � " + media1);
		System.out.println("a segunda m�dia � " + media2);
		System.out.println("a soma das m�dias � " + soma);
		System.out.println("a m�difinal � " + mediafinal);

		sc.close();
	}

}
