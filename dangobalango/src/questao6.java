import java.util.Scanner;


public class questao6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int imposto, novosalario;
		
		System.out.println("Menu de op��es ");
		System.out.println("1. Imposto ");
		System.out.println("2. Novo sal�rio ");
		System.out.println("3. Classifica��o ");
		System.out.println("Digite a op��o desejada ");
		int opcao = sc.nextInt();
	 
		
		
		if (opcao == 1) {
			System.out.println("Qual � o seu sal�rio atual?");
			int salario = sc.nextInt();
			
			if(salario < 500){
				imposto = (int) (salario * 0.95);
				System.out.println("Voc� devera pagar essa quantia de imposto:" +imposto);
			}
			
			if(salario >= 500 && salario < 850 ){
				imposto = (int) (salario * 0.90);
				System.out.println("Voc� devera pagar essa quantia de imposto:" +imposto);
			}
			
			if(salario >= 850 ){
				imposto = (int) (salario * 0.85);
				System.out.println("Voc� devera pagar essa quantia de imposto:" +imposto);
			}
			
		}
					
					
		if (opcao == 2) {
			System.out.println("Qual � o seu sal�rio atual?");
			int salario = sc.nextInt();
			
			if(salario > 1500){
				novosalario = salario + 25;
				System.out.println("esse � o seu novo salario" +novosalario);
		}
			
			if(salario >= 750 && salario <= 1500){
				novosalario = salario + 50;
				System.out.println("esse � o seu novo salario" +novosalario);
		}
			
			
			if(salario >= 450 && salario < 750){
				novosalario = salario + 75;
				System.out.println("esse � o seu novo salario" +novosalario);
		}
			
			if(salario < 450){
				novosalario = salario + 100;
				System.out.println("esse � o seu novo salario" +novosalario);
		}
			
		}
		
		
		if (opcao == 3) {
			System.out.println("Qual � o seu sal�rio atual?");
			int salario = sc.nextInt();
			
			if(salario <= 700) {
				System.out.println("Mal remunerado");
			}else {
				System.out.println("Bem remunerado");
			}
			
			
	}
		
		else {
			System.out.println("Op��o invalida");
		}
		
		
		sc.close();
	}
	
	}
