import java.util.Scanner;

public class terceiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	
		int numero1 = 0, numero2 = 0, soma = 0;
		double media, potencia;
	

        int cont = 0;
		while(numero1 != 30000) {
			 System.out.println("Digite um n�mero");
			 numero1 = sc.nextInt();
			 System.out.println("Digite outro n�mero");
			 numero2 = sc.nextInt();
			
			 soma = numero1+ numero2;
			 cont++;
			 
			System.out.println("O valor da soma � "+soma);
			System.out.println("A quantidade de n�meros digitados foi "+cont);
			
			
			
			if(numero1 > numero2) {
				System.out.println("o maior numero � "+numero1);
			}else {
				System.out.println("o maior n�mero � o " +numero2);
			}
			
			if(numero1 > numero2) {
				System.out.println("o menor n�mero �  " +numero2);
			}else {
				System.out.println("o menor n�mero � o " +numero1);
			}
			
			
			if(numero1 % 2 == 0) {
				if(numero2 % 2 == 0) {
					media = (numero1 + numero2)/2;	
					
					System.out.println("a m�dia dos numeros pares � "+media);
				}
			}
			
			if(numero1 % 1 == 0) {
				if(numero2 % 1 == 0) {
					potencia = numero1 * numero2/100;

					System.out.println("a potencia dos numeros impares �  "+potencia);
				}
			}
			
		
			
		

			
		}
		
		sc.close();

	}

}