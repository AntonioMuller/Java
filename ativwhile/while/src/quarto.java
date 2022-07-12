import java.util.Scanner;

public class quarto {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	
		int  salario = 1, tipo;
		double vsm, vskw, kw, salariofinal;

		
		while(salario != 0) {
			System.out.println("Qual é o valor do seu salário minímo" );
			salario = sc.nextInt();
			System.out.println("Quantos quilowatts você gastou?");
			kw = sc.nextInt();
			System.out.println("Qual é o seu tipo? 1 = residencial, 2 = comercial, 3 = industrial");
			tipo = sc.nextInt();
			
			vsm = salario /8 ;
			vskw = kw * vsm;
			
			
			
			if(tipo == 1) {
				salariofinal = vskw * 1.05;
				System.out.println("o valor a ser pago  ao consumidor (mais acréscimo é) "+salariofinal);
			}
			
			if(tipo == 2) {
				salariofinal = vskw * 1.10;
				System.out.println("o valor a ser pago  ao consumidor (mais acréscimo é) "+salariofinal);
			}
			
			if(tipo == 3) {
				salariofinal = vskw * 1.15;
				System.out.println("o valor a ser pago  ao consumidor (mais acréscimo é) "+salariofinal);
			}
			
			
			System.out.println("O valor de cada quilowatts é "+vskw);
			
			
			
		}
		
		sc.close();

	}

}