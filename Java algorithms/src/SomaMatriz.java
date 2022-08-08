import java.util.Scanner;

public class SomaMatriz {
		
	public static int[][] somarMatriz(int primeiraMatriz[][],int segundaMatriz[][],int x,int y){
		int [][]terceiraMatriz = new int [x][y];
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				terceiraMatriz[i][j] = primeiraMatriz[i][j] + segundaMatriz[i][j]; 
			}
		}
		return terceiraMatriz;
	}
	
	public static void imprimirMatriz(int matriz[][],int x,int y){
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				System.out.printf("\nConteudo da posicao [%d][%d] = %d",i,j,matriz[i][j]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int linhas,colunas;
		System.out.println("Digite a quantidade de linhas para formar a matriz: ");
		linhas = scan.nextInt();
		System.out.println("Digite a quantidade de colunas para formar a matriz: ");
		colunas = scan.nextInt();
		int [][]primeiraMatriz = new int [linhas][colunas]; 
		int [][]segundaMatriz = new int [linhas][colunas];		
		for(int i=0;i<linhas;i++){
			for(int j=0;j<colunas;j++){
				System.out.printf("Insira o elemento da posicao [%d][%d] na primeira matriz: ",i,j);
				primeiraMatriz[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<linhas;i++){
			for(int j=0;j<colunas;j++){
				System.out.printf("Insira o elemento da posicao [%d][%d] na segunda matriz: ",i,j);
				segundaMatriz[i][j] = scan.nextInt();
			}
		}
		
		int [][]terceiraMatriz = somarMatriz(primeiraMatriz, segundaMatriz, linhas, colunas);
		
		imprimirMatriz(terceiraMatriz, linhas, colunas);
	}
}
