import java.util.Scanner;
public class ex_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
     int x;
     int y;
     int z;
	
	 System.out.println("insira um número");
	 x = sc.nextInt();
	 
	 y = x - 1;
	 z = x + 1;
	 System.out.println("o seu antecessor é " + y);
	 System.out.println("o seu sucessor é " + z);
		sc.close();
	}

}

