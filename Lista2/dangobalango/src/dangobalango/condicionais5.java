package dangobalango;

import java.util.Scanner;


public class condicionais5{
	

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o primeiro numero:");
		double a = sc.nextDouble();
		
		System.out.println("insira o segundo numero:");
		double b = sc.nextDouble();
		
		System.out.println("insira o terceiro numero:");
		double c = sc.nextDouble();
		
		System.out.println("insira o quarto numero:");
		double d = sc.nextDouble();
		
		if (d > c) {
			System.out.println(d + "\n" + "\n"+  c +"\n"+ b + "\n"+ a);
		}
		
		if (d > b && d < c ) {
			System.out.println(c + "\n"+ d + "\n"+ b + "\n"+ a);
		}
		
		if ( d > a && d < b) {
			System.out.println(c+ "\n"+ b + "\n"+ d + "\n" + a);
		}
		
		if (d<a) {
			System.out.println(c + "\n" + b + "\n"+ a + "\n"+ d);
		}
		
		sc.close();
	}
}