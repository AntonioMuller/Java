import java.util.Scanner;

public class segundo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	
		int numero = 1;

		while(numero != 0) {
			System.out.println("Digite um n�mero");
			 numero = sc.nextInt();
			
			System.out.println("O valor do quadrado do n�mero � " +Math.pow(numero, 2));
			System.out.println("O valor do cubo do n�mero � " +Math.pow(numero, 3));
			System.out.println("O valor da ra�z do n�mero � " +Math.sqrt(numero));
			
		}
		
		sc.close();

	}

}