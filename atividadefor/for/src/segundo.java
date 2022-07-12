import java.util.Scanner;

public class segundo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		

		int c = 0;
		int somaidade1 = 0, somaidade2 = 0;
		int somaaltura = 0;
		int pessoa80kg = 0;
		
	for(int i = 0; i <= 11; i++){
		System.out.println("Qual é a idade do jogador (time1)");
	    int idade1 = sc.nextInt();
	    System.out.println("Qual é o peso do jogador (time1)");
	    int peso1 = sc.nextInt();
	    System.out.println("Qual é a altura do jogador (time1)");
	    int altura1 = sc.nextInt();
		System.out.println("Qual é a idade do jogador (time2)");
	    int idade2 = sc.nextInt();
	    System.out.println("Qual é o peso do jogador (time2)");
	    int peso2 = sc.nextInt();
	    System.out.println("Qual é a altura do jogador (time2)");
	    int altura2 = sc.nextInt();
	    
	    if(idade1 > 18) {
	    	c++;
	    	
	    }
	    
	    if(idade2 > 18) {
	    	c++;
	    }
	    
	    
	    
	 
	somaidade1 += idade1;
	somaidade2 += idade2;
			
	    	
	somaaltura += altura1 + altura2;	
	
	
    if(peso1 > 80) {
    	pessoa80kg++;
    	
    }
    
    if(peso2 > 80) {
    	pessoa80kg++;
    	
    }
  
	   
	   
	}
	
	
	 System.out.println("a quantidade de jogadores com menor que 18 anos são " +c);
	 System.out.println("a a media da idade do time 1 é " +somaidade1/11);
	 System.out.println("a a media da idade do time 2 é " +somaidade2/11);
	 System.out.println("a a media total das alturas das pessoas do campeonato é " +somaaltura/22);
	 System.out.println("a porcentagem total de pessoas com mais de 80 kg é " +((double) pessoa80kg/22) * 100);
	 
	 
	 
		
		sc.close();

	}

}