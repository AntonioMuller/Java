package main;

import java.util.Scanner;
import calc2.calc2;


public class main {
	calc2 calculo = new calc2();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		calc2 calculo = new calc2();
		int escolha;
		double valor1, valor2;
		
		System.out.println("Bem vindo a calculadora");
		System.out.println("Voc� quer qual opera��o 1 = soma, 2 = subtra��o, 3 = multiplica��o, 4 = divis�o, 5 = potencia��o, 6 = porcentagem, e 7 = ra�z quadrada");
		escolha = sc.nextInt();
		
		switch(escolha) {
		case 1:
			System.out.println("Informe os numeros para somar");
			 valor1 = sc.nextDouble();
			 valor2 = sc.nextDouble();
			System.out.println(calculo.valortotalsoma(valor1, valor2));
			break;
		
		case 2:
		System.out.println("Informe os numeros para a subtra��o");
		valor1 = sc.nextDouble();
	    valor2 = sc.nextDouble();
		System.out.println(calculo.valortotalsub(valor1, valor2));
		break;
		
		case 3:
		System.out.println("Informe os numeros para a multiplica��o");
		valor1 = sc.nextDouble();
		valor2 = sc.nextDouble();
		System.out.println(calculo.valortotalmulti(valor1, valor2));
		break;
		
		case 4:
		System.out.println("Informe os numeros para a divis�o");
		valor1 = sc.nextDouble();
		valor2 = sc.nextDouble();
		System.out.println(calculo.valortotaldiv(valor1, valor2));
		break;
		
		case 5:
		System.out.println("Informe os numeros para a potencia��o");
		valor1 = sc.nextDouble();
		valor2 = sc.nextDouble();
		System.out.println(calculo.valortotalpoten(valor1, valor2));
		break;
		
		case 6:
		System.out.println("Informe os numeros para a porcentagem");
		valor1 = sc.nextDouble();
		valor2 = sc.nextDouble();
		System.out.println(calculo.valortotalporcent(valor1, valor2));
		break;
		
		case 7:
		System.out.println("Informe o n�mero para a ra�z quadrada");
		valor1 = sc.nextDouble();
		System.out.println(calculo.valortotalraizquad(valor1));
		break;
			
		
		
		}
		
		
		}
		

	}


