import java.util.Scanner;

public class NUM_25_2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			
			System.out.print("Informe um numero : ");
			float num = entrada.nextFloat();
			
			if (num % 2 == 0) {
				System.out.print("O número é par");
			}
			else {
				System.out.print("O número é impar");
			}
			
			entrada.close();
		 }
	  }
   }
