import java.util.Scanner;
public class NUM_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe primeira nota do aluno: ");
		int numI= entrada.nextInt();
		
		System.out.print("Informe a segunda nota do aluno: ");
		int numII = entrada.nextInt();
		
		System.out.print("Informe a terceira nota do aluno: ");
		int numIII = entrada.nextInt();
		
		float media = (float) ((numI + numII+ numIII) / 3);
	
		if (media == 10) {
		System.out.println("Média: " + media + " : Aprovado com Distinção");
		}
        else if (media >=7)  {
		System.out.println("Média: " + media + " : Média alcançada (Aprovado)");
		}
		else {
		System.out.println("Média: " + media + " : Reprovado");
		}
		entrada.close();
	}

}
