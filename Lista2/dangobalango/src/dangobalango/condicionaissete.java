package dangobalango;

import java.util.Scanner;

public class condicionaissete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i;
		double a, b, c;
		
		System.out.println("I: ");
		i = sc.nextInt();
		System.out.println("A: ");
		a = sc.nextInt();
		System.out.println("B: ");
		b = sc.nextInt();
		System.out.println("C: ");
		c = sc.nextInt();
		
		
		if (i == 1) {
			if(a < b && a < c){
				if(b < c ) {
					System.out.println(a + "," + b + "e" + c);
					
				}
				if (c < b) {
					System.out.println(a + "," + c + "e" + b);
				}
			}
			
			if(b < a && b < c){
				if(a < c ) {
					System.out.println(b+ "," + a + "e" + c);	
				}
				if (c < a ) {
					System.out.println(a+ "," + c + "e" + a);
				}
			}	
				
			
			if(c < b && c < a){
				if(b < c ) {
					System.out.println(c + "," + b + "e" + a);	
				}
				
				if (c < b ) {
					System.out.println(c + "," + a + "e" + b);
				}
			}	
				
			
			if (i == 2){
				if(a > b && a > c){
					if(b > c ) {
						System.out.println(a + "," + b + "e" + c);
						
					}
					if (c > b) {
						System.out.println(a + "," + c + "e" + b);
					}
				}
				
				if(b > a && b > c){
					if(a > c ) {
						System.out.println(b+ "," + a + "e" + c);	
					}
					if (c > a ) {
						System.out.println(a+ "," + c + "e" + a);
					}
				}	
					
				
				if(c > b && c > a){
					if(b > c ) {
						System.out.println(c + "," + b + "e" + a);	
					}
					
					if (c > b ) {
						System.out.println(c + "," + a + "e" + b);
					}
				}	
			}
			
			if(i == 3) {
				if(a > b && a > c){
					if(b > c ) {
						System.out.println(b + "," + c + "e" + a);
						
					}
					if (c > b) {
						System.out.println(c + "," + b + "e" + a);
					}
				}
				
				if(b > a && b > c){
					if(a > c ) {
						System.out.println(a+ "," + c + "e" + b);	
					}
					if (c > a ) {
						System.out.println(c+ "," + a + "e" + b);
					}
				}	
					
				
				if(c > b && c > a){
					if(b > c ) {
						System.out.println(b+ "," + a + "e" + c);	
					}
					
					if (c > b ) {
						System.out.println(a + "," + b + "e" + c);
					}
				}	
			}
				
			}
		
		
		sc.close();
	
		}
	
	


}


	
	
	

