import java.util.Scanner;

public class terceiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		

		
		int pecas = 0, salario = 0, totalpagamento = 0, totalpecas = 0, totalpecasfemi = 0, totalpecasmasc = 0;
		
		System.out.println("trabalhadores que fazem até 30 peças por mês - classe 1;");
		System.out.println("trabalhadores que fazem até 31 a 50 peças por mês - classe 2;");
		System.out.println("trabalhadores que fazem mais de 50 peças por mês é - classe 3;");
		
		
	for(int i = 0; i <= 15; i++){
	
		System.out.println("Qual é o seu número de operário");
		int num1 = sc.nextInt();
		
		System.out.println("Qual é o número de peças que você fabricou esse mês?");
		int pecas1 = sc.nextInt();
		
		System.out.println("Qual é o seu sexo 1 = femenino e 2 = masculino");
		int sexo = sc.nextInt();
		
		
		
		if(pecas1 <= 30) {
			System.out.println("O seu salário é de "+salario+" reais e o seu número é de "+num1);
			salario = 1200;
		}
		
		if(pecas1 >= 31 && pecas1 < 50) {
			salario = 1200 + (36 * pecas1);
			System.out.println("O seu salário é de "+salario+"e o seu número é de "+num1);
			
		}
		
		if(pecas >= 50){
			salario = 1200 + (60 * pecas1);
			System.out.println("O seu salário é de "+salario+"e o seu número é de "+num1);
		}
		
		totalpagamento += salario;
		
		
		totalpecas += pecas1;
		
		if(sexo == 1) {
			totalpecasfemi += pecas1;
		}
		
		if(sexo == 2) {
			totalpecasmasc += pecas1;
		}
		
		
	

	  
	    
	}
	 
	 System.out.println("O valor total do pagamento da empresa é " +totalpagamento);
	 System.out.println("O valor total de pecas que a empresa fabricou foi " +totalpecas);
	 System.out.println("O valor total de pecas feita por mulheres que a empresa fabricou foi " +totalpecasfemi);
	 System.out.println("O valor total de pecas feita por homens que a empresa fabricou foi " +totalpecasmasc);
		
		sc.close();

	}

}