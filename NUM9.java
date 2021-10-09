import java.util.Scanner;

public class NUM9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe seu sexo - Masculino (1) ; Feminino (2)");;
		int Sexo = entrada.nextInt();

		System.out.println("Informe seu peso");
		float peso = entrada.nextFloat();

		System.out.println("Informe sua altura");
		float altura = entrada.nextFloat();
		

		if (Sexo == 1) {

			float pesoideal = (float) ((altura * 72.7)-58);
			System.out.println("Altura : " + altura); 
			System.out.println("Peso : " + peso);
			System.out.println("Sexo : " + Sexo);
			System.out.println("Peso ideal : " + pesoideal);

			if (peso >=pesoideal) {
				System.out.println("Acima do peso ideal");
			}else
				System.out.println("Peso informado ideal");
		}
		else {
			
			float pesoideal = (float) ((altura * 62.1)-44.7);
			System.out.println("Altura : " + altura); 
			System.out.println("Peso : " + peso);
			System.out.println("Sexo : " + Sexo);
			System.out.println("Peso ideal : " + pesoideal);

			if (peso >=pesoideal) {
				System.out.println("Acima do peso ideal");
			}else
				System.out.println("Peso informado ideal");
		}
		entrada.close();
	}
}
