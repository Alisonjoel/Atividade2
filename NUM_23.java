import java.util.Scanner;

public class NUM_23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a idade do primeiro aluno: ");
		int numI = entrada.nextInt();
		
		System.out.print("Informe a idade do segundo aluno: ");
		int numII = entrada.nextInt();
		
		System.out.print("Informe a idade do terceiro aluno: ");
		int numIII = entrada.nextInt();
		
		float media = (float) ((numI + numII + numIII) / 3);

		if (media < 25) {
			System.out.println("Turma Jovem");
		}
		else if ((media > 25) && (media <= 40)) {
			System.out.println("Turma Adulta");
		}
		else {
			System.out.println("Turma Idosa");
		}
		entrada.close();
	}
}
