import java.util.Scanner;

public class i {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horas; 
		int salario;
		int horasextras;
	 
		double result1;
		double result2;
		double result3;
	  
		salario = 1200;
	 
	  
		System.out.println("quantas horas voc� trabalhou?");
		horas = sc.nextInt();
		
		System.out.println("quantas horas extras voc� trabalhou?");
		horasextras = sc.nextInt();
		
	
		
		result1 = salario/8 * horas;
		result2 = salario/4 * horasextras;
		result3 = result1 + result2;
		
		
		
		System.out.println("o salario dele � " +result3+ " reais");

		sc.close();
	}

}
