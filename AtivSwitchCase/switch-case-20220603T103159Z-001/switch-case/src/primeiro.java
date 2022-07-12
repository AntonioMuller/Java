import java.util.Scanner;

public class primeiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double novosalario = 0, aumento = 0;
		String cargo = null;
		System.out.println("Qual é o codigo do seu trabalho? 1 = Escrituário, 2 = Secretário, 3 = Caixa, 4 = Gerente, 5 = Diretor ");
		int cod = sc.nextInt();
		System.out.println("Qual é o seu salário?");
		int salario = sc.nextInt();
		
		switch (cod) {
		case 1:
			novosalario = salario * 1.5;
			aumento = novosalario - salario;
			cargo = "escrituário";
			break;
		case 2:
			novosalario = salario * 1.35;
			aumento = novosalario - salario;
			cargo = "secretário"; 
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
			System.out.println("não tem aumento");
			novosalario = salario;
			break;
		default:
			System.out.println("esse código não existe");
			break;		
			
		}
		
		System.out.println("o seu cargo é " +cargo+ " o seu aumento de salario é "+aumento+ " e o seu novo salário é " +novosalario);
		
		sc.close();

	}

}