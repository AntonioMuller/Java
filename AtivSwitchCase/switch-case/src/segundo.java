import java.util.Scanner;

public class segundo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int gramas; 
		double preco = 0, imposto = 0, valorimposto = 0;
		System.out.println("Qual é o codigo do produto entre 1 e 10");
		int cod = sc.nextInt();
		System.out.println("Qual é o peso do produto?");
		int peso = sc.nextInt();
		System.out.println("Qual é do país de origem do produto? entre 1 e 3");
		int codpais = sc.nextInt();
		
	
		if (cod >= 1 && cod <= 4) {
			gramas = peso * 1000;
			preco = gramas * 10;	
		}
		

		if (cod >= 5 && cod <= 7) {
			gramas = peso * 1000;
			preco = gramas * 25;
		}
		

		if (cod >= 8 && cod <= 10) {
			gramas = peso * 1000;
			preco = gramas * 35;
			
		}
		
		switch (codpais) {
		case 1:
			imposto = preco;
			valorimposto = imposto - preco;
			break;
		case 2: 
			imposto = preco * 1.15;
			valorimposto = imposto - preco;
			break;
		case 3: 
			imposto = preco * 1.25;
			valorimposto = imposto - preco;
			break;	
		}
		
		
		System.out.println("o peso do produto comprado é " +peso+ " o preço total do produto comprado é  "+preco+ " com imposto de " +valorimposto+ "e o preço total do produto mais imposto é "+imposto);
		
		sc.close();
		
		}
		
		
		
		

	}

