import java.util.Scanner;


public class questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int novosalario, resto;
		
		System.out.println("C�digo| Cargo        | Percentual ");
		System.out.println("1     | Escritur�rio | 50% ");
		System.out.println("2     | Secret�rio   | 30% ");
		System.out.println("3     | Caixa        | 20% ");
		System.out.println("4     | Gerente      | 10%  ");
		System.out.println("5     | Diretor      | N�o tem aumento ");
		System.out.println("Informe o c�digo do seu trabalho ");
		int codigo = sc.nextInt();
		
		if (codigo == 1) {
			System.out.println("Qual � o seu sal�rio atual?");
			int salario = sc.nextInt();
			
			novosalario = (int) (salario * 1.5);
			resto = novosalario - salario;
			
			System.out.println("Seu novo sal�rio de Escritur�rio � "+novosalario +"reais tendo um aumento de" +resto);	
		}
		
		if (codigo == 2) {
			System.out.println("Qual � o seu sal�rio atual?");
			int salario = sc.nextInt();
			novosalario = (int) (salario * 1.35);
			resto = novosalario - salario;
			
			System.out.println("Seu novo sal�rio de Secret�rio "+novosalario +"reais tendo um aumento de" +resto);	
		}
		
		
		if (codigo == 3) {
			System.out.println("Qual � o seu sal�rio atual?");
			int salario = sc.nextInt();
			novosalario = (int) (salario * 1.2);
			resto = novosalario - salario;
			
			System.out.println("Seu novo sal�rio de caixa � "+novosalario +"reais tendo um aumento de"+resto );	
		}
		
		if (codigo == 4) {
			System.out.println("Qual � o seu sal�rio atual?");
			int salario = sc.nextInt();
			novosalario = (int) (salario * 1.1);
			resto = novosalario - salario;
			
			System.out.println("Seu novo sal�rio de Gerente "+novosalario +"reais tendo um aumento de" +resto);	
		}
		
		if (codigo == 5) {
			System.out.println("Qual � o seu sal�rio atual?");
			int salario = sc.nextInt();
			System.out.println("Seu salario continua " +salario+ " reais pois o cargo de diretor n�o tem aumento");
	
		}
		
		
		
		
		sc.close();
	}
	
	
}