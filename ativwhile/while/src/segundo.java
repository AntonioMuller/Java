import java.util.Scanner;

public class segundo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	
		int numero = 1;

		while(numero != 0) {
			System.out.println("Digite um número");
			 numero = sc.nextInt();
			
			System.out.println("O valor do quadrado do número é " +Math.pow(numero, 2));
			System.out.println("O valor do cubo do número é " +Math.pow(numero, 3));
			System.out.println("O valor da raíz do número é " +Math.sqrt(numero));
			
		}
		
		sc.close();

	}

}