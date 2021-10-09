import java.util.Scanner;
public class NUM8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe a primeira nota : ");
		int numI = entrada.nextInt();
		System.out.print("informe a segunda nota : ");
		int numII = entrada.nextInt();
		
		if ((numII+numII)/2 >= 6) {
			System.out.println ("Você foi aprovado");
		}
		else{
			System.out.println ("Você foi reprovado");
		}
		
		entrada.close();
	}
}
