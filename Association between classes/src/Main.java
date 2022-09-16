public class Main {

	public static void main(String[] args) {	
		Jogador jogador = new Jogador("Neymar","atacante",10);		
		Jogador jogador2 = new Jogador("Messi","atacante",10);
		
		Time brasil = new Time("Brasil",5);
		Time argentina = new Time("Argentina",2);
		
		Estadio estadioBrasil = new Estadio("Manoel Schwartz","Rio de Janeiro");		
		
		Partida brasilXargentina = new Partida("05/09/2023","17:00",0,0,brasil,argentina,estadioBrasil);
		
		brasil.adicionarJogador(jogador);		
		argentina.adicionarJogador(jogador2);
		
		brasil.mostrarJogadores();
		argentina.mostrarJogadores();
		
		brasilXargentina.atualizarResultado(2,0);
		
		System.out.println(brasilXargentina);
	}
}