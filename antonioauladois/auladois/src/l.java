import java.util.Scanner;

public class l {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 
		int custoteatro;
		int ingresso;
		double result;
		
		System.out.println("quanto custa para fazer um espataculo teatral?");
		custoteatro = sc.nextInt();
		
		System.out.println("quanto custa o preço do ingresso?");
		ingresso = sc.nextInt();
		
		result = custoteatro/ingresso;
	 
		
	  
		
		System.out.println("deverá ser vendido " +result+ " ingressos");

		sc.close();
	}

}
