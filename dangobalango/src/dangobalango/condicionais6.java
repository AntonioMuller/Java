package dangobalango;

import java.util.Scanner;

public class condicionais6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("informe um numero:");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("essnumero é par");
			
		}
		
		if(num % 2 != 0 ) {
			System.out.println("esse número é impar");
		}
		sc.close();
	}
}



