import java.util.Scanner;
public class NUM7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma numero : ");
		int numI = entrada.nextInt();
		if ((numI % 2) == 0) {
			System.out.println ("O numero digitado é par");
			System.out.println ("Numero convertido em impar" + (numI+(1)));
		}
		
		else{
			System.out.println("O número digitado é impar");
			System.out.println("número convertido em par é : " + (numI+(1)));
		}
		
		
		entrada.close();
	}
}
