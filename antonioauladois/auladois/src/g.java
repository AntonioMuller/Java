import java.util.Scanner;

public class g {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x; 
		double result1, result2, result3, result4, result5, result6, result7, result8, result9, result10;
	  
	 
	  
		System.out.println("qual tabuada vocÊ quer saber?");
		x = sc.nextInt();
		
		result1 = x * 1;
		result2 = x * 2;
		result3 = x * 3;
		result4 = x * 4;
		result5 = x * 5;
		result6 = x * 6;
		result7 = x * 7;
		result8 = x * 8;
		result9 = x * 9;
		result10 = x * 10;
		
		
	
		
		System.out.printf("aqui esta o resultado da sua tabuada" +result1 + result2 + result3 + result4 + result5 + result6 + result7 + result8 + result9 + result10);

		sc.close();
	}

}
