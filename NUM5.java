import java.util.Scanner;

public class NUM5 {

	private static final char E = 0;
	private static final char O = 0;
	private static final char I = 0;
	private static final char A = 0;
	private static final char U = 0;

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			
			System.out.print("Digite uma vogal ou consoante : ");
			String vogal = entrada.next();
			
			
			if ((vogal == A)|(vogal == E)|(vogal == I)|(vogal == O)|(vogal == U)) {
				System.out.print(" A letra é Vogal");
			}
			else {
				System.out.print("A letra é Consoante");
			}
			
			entrada.close();
		}
	}
}


