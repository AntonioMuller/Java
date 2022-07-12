package doWhile;

import java.util.Scanner;

public class segundo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int codigo, veicpass = 0, acidvit = 0, i = 0,  mediavit = 0;
		
		 
		do {
			
			
			
			System.out.println("Qual é o código da sua cidade");
			codigo = sc.nextInt();
			
			System.out.println("Qual é o número de veículos de passeio");
			veicpass = sc.nextInt();
			
			System.out.println("Qual é o número de acidentes com vitimas");
			acidvit = sc.nextInt();
			
			
			
			mediavit += acidvit;
			
			if(codigo > acidvit) {
				System.out.println("A cidade do código "+codigo+ " teve o maior indice de acidente");
			}
			
			if(mediavit < 2000) {
				System.out.println("A média de acidentes de transito foi de" +mediavit/5);
			}
			
			System.out.println("A média de veículos das 5 cidades foi de " +veicpass/5);
			
		
			i++;
		}while (i <= 5);
		
		
		
		
	
		
		sc.close();

	}		

}
