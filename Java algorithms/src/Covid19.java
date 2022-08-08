import java.util.Scanner;

public class Covid19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []arrayCasos = new int[7];
		float media=0;
		int count=0;
		for(int i=0;i<7;i++){
			System.out.printf("Insira a quantidade de casos do %d dia: ",i+1);
			arrayCasos[i] = scan.nextInt();
		}
		for(int casos:arrayCasos){
			media+=casos;
		}
		media = media/7;
		
		for(int casos:arrayCasos){
			if(casos>media){
				count++;
			}
		}
		System.out.printf("De acordo com as informações inseridas, em %d dia(s) a quantidade de casos foi maior que a media de casos",count);
	}
}