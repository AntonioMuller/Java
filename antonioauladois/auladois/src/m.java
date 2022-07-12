import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 
		int custo;
		int salario;
		double result1;
		double result2;
		double quilowatts;
		
		salario = 1200;
		
		System.out.println("quantos quilowatts você gasta?");
		custo = sc.nextInt();
		
		quilowatts = salario/5;
		result1 = quilowatts * custo;
		result2 = result1 * 0.85;
		
	 
	  
		
		System.out.println(" cada quilowatts custa " +quilowatts+ " a residentecia tera que pagar " +result1+ " com desconto vai ficar " +result2);

		sc.close();
	}

}
