import java.util.Scanner;

public class primeiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tabuada;

		System.out.println("Digite o número que você deseja saber a tabuada");
		int numero = sc.nextInt();
		
	for(int i = 0; i <= 10; i++){
		tabuada = numero * i;
		System.out.println("Tabudada: " +tabuada);
		
	}
		
		sc.close();

	}

}