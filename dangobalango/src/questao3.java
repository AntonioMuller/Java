

import java.util.Scanner;


public class questao3 {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Informe um dia");
		int dia = sc.nextInt();
		
		System.out.println("Informe um mes");
		int mes = sc.nextInt();
		
		System.out.println("Informe um ano");
		int ano = sc.nextInt();
		
		System.out.println("Informe outro dia");
		int dia2 = sc.nextInt();
		
		System.out.println("Informe outro mes");
		int mes2 = sc.nextInt();
		
		System.out.println("Informe outro ano");
		int ano2 = sc.nextInt();
		
		if (ano > ano2) {
			System.out.println("o maior é " +dia2+"/"+mes2+"/"+ano2);
		}else if(ano2 > ano) {
			System.out.println("o maior é " +dia+"/"+mes+"/"+ano);
		}else if (mes > mes2) {
			System.out.println("o maior é " +dia2+"/"+mes2+"/"+ano2);
		}else if (mes2 > mes) {
			System.out.println("o maior é " +dia+"/"+mes+"/"+ano);
		}else if (dia2 > dia) {
			System.out.println("o maior é " +dia2+"/"+mes2+"/"+ano2);
		}else if (dia > dia2) {
			System.out.println("o maior é " +dia+"/"+mes+"/"+ano);
		}else {
			System.out.println(" os dois são iguais");
		}
		
		
		
	
		
		sc.close();
		

	}

}

