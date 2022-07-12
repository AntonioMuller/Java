import java.util.Scanner;


public class questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int novosalario, resto;
		
		System.out.println("Código| Cargo        | Percentual ");
		System.out.println("1     | Escriturário | 50% ");
		System.out.println("2     | Secretário   | 30% ");
		System.out.println("3     | Caixa        | 20% ");
		System.out.println("4     | Gerente      | 10%  ");
		System.out.println("5     | Diretor      | Não tem aumento ");
		System.out.println("Informe o código do seu trabalho ");
		int codigo = sc.nextInt();
		
		if (codigo == 1) {
			System.out.println("Qual é o seu salário atual?");
			int salario = sc.nextInt();
			
			novosalario = (int) (salario * 1.5);
			resto = novosalario - salario;
			
			System.out.println("Seu novo salário de Escriturário é "+novosalario +"reais tendo um aumento de" +resto);	
		}
		
		if (codigo == 2) {
			System.out.println("Qual é o seu salário atual?");
			int salario = sc.nextInt();
			novosalario = (int) (salario * 1.35);
			resto = novosalario - salario;
			
			System.out.println("Seu novo salário de Secretário "+novosalario +"reais tendo um aumento de" +resto);	
		}
		
		
		if (codigo == 3) {
			System.out.println("Qual é o seu salário atual?");
			int salario = sc.nextInt();
			novosalario = (int) (salario * 1.2);
			resto = novosalario - salario;
			
			System.out.println("Seu novo salário de caixa é "+novosalario +"reais tendo um aumento de"+resto );	
		}
		
		if (codigo == 4) {
			System.out.println("Qual é o seu salário atual?");
			int salario = sc.nextInt();
			novosalario = (int) (salario * 1.1);
			resto = novosalario - salario;
			
			System.out.println("Seu novo salário de Gerente "+novosalario +"reais tendo um aumento de" +resto);	
		}
		
		if (codigo == 5) {
			System.out.println("Qual é o seu salário atual?");
			int salario = sc.nextInt();
			System.out.println("Seu salario continua " +salario+ " reais pois o cargo de diretor não tem aumento");
	
		}
		
		
		
		
		sc.close();
	}
	
	
}