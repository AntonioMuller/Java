import java.util.Scanner;
public class ex_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
     String x;
     String y;
     String z;
	
	 System.out.println("insira o seu nome");
	 x = sc.next();
	 System.out.println("insira o seu endere�o");
	 y = sc.next();
	 System.out.println("insira o seu telefone");
	 z = sc.next();
	 
	 System.out.println("o seu nome � " + x);
	 System.out.println("o seu endere�o � " + y);
	 System.out.println("o seu telefone � " + z);
	 
		sc.close();
	}

}

