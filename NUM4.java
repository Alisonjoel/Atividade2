import java.util.Scanner;

public class NUM4 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner entrada = new Scanner(System.in)) {

			System.out.print("Informe um ano de 4 digitos : ");
			int ano = entrada.nextInt();

			if ((ano % 4 == 0)|(ano % 400 == 0)) {
				System.out.print("O ano informado é Bissexto");
			}
			else {
				System.out.print("o ano informado não é Bissexto");
			}

			entrada.close();
		}
	}
}
