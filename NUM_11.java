import java.util.Scanner;
public class NUM_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Que turno você estuda? (M) = Matutino ; (V) Vespertino ; (N) Noturno : ");
		String letra = entrada.nextLine();

		if ((letra.equals("m"))) {
			System.out.println("Bom dia");
		}
		else {
			
			if ((letra.equals("v"))) { 
				System.out.print("Boa tarde");
			}
			else {			
			System.out.println ("Boa noite");
		    }
		}
		entrada.close();
	}
}
