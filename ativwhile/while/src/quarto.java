import java.util.Scanner;

public class quarto {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	
		int  salario = 1, tipo;
		double vsm, vskw, kw, salariofinal;

		
		while(salario != 0) {
			System.out.println("Qual � o valor do seu sal�rio min�mo" );
			salario = sc.nextInt();
			System.out.println("Quantos quilowatts voc� gastou?");
			kw = sc.nextInt();
			System.out.println("Qual � o seu tipo? 1 = residencial, 2 = comercial, 3 = industrial");
			tipo = sc.nextInt();
			
			vsm = salario /8 ;
			vskw = kw * vsm;
			
			
			
			if(tipo == 1) {
				salariofinal = vskw * 1.05;
				System.out.println("o valor a ser pago  ao consumidor (mais acr�scimo �) "+salariofinal);
			}
			
			if(tipo == 2) {
				salariofinal = vskw * 1.10;
				System.out.println("o valor a ser pago  ao consumidor (mais acr�scimo �) "+salariofinal);
			}
			
			if(tipo == 3) {
				salariofinal = vskw * 1.15;
				System.out.println("o valor a ser pago  ao consumidor (mais acr�scimo �) "+salariofinal);
			}
			
			
			System.out.println("O valor de cada quilowatts � "+vskw);
			
			
			
		}
		
		sc.close();

	}

}