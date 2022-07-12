import java.util.Scanner;

public class j {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dinheiroreais; 
		
		System.out.println("quantos reais você quer converter?");
		dinheiroreais = sc.nextInt();
	 
		double dolar;
		double euro;
		double libraesterlina;
		
		dolar = dinheiroreais * 0.20;
		euro = dinheiroreais * 0.19;
		libraesterlina = dinheiroreais * 0.16;
		
	  


	
		
		System.out.println("o dinheiro em dolar vai ficar " +dolar+ " dolares, o seu dinheiro em euro vai ficar " +euro+ " euros, o seu dinheiro em libra esterlina vai ficar " +libraesterlina+" libras esterlinas" );

		sc.close();
	}

}
