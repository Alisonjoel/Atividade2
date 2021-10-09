import java.util.Scanner;
public class NUM_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("informe seu salário : ");
		Float salariobruto = entrada.nextFloat();


		if (salariobruto <= 280.00) {
			float salario = (float) (salariobruto + (salariobruto*0.20));
			System.out.println("salario sem reajuste : " + salariobruto);
			System.out.println("Percentual de aumento foi 20%");
			System.out.println("o valor do aumento foi : " + ((salario)-(salariobruto)));
			System.out.println("Novo salário: " + salario);
		}
		if ((salariobruto >= 280.00) && (salariobruto <= 700)) {
			float salario = (float) (salariobruto + (salariobruto*0.15));
			System.out.println("salario sem reajuste : " + salariobruto);
			System.out.println("Percentual de aumento foi 15%");
			System.out.println("o valor do aumento foi : " + ((salario)-(salariobruto)));
			System.out.println("Novo salário: " + salario);
		}
		if ((salariobruto >= 700.00) && (salariobruto <= 1500)) {
			float salario = (float) (salariobruto + (salariobruto*0.10));
			System.out.println("salario sem reajuste : " + salariobruto);
			System.out.println("Percentual de aumento foi 10%");
			System.out.println("o valor do aumento foi : " + ((salario)-(salariobruto)));
			System.out.println("Novo salário: " + salario);
		}
		else {
			float salario = (float) (salariobruto + (salariobruto*0.05));
			System.out.println("salario sem reajuste : " + salariobruto);
			System.out.println("Percentual de aumento foi 5%");
			System.out.println("o valor do aumento foi : " + ((salario)-(salariobruto)));
			System.out.println("Novo salário: " + salario);

		}

		entrada.close();
	}
}
