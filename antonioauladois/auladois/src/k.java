import java.util.Scanner;

public class k {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horas; 
		double minutos;
		double segundos;
		
		System.out.println("escreva um valor em horas");
		horas = sc.nextInt();
		
		minutos = horas * 60;
		
		segundos = minutos * 60;
	 
		
	  
		
		System.out.println("em horas " +horas+ ", em minutos " +minutos+ ", em segundos " +segundos);

		sc.close();
	}

}
