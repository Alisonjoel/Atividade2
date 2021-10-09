import java.util.Scanner;
public class NUM_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe um dia da semana : " + "|Domingo (1)" + "|Segunda (2)"
		+ "|Terça (3)"+"|Quarta (4)"+"|Quinta (5)"+"|Sexta (6)"+"|Sábado (7)");
		int dia = entrada.nextInt();
		
		if (dia ==1) {
		System.out.println("Domingo");
		}
		else if (dia ==2) { 
		System.out.println("Segunda");
		}
		else if (dia ==3) {
		System.out.println("Terça");
		}
		else if (dia ==4) {
		System.out.println("Quarta");
		}
		else if (dia ==5) {
		System.out.println("Quinta");
		}
		else if (dia ==6) {
		System.out.println("Sexta");
		}
		else if (dia ==7) {
		System.out.println("Sábado");
	    }
		else {
			System.out.print("Valor inválido");
		}
		
		entrada.close();	
	}
}
	
