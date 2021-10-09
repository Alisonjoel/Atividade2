import java.util.Scanner;

public class NUM1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			
			System.out.print("Digite o primeiro numero : ");
			int numA = entrada.nextInt();
			
			System.out.print("Digite o segundo numero : ");
			int numB = entrada.nextInt();
			
			if (numA > numB) {
				System.out.print("O maior número é "+ numA);
			}
			else {
				System.out.print("O maior número é "+ numB);
			}
			
			entrada.close();
		}
	}
}

	
