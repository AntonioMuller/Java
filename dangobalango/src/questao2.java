import java.util.Scanner;


public class questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o dia que é hoje");
		int dia = sc.nextInt();
		
		System.out.println("Informe o mes que é hoje");
		int mes = sc.nextInt();
		
		System.out.println("Informe o ano que é hoje");
		int ano = sc.nextInt();
		
		System.out.println("Informe a hora de hoje");
		int hora = sc.nextInt();
		
		System.out.println("Informe o minuto de hoje");
		int minuto = sc.nextInt();
		
		if(mes == 1) {
			System.out.println("hoje a data e hora é " +dia+ "/ janeiro /" +ano+ " hora: " +hora+ " minuto "+ minuto);
		
		}
		
		if(mes == 2) {
			System.out.println("hoje a data e hora é " +dia+ "/ fevereiro /" +ano+ " hora:" +hora+ " minuto "+ minuto);
		
		}
		
		if(mes == 3) {
			System.out.println("hoje a data e hora é " +dia+ "/ março /" +ano+ " hora:" +hora+ " minuto "+ minuto);
		
		}
		
		if(mes == 4) {
			System.out.println("hoje a data e hora é " +dia+ "/ abril /" +ano+ " hora:" +hora+ " minuto "+ minuto);
		
		}
		
		if(mes == 5) {
			System.out.println("hoje a data e hora é " +dia+ "/ maio /" +ano+ " hora: " +hora+ " minuto "+ minuto);
		
		}
		
		
		if(mes == 6) {
			System.out.println("hoje a data e hora é " +dia+ "/ junho /" +ano+ " hora: " +hora+ " minuto "+ minuto);
		
		}
		
		
		if(mes == 7) {
			System.out.println("hoje a data e hora é " +dia+ "/ julho /" +ano+ " hora:" +hora+ "minuto"+ minuto);
		
		}
		
		
		if(mes == 8) {
			System.out.println("hoje a data e hora é " +dia+ "/ agosto /" +ano+ " hora:" +hora+ "minuto"+ minuto);
		
		}
		
		
		if(mes == 9) {
			System.out.println("hoje a data e hora é " +dia+ "/ setembro /" +ano+ " hora:" +hora+ "minuto"+ minuto);
		
		}
		
		
		if(mes == 10) {
			System.out.println("hoje a data e hora é " +dia+ "/ outubro /" +ano+ " hora:" +hora+ "minuto"+ minuto);
		
		}
		
		
		
		if(mes == 11) {
			System.out.println("hoje a data e hora é " +dia+ "/ novembro /" +ano+ " hora:" +hora+ " minuto "+ minuto);
		
		}
		
		if(mes == 12) {
			System.out.println("hoje a data e hora é " +dia+ "/ dezembro /" +ano+ " hora: " +hora+ " minuto "+ minuto);
		
		}
		
		
		
		sc.close();
	
	}

}
