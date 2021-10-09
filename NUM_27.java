import java.util.Scanner;
public class NUM_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.print("Telefonou para a vítima? (sim - 1) (não - 2) : ");
		int numI= (int) entrada.nextInt();
		
		System.out.print("Esteve no local do crime?(sim)(não) : ");
		int numII = (int) entrada.nextInt();
		
		System.out.print("Mora perto da vítima?(sim)(não) : ");
		int numIII = (int) entrada.nextInt();
		
		System.out.print("Devia para a vítima? (sim)(não) : ");
		int numIV = (int) entrada.nextInt();
		
		System.out.print("Já trabalhou com a vítima? : ");
		int numV = (int) entrada.nextInt();
		
		if (numII==1) {
		System.out.println("Suspeita");
		}
		else if ((numIII == 1)|(numV == 1)){
			System.out.println("Cúmplice");
		}
			else if ((numV == 1)){
				System.out.println("Assassinho");
			}
			else {
				System.out.println("inocente");
		}
		entrada.close();
	}
}
