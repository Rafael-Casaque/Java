import java.util.Scanner;

public class Triangulos {
	
	public static boolean verificaTriangulo(float a, float b, float c){
		if(a+b>c && a+c>b && b+c>a){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String tipoTriangulo(float a, float b, float c){
		if(a==b && b==c && a==c){
			return "Triangulo Equilatero";
		}
		else if(a!=b && b!=c && c!=a){
			return "Triangulo Escaleno";
		}
		else {
			return "Triangulo Isosceles";
		}		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro lado do triangulo: ");
		float a = scan.nextFloat();
		System.out.println("Digite o segundo lado do triangulo: ");
		float b = scan.nextFloat();
		System.out.println("Digite o terceiro lado do triangulo: ");
		float c = scan.nextFloat();
		if(verificaTriangulo(a, b, c)==false){
			System.out.println("As medidas informadas nao podem formar um triangulo");
		}
		else{
			System.out.println("As medidas informadas resultam em um "+tipoTriangulo(a, b, c));
		}
	}
}