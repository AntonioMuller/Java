import java.util.Scanner;

public class primeiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double salariojoao;
		System.out.println("Qual é o salario do João?");
		int salariocarlos = sc.nextInt();
		
		salariojoao = salariocarlos / 3;
		int contador = 0;
		while(salariocarlos > salariojoao) {
			
			contador++;
              salariocarlos *= 1.02; 
			 salariojoao *= 1.05;
		}
		
		System.out.println("o salario de joao vai ser maior que o do carlos em "+contador+" meses");
		
		sc.close();

	}

}