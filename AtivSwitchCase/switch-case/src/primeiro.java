import java.util.Scanner;

public class primeiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double novosalario = 0, aumento = 0;
		String cargo = null;
		System.out.println("Qual � o codigo do seu trabalho? 1 = Escritu�rio, 2 = Secret�rio, 3 = Caixa, 4 = Gerente, 5 = Diretor ");
		int cod = sc.nextInt();
		System.out.println("Qual � o seu sal�rio?");
		int salario = sc.nextInt();
		
		switch (cod) {
		case 1:
			novosalario = salario * 1.5;
			aumento = novosalario - salario;
			cargo = "escritu�rio";
			break;
		case 2:
			novosalario = salario * 1.35;
			aumento = novosalario - salario;
			cargo = "secret�rio"; 
			break;
		case 3:
			novosalario = salario * 1.20;
			aumento = novosalario - salario;
			cargo = "caixa";
			break;
		case 4:
			novosalario = salario * 1.1;
			aumento = novosalario - salario;
			cargo = "gerente";
			break;
		case 5:
			cargo = "diretor";
			System.out.println("n�o tem aumento");
			novosalario = salario;
			break;
		default:
			System.out.println("esse c�digo n�o existe");
			break;		
			
		}
		
		System.out.println("o seu cargo � " +cargo+ " o seu aumento de salario � "+aumento+ " e o seu novo sal�rio � " +novosalario);
		
		sc.close();

	}

}