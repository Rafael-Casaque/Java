import java.util.ArrayList;
import java.util.Objects;

public class Time {
	private String pais;
	private int quantidadeTitulos;	
	private ArrayList<Jogador> jogadores = new ArrayList<>();
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getQuantidadeTitulos() {
		return quantidadeTitulos;
	}
	public void setQuantidadeTitulos(int quantidadeTitulos) {
		this.quantidadeTitulos = quantidadeTitulos;
	}
	
	public Time(String pais, int quantidadeTitulos) {		
		this.pais = pais;
		this.quantidadeTitulos = quantidadeTitulos;
	}
	public Time() {
		
	}		
	
	@Override
	public String toString() {
		return "Time [pais=" + pais + ", quantidadeTitulos=" + quantidadeTitulos + "]";
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(pais, quantidadeTitulos);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return Objects.equals(pais, other.pais) && quantidadeTitulos == other.quantidadeTitulos;
	}
	
	void adicionarJogador(Jogador novoJogador) {
		jogadores.add(novoJogador);
	}
	void removerJogador(Jogador novoJogador) {
		jogadores.remove(novoJogador);
	}
	void mostrarJogadores() {
		for(Jogador j:jogadores)
			System.out.println("Jogador: "+j.getNome()+
							   "\nCamisa: "+j.getNumeroCamisa()+
							   "\nPosicao: "+j.getPosicao()+"\n");		
	}
}
