package doWhile;

import java.util.Scanner;

public class primeiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int numero, c = 0;
		
		 
		do {
			
			c = 0;
			
			System.out.println("Digite um número");
			numero = sc.nextInt();
			
			if(numero <= 1) {
				break;
			}
			
			for(int i = numero; i >= 1; i--) {
				if(numero%i == 0){
				  c++;	
				}
			}
			
			if(c == 2 ) {
				System.out.println("O seu número é primo");
			}else {
				System.out.println("O seu número não é primo");
			}
	
		
	
		
	
			
		}while (numero > 1);
		
		
		
		
	
		
		sc.close();

	}		

}
