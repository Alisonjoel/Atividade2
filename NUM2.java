import java.util.Scanner;

public class NUM2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			
			System.out.print("Informe um n�mero: ");
			int numA = entrada.nextInt();
			

			if (numA > 0 ) {
				System.out.print("O n�mero informado � Positivo");
			}
			else {
				if (numA < 0 ) {
				System.out.print("O n�mero informado � Negativo");
			}
				else {
					System.out.print("O n�mero informado � zero");
				}
			
			entrada.close();
			
				}		
			}
		}
	}

	