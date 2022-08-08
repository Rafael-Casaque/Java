import java.util.Scanner;

public class Investimento {

	public static double calcularMontante(float capital, float taxa, int tempo){		
		return capital*Math.pow(1+taxa, tempo);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do capital aplicado: ");
		float capital = scan.nextFloat();
		System.out.println("Digite o valor da taxa de rendimento: ");
		float taxa = scan.nextFloat();
		System.out.println("Digite o tempo de investimento aplicado: ");
		int tempo = scan.nextInt();
		System.out.printf("Montante resultante: R$ %.2f",calcularMontante(capital, taxa, tempo));
	}
}