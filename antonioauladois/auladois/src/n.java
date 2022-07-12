import java.util.Scanner;

public class n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 
		int kilos;
		int racao;
		int restara;
		
	
		
		System.out.println("qual o peso do saco de ração?");
		kilos = sc.nextInt();
		
		System.out.println("quanto de ração em gramas você da para cada gato?");
		racao = sc.nextInt();
		
		restara = (kilos * 1000) - (racao * 2 * 5);
		
	 
	  
		
		System.out.println(" restara " +restara+ " gramas");

		sc.close();
	}

}
