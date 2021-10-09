import java.util.Scanner;

public class NUM2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			
			System.out.print("Informe um número: ");
			int numA = entrada.nextInt();
			

			if (numA > 0 ) {
				System.out.print("O número informado é Positivo");
			}
			else {
				if (numA < 0 ) {
				System.out.print("O número informado é Negativo");
			}
				else {
					System.out.print("O número informado é zero");
				}
			
			entrada.close();
			
				}		
			}
		}
	}

	