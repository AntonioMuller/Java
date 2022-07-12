import java.util.Scanner;
public class ex_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
     String x;
     String y;
     String z;
	
	 System.out.println("insira o seu nome");
	 x = sc.next();
	 System.out.println("insira o seu endereço");
	 y = sc.next();
	 System.out.println("insira o seu telefone");
	 z = sc.next();
	 
	 System.out.println("o seu nome é " + x);
	 System.out.println("o seu endereço é " + y);
	 System.out.println("o seu telefone é " + z);
	 
		sc.close();
	}

}

