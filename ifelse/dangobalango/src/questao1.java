
import java.util.Scanner;
import java.lang.Math;

public class questao1 {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		System.out.println("você quer escolher raiz ou soma?");
		System.out.println("1. Somar dois números");
		System.out.println("2 Raiz quadrada do número");
		double escolha = sc.nextDouble();
		
		
	
	if(escolha == 2) {
		System.out.println("escolha um numero") ;
		double a = sc.nextDouble();
		
		System.out.println(Math.sqrt(a));
		
	}else {
		System.out.println("escolha um numero") ;
		double b = sc.nextDouble();
		System.out.println("escolha outro numero");
		double c = sc.nextDouble();
		
		
		
		double soma = b + c;
		
		System.out.println("o valor da soma é" + soma);
		
		
		
	}

		
		sc.close();
		

	}

}
