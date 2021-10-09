import java.util.Scanner;

public class NUM3 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			
			System.out.print("Informe o Sexo (M = 1) ou (F = 2) : ");
			int num = entrada.nextInt();
			
			if (num == 1) {
				System.out.print("Sexo Masculino");
			}
			else {
				if (num == 2) {
				System.out.print("Sexo Feminino");
			}
			
			
			entrada.close();
		 }
	  }
   }
}
