import java.util.Scanner;

public class terceiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		
        double precoa = 0, precob = 0;
		System.out.println("Quantos livros você vai comprar?");
		int quantidade = sc.nextInt();
		
		
			
			 precoa = (quantidade * 0.25) + 7.50;
			 precob = (quantidade * 0.50) + 2.50;	
		
		if (precoa > precob) {
			System.out.println("B é a melhor opção de desconto");
			
		}else {
			System.out.println("A é a melhor opção de desconto");
		}
		
		
		
		
		sc.close();
		
		}
		
		
		
		

	}

