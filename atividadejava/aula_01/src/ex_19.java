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
		
		System.out.println("a primeira média é " + media1);
		System.out.println("a segunda média é " + media2);
		System.out.println("a soma das médias é " + soma);
		System.out.println("a médifinal é " + mediafinal);

		sc.close();
	}

}
