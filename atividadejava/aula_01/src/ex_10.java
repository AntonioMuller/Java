import java.util.Scanner;
public class ex_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
     int x;
     int y;
     int z;
	
	 System.out.println("insira um n�mero");
	 x = sc.nextInt();
	 
	 y = x - 1;
	 z = x + 1;
	 System.out.println("o seu antecessor � " + y);
	 System.out.println("o seu sucessor � " + z);
		sc.close();
	}

}

