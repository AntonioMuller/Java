


import java.util.Scanner;


public class questao4 {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int hora, minuto;
				
		System.out.println("Informe a hora de ínicio do jogo");
		int inicio = sc.nextInt();
		System.out.println("Informe os minutos do ínicio do jogo");
		int minutoinicio = sc.nextInt();
		
		
		System.out.println("Informe a hora do fim do jogo");
		int fim = sc.nextInt();
		System.out.println("Informe os minutos do ínicio do jogo");
		int minutofim = sc.nextInt();
		
		System.out.println("Terminou no dia = 1, terminou no dia seguinte = 2");
	    int jogo = sc.nextInt();
		
		if (jogo == 1) {
			hora = inicio - fim;
			if (hora < 0)
			hora = hora * (-1);
			minuto = minutofim - minutoinicio;
			if(minuto<0)
			minuto = minuto *(-1);}

			else{
				
			if ((inicio == fim) && (minutofim<=minutoinicio)){
			hora = (24 - inicio) + fim -1;
			if(hora < 0)
			hora = hora *(-1);
			minuto =(minutofim +minutoinicio);
			if(minuto<0)
			minuto =minuto *(-1);}
			else{
			hora =(24- inicio)+fim;
			if(hora <0) 
			hora =hora *(-1);
			minuto =(minutofim -minutoinicio);
			if(minuto<0)
			minuto =minuto *(-1);}
			}
		
		
		System.out.println("durou: "+hora +":"+minuto);
		
		sc.close();
		

	}

}

