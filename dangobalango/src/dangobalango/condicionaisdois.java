package dangobalango;

import java.util.Scanner;

public class condicionaisdois {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("que nota voce tirou em geografia?");
		double a = sc.nextDouble();


		System.out.println("que nota você tirou em matematica?");
		double b = sc.nextDouble();



		System.out.println("que nota você tirou em portugues?");
		double c = sc.nextDouble();


		
		double med = (a+b+c)/3;
		

		if (med >= 7 && med <= 10) {
			System.out.println("Aprovado" );
		}

		if (med >= 3 && med <= 7) {
			System.out.println("Exame" );
		}

		if (med >= 0 && med <= 3) {
			System.out.println("Reprovado");
		}

		
		sc.close();
	
	}


}
