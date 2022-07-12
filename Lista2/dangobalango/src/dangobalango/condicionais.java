package dangobalango;

import java.util.Scanner;

public class condicionais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("que nota você tirou no trabalho de laboratorio");
		double a = sc.nextDouble();

		double nota1 = (a * 2);

		System.out.println("que nota você tirou na avaliação semestral");
		double b = sc.nextDouble();

		double nota2 = (b * 3);

		System.out.println("que nota você tirou no exame final?");
		double c = sc.nextDouble();

		double nota3 = (c* 5);
		
		double med = (nota1+nota2+nota3)/10;
		

		if (med >= 8 && med <= 10) {
			System.out.println("Sua média no exame final foi A" );
		}

		if (med >= 7 && med <= 8) {
			System.out.println("Sua média  no exame final B" );
		}

		if (med >= 6 && med <= 7) {
			System.out.println("Sua média na avaliação semestral foi C");
		}

		if (med >= 5 && med <= 6) {
			System.out.println("Sua média na avaliação semestral foi D");
		}

		if (med >= 0 && med <= 5) {
			System.out.println("Sua média na avaliação semestral foi E");
		}

		sc.close();
	
	}


}
