import java.util.Scanner;

public class ex_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int anos;
		int meses;
		int dias;
		int totaldias;
		int x;
		int y;

		System.out.println("me diga quantos anos voc� tem");
		anos = sc.nextInt();
		System.out.println("me diga quantos meses voc� tem");
		meses = sc.nextInt();
		System.out.println("me diga quantos dias voc� tem");
		dias = sc.nextInt();

		x = anos * 365;
		y = meses * 30;
		totaldias = x + y + dias;
		
		System.out.println("a sua idade em dias � " + totaldias + " dias");

		sc.close();
	}

}
