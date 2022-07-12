import java.util.Scanner;

public class quarto {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int  pagamento = 0;
		double  condgpag, precocomdesc = 0, condpag = 0, parcela = 0;
		
	
		System.out.println("Ola o valor da sua compra deu 100 reais, escolha um método de pagamento, 1 = Pagamento a vista, 2 = Pagamento com cheque, 3 = Pagamento parcelado em 6 vezes, 4 = Pagamento parcelado em 12 vezes");
		int pag = sc.nextInt();
		
	
		
		switch (pag) {
		case 1:
			pagamento = 100;
			condpag = pagamento * 0.15;
			precocomdesc = pagamento - condpag;
		 
			break;
		case 2: 
			pagamento = 100;
			condpag = pagamento * 0.10;
			precocomdesc = pagamento - condpag;
			break;
		case 3: 
			pagamento = 100;
			parcela = pagamento / 6;
			break;	
		case 4:
			pagamento = 100;
			condpag = pagamento * 0.8;
			precocomdesc = pagamento - condpag;
			parcela = precocomdesc / 12;
		
		
		}
		
		if(pag == 1) {
			System.out.println("O valor da sua compra foi de "+pagamento+ " com desconto de"+condpag+ " reis sendo o valor total da compra de " +precocomdesc);
			
		}
		
		if(pag == 2) {
			System.out.println("O valor da sua compra foi de "+pagamento+" com desconto de"+condpag+ " reis sendo o valor total da compra de " +precocomdesc);
			
		}
		
		if(pag == 3) {
			System.out.println("O valor da sua compra foi de "+pagamento+" não tem desconto e o preço com a parecela foi de "+parcela);
			
		}
		
		if(pag == 4) {
			System.out.println("O valor da sua compra foi de "+pagamento+" com desconto de" +condpag+ " reis sendo o valor total da compra de " +precocomdesc+ "com a parcela de"+parcela);
			
		}
		
		
		sc.close();
		
		}
		
		

	}

